
package BEAN;

import DAO.DaoConsulta;
import java.sql.ResultSet;


public class BeanConsulta {
    //instanciamdo al paquete DAO
    DAO.DaoConsulta ins = new DaoConsulta();
    
    //Regla de negocio
        public ResultSet consulta1(String codigo_cliente){
             return ins.consulta1(codigo_cliente);
        }
}
