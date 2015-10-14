package Linea_base;
import Conexiones.Conexion;
import javax.swing.JOptionPane;


/**
 * @author Administrador
 * @version 1.0
 * @created 13-oct-2015 12:05:10 PM
 */
public class Itinerario {

    private int intId_itinerario;
    private String strCiudad;

    Conexion conex = new Conexion();


    public void finalize() throws Throwable {

    }

    // <editor-fold desc="Construcotres de la clase." defaultstate="collapsed">
        public void Itinerario(){

        }

        /**
	 * 
	 * @param intId_itinerario
	 */
        public void Itinerario(int intId_itinerario){

        }

        /**
        * 
        * @param intId_itinerario
        * @param strCiudad
        */
        public void Itinerario(int intId_itinerario, String strCiudad){

        }
    // </editor-fold>

    // <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">      
        public int getintId_itinerario(){
        return intId_itinerario;
        }

        public String getstrCiudad(){
        return strCiudad;
        }
    // </editor-fold>

    // <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">
        /**
	 * 
	 * @param newVal
	 */
        public void setintId_itinerario(int newVal){
        intId_itinerario = newVal;
        }

        /**
	 * 
	 * @param newVal
	 */
        public void setstrCiudad(String newVal){
        strCiudad = newVal;
        }
    // </editor-fold>

    // <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
        /**
            * 
            * @param IntId_itinerario
            */
        public void CrudConsultar(int IntId_itinerario){
            String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Itinerarios WHERE Id_Itinerario= '" + intId_itinerario + "';"));

            System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]);

        }

        /**
            * 
            * @param strCiudad
            */
        public void CrudInsertar(String strCiudad){

            String query = " insert into Itinerarios (Ciudad)"
            + " values "+"('"+strCiudad+"')";

            conex.queryUpdate(query);
        }

        /**
        * 
        * @param intId_itinerario
        * @param strCiudad
        */
        public void CrudActualizar(int intId_itinerario, String strCiudad){

            String query = " UPDATE Itinerarios SET Id_Itinerario='"+ intId_itinerario +"', Ciudad='"+ strCiudad +"'";

            conex.queryUpdate(query);

        }

        /**
        * 
        * @param intId_itinerario
        * @param strCiudad
        */
        public void CrudListar(int intId_itinerario, String strCiudad){

        }
    // </editor-fold>

}