package DAO;
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class DaoConsulta {
    //creando instancia a la conexion
    public static Conexion.Conecta cn=new Conexion.Conecta();
    //funcion consulta
    public ResultSet consulta1(String codigo_cliente){
        ResultSet rs=null;
        try{
        String sql="select * from orders where customerid='" +
            codigo_cliente + "'";
        Statement stmt=null;
        stmt=cn.xcon().createStatement();
        rs=stmt.executeQuery(sql);            
        }catch(Exception error1){
            JOptionPane.showMessageDialog(null,error1);
        }
        return rs;
    }
    
    public ResultSet consulta2(int numero_orden){
        
           ResultSet rs=null;
        try{
     String sql="select * from [order details] where orderid=" +
            numero_orden ;        
        Statement stmt=null;
        stmt=cn.xcon().createStatement();
        rs=stmt.executeQuery(sql);            
        }catch(Exception error1){
            JOptionPane.showMessageDialog(null,error1);
        }
        return rs;        
    }
    
    
}
