
package server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Server extends javax.swing.JFrame {

    /** Creates new form Server */
    public Server() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Bill Buddy");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server/bill buddy 1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Phone Number");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server/phone.png"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("Check Balance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton2.setText("Deposit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton3.setText("Withdraw");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton4.setText("Send Password");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton5.setText("Delete Account");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton6.setText("View Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(66, 66, 66)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        String Number = jTextField1.getText();
        DB database = new DB();
        
        if (Number.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter the phone number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else 
        {
            int val = 0;
        
            try
            {
            ResultSet result = database.select("Select phone_number from users");
            
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
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (val == 1)
            {
            
                try
                {
                    ResultSet res = database.select("Select iiitd_email, name, phone_number from users where phone_number =" + '"' + Number + '"');

                    while (res.next())
                    {
                        JOptionPane.showMessageDialog(null, "IIIT-D email: " + res.getString(1) + "\nName: " + res.getString(2) + "\nPhone Number: " + res.getString(3), "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                } 
                
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                
        String Number = jTextField1.getText();
        DB database = new DB();
        
        if (Number.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter the phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else 
        {
            int val = 0;

            try 
            {
                ResultSet result = database.select("Select phone_number from users");
        
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
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (val == 1) 
            {
            
                try 
                {
                    ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                    while (bal.next()) 
                    {
                        int balance = bal.getInt(1);
                        JOptionPane.showMessageDialog(null, "Current Balance now is " + balance, "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                } 
                
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            
        String Number = jTextField1.getText();
        DB database = new DB();
       
        if (Number.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter the phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else 
        {
            int val = 0;
        
            try
            {
            ResultSet result = database.select("Select phone_number from users");
            
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
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (val == 1) 
            {
                JTextField amt = new JTextField();
                final JComponent[] input1 = new JComponent[]
                        {
                    new JLabel("Enter the amount you want to withdraw: "), amt
                };
                JOptionPane.showMessageDialog(null, input1, "Amount", JOptionPane.QUESTION_MESSAGE);
            
                if (amt.getText().length() == 0) 
                {
                    JOptionPane.showMessageDialog(null, "Please enter the amount", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                else 
                {
                    int amount = Integer.parseInt(amt.getText());
                    int balance = 0;
                    //System.out.println(amount);
                
                    try 
                    {
                        ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                        while (bal.next()) 
                        {
                            balance = bal.getInt(1);
                        }
                    }
                    
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    int value;
                    balance = balance - amount;
                    
                    
                    if (balance <= 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Cannot withdraw, balance not sufficient", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                    
                    else 
                    {
                        value = database.update("Update users set balance =" + '"' + balance + '"' + "where phone_number=" + '"' + Number + '"');
                    }


                    try 
                    {
                        ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                        while (bal.next()) 
                        {
                            balance = bal.getInt(1);
                            JOptionPane.showMessageDialog(null, "Current Balance now is " + balance, "Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } 
                    
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } 
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
              
        String Number = jTextField1.getText();
        DB database = new DB();
        
        if (Number.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter the phone number", "Error", JOptionPane.ERROR_MESSAGE);
        }
                
        else 
        {
            int val = 0;
            ResultSet result = database.select("Select phone_number from users");
            
            try 
            {
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
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (val == 1) 
            {
                JTextField amt = new JTextField();
                final JComponent[] input1 = new JComponent[]
                        {
                    new JLabel("Enter the amount you want to deposit: "), amt
                };
                JOptionPane.showMessageDialog(null, input1, "Amount", JOptionPane.QUESTION_MESSAGE);
                
                if (amt.getText().length() == 0) 
                {
                    JOptionPane.showMessageDialog(null, "Please enter the amount", "Error", JOptionPane.ERROR_MESSAGE);
                }
                        
                else 
                {
                    
                    int amount = Integer.parseInt(amt.getText());
                    int balance = 0;
                    //System.out.println(amount);
                   
                    try 
                    {
                        ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                        while (bal.next()) 
                        {
                            balance = bal.getInt(1);
                        }
                    }
                            
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    balance = balance + amount;
                    int value = database.update("Update users set balance =" + '"' + balance + '"' + "where phone_number=" + '"' + Number + '"');

                    try 
                    {
                        ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                        while (bal.next()) 
                        {
                            balance = bal.getInt(1);
                            JOptionPane.showMessageDialog(null, "Current Balance now is " + balance, "Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                            
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
                    
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String Number = jTextField1.getText();
        DB database = new DB();
        
        if (Number.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter the phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else 
        {
            int val = 0;
            try
            {
                ResultSet result = database.select("Select phone_number from users");
        
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
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (val == 1) 
            {
                String to = null;
                String passwrd = null;
                ResultSet pass= null;
            
                try 
                {
                
                    try 
                    {
                        pass = database.select("Select iiitd_email, phone_password from users where phone_number =" + '"' + Number + '"');

                        while (pass.next()) 
                        {
                            to = pass.getString(1);
                            passwrd = pass.getString(2);
                            
                        }
                    } 
                    
                    finally
                    {
                    
                        if(pass==null)
                        {
                            JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                                        
                    String host = "smtp.gmail.com";
                    String from = "my.bill.buddy.11@gmail.com";
                    String passw = "mybillbuddy";
                    Properties props = System.getProperties();
                    props.put("mail.smtp.starttls.enable", "true"); 
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.user", from);
                    props.put("mail.smtp.password", passw);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");


                    Session session = Session.getDefaultInstance(props, null);
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(from));

                    InternetAddress toAddress = new InternetAddress();

                    toAddress = new InternetAddress(to);
                    
                    System.out.println(Message.RecipientType.TO);

                    message.addRecipient(Message.RecipientType.TO, toAddress);
                    
                    message.setSubject("Password: MY BILL BUDDY");
                    message.setText("\nDear User,\n\nYour phone password for My Bill Buddy is\n\n" + passwrd + "\n\n\n\nMy Bill Buddy Team");
                    Transport transport = session.getTransport("smtp");
                    transport.connect(host, from, passw);
                    transport.sendMessage(message, message.getAllRecipients());
                    transport.close();
                    JOptionPane.showMessageDialog(null, "Passowrd sent successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                } 
                        
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, "Error Sending Email", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String Number = jTextField1.getText();
        DB database = new DB();
        
        if (Number.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Please enter the phone number", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else 
        {
            int val = 0;

            try 
            {
                ResultSet result = database.select("Select phone_number from users");
        
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
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (val == 1) 
            {
                JOptionPane pane = new JOptionPane("Are you sure you want to delete the account?",JOptionPane.QUESTION_MESSAGE);
                Object[] options = new String[]{"Yes", "No"};
                pane.setOptions(options);
                JDialog dialog = pane.createDialog(new JFrame(), "Delete Account");
                dialog.show();
                Object obj = pane.getValue();
                int res = -1;
            
                for (int k = 0; k < options.length; k++) 
                {
                    if (options[k].equals(obj)) 
                    {
                        res = k;
                    }
                }
                
                System.out.println("User's choice: " + res);
                
                if (res == 0) 
                {
                
                    try 
                    {
                        ResultSet bal = database.select("Select balance from users where phone_number =" + '"' + Number + '"');

                        while (bal.next()) 
                        {
                            int balance = bal.getInt(1);
                            JOptionPane.showMessageDialog(null, "Current Balance now is " + balance, "Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                        int rs = database.update("Delete from users where phone_number =" + '"' + Number + '"');

                        if (rs == 1) 
                        {
                            JOptionPane.showMessageDialog(null, "Deleted Succesfully", "Error", JOptionPane.ERROR_MESSAGE);
                        } 
                        
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Deletion Failed", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
