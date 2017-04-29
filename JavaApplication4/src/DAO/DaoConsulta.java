
package DAO;
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;

public class DaoConsulta {
    //creando una instancia a la conexion
    public static Conexion.Conecta cn=new Conexion.Conecta();
    
    //funcion consulta
    public ResultSet consulta1(String codigo_cliente){
            ResultSet rs=null;
    try{
        String sql = "select * from orders where customerid ='"+codigo_cliente+"'";
        Statement stmt = null;
        stmt = cn.xcon().createStatement();
        rs = stmt.executeQuery(sql);
    }catch(Exception error){
        JOptionPane.showMessageDialog(null, error);
    }
    return rs;
    }
    
    public ResultSet consulta2(int numero_orden){
        ResultSet rs=null;
    try{
        String sql = "select * from [order details] where orderid ='"+numero_orden+"'";
        Statement stmt = null;
        stmt = cn.xcon().createStatement();
        rs = stmt.executeQuery(sql);
    }catch(Exception error){
        JOptionPane.showMessageDialog(null, error);
    }
    return rs;
     }
    }

