/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import Linea_base.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Entrega5 {
    
    public Entrega5(){}
    
    public int menuprincipal(){
        int op=0;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\tOpciones\n\n"+
                "1.-Consultar\n"+
                "2.-Insertar\n"+
                "3.-Actualizar\n"+
                "4.-Listar\n"+
                "5.-Salir\n"));
        }while(op<1||op>8);
        return op;
    }
    
    public int menucrud(){
        int op=0;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"\n ¿En que tabla desea opearar?\n\n"+
                "1.-Tabla Aerolinea.\n"+
                "2.-Tabla Ciudad.\n"+
                "3.-Tabla Cliente.\n"+
                "4.-Tabla Contacto.\n"+
                "5.-Tabla Empleado.\n"+
                "6.-Tabla Plan.\n"+
                "7.-Tabla Reserva.\n"+
                "8.-Tabla TipoDocumento.\n"+
                "9.-Tabla Tiquete.\n!"+
                "10.-Atrás.\n"+
                "Digite opcion"));
        }while(op<1||op>8);
        return op;
    }
    
    public int Entrega5realiza(){
        
        boolean salida = false, atras = false;
        
        while(!salida){
            switch(menuprincipal()){
                case 1://-Consultar
                    switch (menucrud()) {
                        
                        case 1://-Tabla Aerolinea.
                        break;
                        case 2://-Tabla Ciudad.
                        break;
                        case 3://-Tabla Cliente.
                        break;
                        case 4://-Tabla Contacto.
                        break;
                        case 5://-Tabla Empleado.
                        break;
                        case 6://-Tabla Plan.
                        break;
                        case 7://-Tabla Reserva.
                        break;
                        case 8://-Tabla TipoDocumento.
                        break;
                        case 9://-Tabla Tiquete.             
                        break;

                        default://.-Atrás.
                            atras = true;
                            throw new AssertionError();
                    }

                break;

                case 2://-Insertar
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

                break;

                case 3://-Actualizar

                break;

                case 4://-Listar

                break;

                case 5://-Salir
                    salida = true;
                break;
            }
        }
        
    }
    
    
}
