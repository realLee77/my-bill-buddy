/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Pri
 */
import java.sql.*;

public class DB{
  public static void main(String[] args) {
  System.out.println("MySQL Connect Example.");
  Connection conn = null;
  String url = "jdbc:mysql://localhost/";
  String dbName = "SE_1";
  //String driver = "com.mysql.jdbc.Driver";
  String userName = "root"; 
  String password = "qwerty";
  try {
  //Class.forName(driver).newInstance();
  conn = DriverManager.getConnection(url+dbName,userName,password);
  System.out.println("Connected to the database");
  Statement st = conn.createStatement();
  int val = st.executeUpdate("INSERT into balance VALUES("+"'Priyanshi'"+","+"100)");
  System.out.println("1 row affected");
  conn.close();
  System.out.println("Disconnected from database");
  } catch (Exception e) {
  e.printStackTrace();
  }
  }
}