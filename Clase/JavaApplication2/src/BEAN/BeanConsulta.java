
package BEAN;
import java.sql.*;
import java.io.*;
public class BeanConsulta {
    //instanciando al paquete DAO
    DAO.DaoConsulta ins=new  DAO.DaoConsulta();
    //regla de negocio
       public ResultSet consulta1(String codigo_cliente){
           return ins.consulta1(codigo_cliente);
       } 
       //--invocar la segunda consulta
        public ResultSet consulta2(int numero_orden){
            return ins.consulta2(numero_orden);
        }
}
