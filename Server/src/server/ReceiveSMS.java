
package server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class ReceiveSMS 
{

    public static String ReceiveMessage() 
    {

        String message = "";
        File directory = new File("D:/test/");
        File files[] = directory.listFiles();
        File f = files[0];
        System.out.println(f.getName());

        try 
        {
            FileInputStream fstream = new FileInputStream(f);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            

            while ((strLine = br.readLine()) != null) 
            {
                message = message + strLine;
                //System.out.println (strLine);
            }
            System.out.println("message: "+message);
        }
        
        catch (Exception ex) 
        {
            System.out.println("Error in recieving");
        }

        boolean delete = f.delete();
        return message;
    }
}
