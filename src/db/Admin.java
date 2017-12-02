package db;

import java.sql.*;

public class Admin {
     public static Connection connect(String usr,String ps,String host) throws Exception
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     return DriverManager.getConnection("jdbc:oracle:thin:@"+host+":1521:xe",""+usr,""+ps);
   }
   public static Connection connectM(String usr,String ps,String host,String dbnm) throws Exception
   {
     Class.forName("com.mysql.jdbc.Driver");
     return DriverManager.getConnection("jdbc:mysql://"+host+":3306/"+dbnm,""+usr,""+ps);
   }    
}
