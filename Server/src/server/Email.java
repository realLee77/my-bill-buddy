
package server;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email 
{

    public static int check(String email) 
    {

        int res = -1;
        if (!email.endsWith("@iiitd.ac.in")) 
        {
            res = 0;
            return res;
        }
        
        else
        {
            try 
            {
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

                String to = email;
                Session session = Session.getDefaultInstance(props, null);
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));

                InternetAddress toAddress = new InternetAddress();

                toAddress = new InternetAddress(to);

                System.out.println(Message.RecipientType.TO);

                message.addRecipient(Message.RecipientType.TO, toAddress);

                message.setSubject("Registration: MY BILL BUDDY");
                message.setText("\nDear User,\n\nYour registration is in process, You will recieve a SMS shortly.\n\n" + "\n\n\n\nMy Bill Buddy Team");
                Transport transport = session.getTransport("smtp");
                transport.connect(host, from, passw);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                res = 1;
                return res;      
            }
        
            catch (Exception ex) 
            {
                res = 0;
                return res;
            }
        }
    }
}
