
package server;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SendSMS 
{

    public static void SendMessage(String number, String message) 
    {

        try 
        {
             
            String outf = "out" + ".txt";
            FileWriter fstream = new FileWriter(outf);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("To: " + number);
            out.write("   "+ message);
            System.out.println("Send SMS: "+message);


            File file = new File(outf);

            File dir = new File("D:/test/test2");

            boolean success = file.renameTo(new File(dir, file.getName()));
            
        }
        
        catch (Exception e) 
        {
            System.err.println("Error in sending");
        }
    }
}
