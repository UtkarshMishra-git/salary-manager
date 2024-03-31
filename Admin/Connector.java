/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Utkarsh
 */
public class Connector {
  public Connection getConnection()
  {
      
      try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emprecords","root","utkarsh@123");    
       return con;
      }
      catch(Exception e){   
          return null;
      }
      
  }
    
}
