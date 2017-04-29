
package Conexion;
//conectandose a sql server
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conecta {
    //creando una funcion publica de conexion    
    public Connection xcon(){
        Connection cn=null;
     try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   cn=DriverManager.getConnection
  ("jdbc:sqlserver://10.60.41.30:1433;databaseName=Northwind;",
   "idat","123456");
   if(cn!=null)         {
       JOptionPane.showMessageDialog(null,"Conexion Ok..");
   }
     }catch(Exception error){
       JOptionPane.showMessageDialog(null,error); 
     }
     return cn;
    }       
}
