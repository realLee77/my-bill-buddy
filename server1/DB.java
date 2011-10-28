/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Pri
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB{
  public static Connection conn = null;

  public static void main() {
  System.out.println("MySQL Connect Example.");
  
  String url = "jdbc:mysql://localhost/";
    String dbName = "SE_1";
  //String driver = "com.mysql.jdbc.Driver";
  String userName = "root"; 
  String password = "qwerty";
  try {
  //Class.forName(driver).newInstance();
  conn = DriverManager.getConnection(url+dbName,userName,password);
  System.out.println("Connected to the database");
  } catch (Exception e) {
  e.printStackTrace();
  }
  }
  
  public  int update(String query)
  {
      int val=0;
      main();
        try 
        {
            Statement st = conn.createStatement();
            val = st.executeUpdate(query);
          
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
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
      catch (SQLException ex)
        {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
      return result;
  }
  }
