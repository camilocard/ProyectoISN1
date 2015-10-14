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
        
        Conexion conex = new Conexion();
        
        
        
        String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Clientes WHERE Id_Cliente=1;"));
        
        System.out.println("El registro es: " + res[0][0] + "-" + res[0][1] + "-" + res[0][2]);
        
        // TODO code application logic here
        
        Aerolineas a = new Aerolineas();
        
       a.CrudConsultar(1);
    }
    
}
