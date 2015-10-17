/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajesnacionales;
import Linea_base.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Principal {
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        // <editor-fold desc="Objetos de viajes nacionales." defaultstate="collapsed">
            int entero = 0;
            String Cuerdas = "";

            // Prueba de Tabla aerolinea
            Aerolinea a = new Aerolinea();
            a.CrudConsultar(entero);
            a.CrudInsertar(Cuerdas);

            //Prueba de tabla Ciudad
            Ciudad city = new Ciudad();
            city.CrudConsultar(1);

            city.CrudActualizar(entero,Cuerdas);

            //
            Cliente c = new Cliente();
            c.CrudConsultar(entero);
            c.CrudInsertar("Mario", "Roberto", "Samudio", "Martinez","04/10/1986", true, "1015397065", 4);
            c.CrudActualizar(101, "Laura", "Maria", "Paramo", "Torres", "30/01/1998", false, "1015395", 6);

            //
            Contacto con =new Contacto();

            con.CrudConsultar(intId_Contacto);
            con.CrudInsertar(intCliente, intEmpleado, null, null, null, null);
            con.CrudActualizar(intId_Contacto, intCliente, intEmpleado, null, null, null, null);

            //
            Empleado e = new Empleado();
            e.CrudConsultar(intId_empleado);
            e.CrudInsertar(null, null, null, null, null, null, true, null, null);
            e.CrudActualizar(intId_empleado, null, null, null, null, null, true, null, null, null);


            //
            Plan p = new Plan();
            p.CrudConsultar(1);
            p.CrudInsertar(null, intCosto);
            p.CrudActualizar(intid_plan, null, intCosto);


            //
            Reserva r = new Reserva();
    //        r.CrudActualizar(intId_reserva, intNum_Reserva, intPlan_escogido, null, null, intCliente_que_reserva, intEmpledo);
    //        r.CrudInsertar(13, 2, "12/04/2015", "11/05",11, 1);

            //
            TipoDocumento tpdoc = new TipoDocumento();


            //
            Tiquete ticket = new Tiquete();
        // </editor-fold>
        
        
        
        
        
    }   
}
