
package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DB 
{

    public static Connection conn = null;

    public static void main() 
    {

        String url = "jdbc:mysql://localhost/";
        String dbName = "SE_1";
        //String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "qwerty";
        
        try 
        {
            //Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected to the database");
        } 
        
        catch (Exception e) 
        {
            System.out.println("Problem connecting to the database");
        }
    }

    public int update(String query) 
    {
        int val = 0;
        main();
        
        try 
        {
            Statement st = conn.createStatement();
            val = st.executeUpdate(query);

        }
        
        finally 
        {
            return val;
        }
    }

    public ResultSet select(String query) 
    {
        main();
        ResultSet result = null;
        
        try 
        {
            Statement st = conn.createStatement();
            result = st.executeQuery(query);

        } 
        
        finally 
        {
            return result;
        }
    }
}
