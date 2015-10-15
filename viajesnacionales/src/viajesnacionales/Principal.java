/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajesnacionales;
import Conexiones.Conexion;
import Linea_base.*;
import java.sql.*;

/**
 *
 * @author Mario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Conexion conex = new Conexion();
        
        
        
        
//        
//        String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Clientes WHERE Id_Cliente=1;"));
//        
//        System.out.println("El registro es: " + res[0][0] + "-" + res[0][1] + "-" + res[0][2]);
//        
//        // TODO code application logic here
//        
////        Aerolineas a = new Aerolineas();
////        
////       a.CrudConsultar(1);
////       a.CrudInsertar(null);
//       
//       Cliente c = new Cliente();
//       c.CrudConsultar(11);
////       c.CrudInsertar(null, null, null, null, null, true, null, null);
//       c.CrudActualizar(101 "Laura", "Maria", "Paramo", "Torres", "30/01/1998", false, "1015395", "C.C.");
//       
//       Contacto con =new Contacto();
//       
//       con.CrudConsultar(intId_Contacto);
//       con.CrudInsertar(intCliente, intEmpleado, null, null, null, null);
//       con.CrudActualizar(intId_Contacto, intCliente, intEmpleado, null, null, null, null);
//       
//       Empleado e = new Empleado();
//       e.CrudConsultar(intId_empleado);
//       e.CrudInsertar(null, null, null, null, null, null, true, null, null);
//       e.CrudActualizar(intId_empleado, null, null, null, null, null, true, null, null, null);
//       
//       Itinerario i = new Itinerario();
//       i.CrudConsultar(IntId_itinerario);
//       i.CrudInsertar(null);
//       i.CrudActualizar(intId_itinerario, null);
//       
//       Planes p = new Planes();
//       p.CrudConsultar(intid_plan);
//       p.CrudInsertar(null, intCosto);
//       p.CrudActualizar(intid_plan, null, intCosto);
//       
       Reserva r = new Reserva();
//       r.CrudActualizar(intId_reserva, intNum_Reserva, intPlan_escogido, null, null, intCliente_que_reserva, intEmpledo);
       r.CrudInsertar(13, 2, "12/04/2015", "11/05",11, 1);
  
    }
    
}
