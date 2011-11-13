package server;

import java.sql.ResultSet;
import java.sql.SQLException;

public class server2 
{

    public static void main(String args[]) throws SQLException 
    {
        //while (true) 
        //{
            String message = ReceiveSMS.ReceiveMessage();
            process(message);
        //}
    }

    public static void process(String message)
    {
        DB database = new DB();
        
        if (message.startsWith("mbb_REG")) 
        {
            String[] msg = message.split("_");
            String email = msg[2];
            String name = msg[3];
            String phonenum = msg[4];
            String pass = msg[5];
            int bal = 0;
            int val = 0;
            int res = 0;
            int reg = -1;
            
            try 
            {
                ResultSet result = database.select("Select phone_number from users");

                while (result.next()) 
                {

                    if (result.getString(1).equalsIgnoreCase(phonenum))
                    {
                        reg = 1;
                        break;
                    }
                            
                    else 
                    {
                        reg = 0;
                    }
                    
                }
            }
                
            catch (SQLException ex) 
            {
                SendSMS.SendMessage(phonenum, "Error in database, please try again later");
            }
                
          
            if(reg==1)           
            {
                SendSMS.SendMessage(phonenum, "Phone number already registered");
            } 
            
            else
            {
            
                try 
                {
                    res = Email.check(email);
                    
                    if(res==1)
                    {
                        val = database.update("Insert into users values(" + "\"" + email + "\",\"" + name + "\",\"" + phonenum + "\",\"" + pass + "\"," + Integer.toString(bal) + ")");
                    }
                }

                finally 
                {
                    if (res == 0) 
                    {
                        SendSMS.SendMessage(phonenum, "Invalid Email Address");
                    }

                    else if (val == 0) 
                    {
                        SendSMS.SendMessage(phonenum, "Error in database, please try again later");
                    }

                    else if (val == 1 && res == 1) 
                    {
                        SendSMS.SendMessage(phonenum, "Login Successful, please deposit th initial amount to complete the registration process");
                    }

                }
            }
        }
        
        if (message.startsWith("mbb_PAY")) 
        {
            String[] msg = message.split("_");
            String rec = msg[2];
            String amt = msg[3];
            String send = msg[4];
            int amount = Integer.parseInt(amt);
            int balance = 0;
            int balance_rec = 0;
            int val_send = -1;
            int val_rec = -1;
            //System.out.println(amount);
            try 
            {
                ResultSet result = database.select("Select phone_number from users");

                while (result.next()) 
                {

                    if (result.getString(1).equalsIgnoreCase(send))
                    {
                        val_send = 1;
                        
                        break;
                    }
                    
                    else 
                    {
                        val_send = 0;
                        
                    }

                }

                result = database.select("Select phone_number from users");

                while (result.next()) 
                {

                    if (result.getString(1).equalsIgnoreCase(rec))
                    {
                        
                        val_rec = 1;
                        break;
                    }
                    
                    else 
                    {
                        
                        val_rec = 0;
                    }

                }
            } 
            
            catch (SQLException ex) 
            {
                SendSMS.SendMessage(send, "Error in database, please try again later");
            }
            
            if (val_send == 1 && val_rec == 1) 
            {
                
                try 
                {
                    ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + send + '"');

                    while (bal.next()) 
                    {
                        balance = bal.getInt(1);
                    }
                    
                    bal = database.select("Select balance from users where phone_number =" + '"' + rec + '"');

                    while (bal.next()) 
                    {
                        balance_rec = bal.getInt(1);
                    }
                }
                catch (SQLException ex) 
                {
                    SendSMS.SendMessage(send, "Error in database, please try again later");
                }

                int value_send = -1;
                int value_rec = -1;
                balance = balance - amount;
                balance_rec = balance_rec + amount;


                if (balance <= 0) 
                {
                    SendSMS.SendMessage(send, "Cannot make the transaction, balace not sufficient");
                }
                
                else 
                {
                    value_send = database.update("Update users set balance =" + '"' + balance + '"' + "where phone_number=" + '"' + send + '"');
                    value_rec = database.update("Update users set balance =" + '"' + balance_rec + '"' + "where phone_number=" + '"' + rec + '"');

                    if (value_send == 0 && value_rec == 0) 
                    {
                        SendSMS.SendMessage(send, "Cannot make the transaction, please try again later");
                    } 
                    
                    else if (value_rec == 1 && value_send == 0) 
                    {
                        value_rec = database.update("Update users set balance =" + '"' + (balance_rec - amount) + '"' + "where phone_number=" + '"' + rec + '"');
                        SendSMS.SendMessage(send, "Cannot make the transaction, please try again later");
                    }
                    
                    else if (value_rec == 1 && value_send == 0) 
                    {
                        value_send = database.update("Update users set balance =" + '"' + (balance + amount) + '"' + "where phone_number=" + '"' + send + '"');
                        SendSMS.SendMessage(send, "Cannot make the transaction, please try again later");
                    }
                    
                    else 
                    {
                        
                        try 
                        {
                            ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + send + '"');

                            while (bal.next()) 
                            {
                                balance = bal.getInt(1);
                            }
                            
                            SendSMS.SendMessage(send,"Transaction Successful! Your current balace is " + balance);
                        

                            bal = database.select("Select balance from users where phone_number =" + '"' + rec + '"');

                            while (bal.next()) 
                            {
                                balance = bal.getInt(1);
                            }
                            
                            bal = database.select("Select name from users where phone_number =" + '"' + send + '"');

                            String name = null;
                            while (bal.next()) 
                            {
                                name = bal.getString(1);
                            }

                            SendSMS.SendMessage(rec, name + " paid you Rs. " + amount + "Your current account balance is " + balance);
                        } 
                        
                        catch (SQLException ex) 
                        {
                            SendSMS.SendMessage(send, "Error in database, please try again later");
                        }
                    }
                }

            }
            
            else 
            {
                SendSMS.SendMessage(send, "Your or the person you are paying is not a registered user.\nOr you have entered incorrect phone number.");
            }
        }

        if (message.startsWith("mbb_CBAL")) 
        {
            String[] msg = message.split("_");
            String Number = msg[2];
            int val = 0;
            ResultSet result = null;
            
            try 
            {
                result = database.select("Select phone_number from users");
                while (result.next()) 
                {
                    if (result.getString(1).equalsIgnoreCase(Number)) 
                    {
                        val = 1;
                        break;
                    }
                    
                    else 
                    {
                        val = 0;
                    }
                }
            }
            
            catch (SQLException ex) 
            {
                SendSMS.SendMessage(Number, "Error in database, please try again later");
            }
            
            finally 
            {
               
                if (result == null) 
                {
                    SendSMS.SendMessage(Number, "Cannot access database right now, please try again later");
                } 
                
                else if (val == 0)
                {
                    SendSMS.SendMessage(Number, "Phone number not registered, please register first");
                } 
                
                else if (val == 1)
                {
                    ResultSet bal = null;
                    
                    try 
                    {
                        bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                        while (bal.next()) 
                        {
                            int balance = bal.getInt(1);
                            SendSMS.SendMessage(Number, "Current balane is" + balance);
                        }
                    } 
                    
                    catch (SQLException ex) 
                    {
                        SendSMS.SendMessage(Number, "Error in database, please try again later");
                    }
                    
                    finally
                    {
                        if (bal == null)
                        {
                            SendSMS.SendMessage(Number, "Cannot access database right now, please try again later");
                        }
                    }
                }
            }
        }
    }
}
