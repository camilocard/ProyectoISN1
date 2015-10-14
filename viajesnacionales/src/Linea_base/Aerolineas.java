package Linea_base;
import Conexiones.Conexion;
import javax.swing.JOptionPane;

/**
 * @author Administrador
 * @version 1.0
 * @created 13-oct-2015 12:05:10 PM
 */
public class Aerolineas {

    private int IntId_Aerolinea;
    private String strNombre_aerolinea;
    Conexion conex = new Conexion();



    public void finalize() throws Throwable {

    }

    // <editor-fold desc="Constructores de la clase." defaultstate="collapsed">
        public void Aerolineas(){

        }

        /**
    	 * 
    	 * @param IntId_Aerolinea
    	 */
        public void Aerolineas(int IntId_Aerolinea){

        }

        /**
    	 * 
    	 * @param IntId_Aerolinea
    	 * @param strNombre_aerolinea
    	 */
        public void Aerolineas(int IntId_Aerolinea, String strNombre_aerolinea){

        }
    // </editor-fold>

    // <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">
        public int getIntId_Aerolinea(){
            return IntId_Aerolinea;
        }

        public String getstrNombre_aerolinea(){
            return strNombre_aerolinea;
        }
    // </editor-fold>

    // <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">
        /**
    	 * 
    	 * @param newVal
    	 */
        public void setIntId_Aerolinea(int newVal){
            IntId_Aerolinea = newVal;
        }

        /**
    	 * 
    	 * @param newVal
    	 */
        public void setstrNombre_aerolinea(String newVal){
            strNombre_aerolinea = newVal;
        }
    // </editor-fold>

    // <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
        /**
    	 * 
    	 * @param strNombre_aerolinea
    	 */
        public void CrudInsertar(String strNombre_aerolinea){

            String query = " insert into Aerolineas (Nombre_aerolinea)"
            + " values "+"('"+ strNombre_aerolinea +"')";

            conex.queryUpdate(query);
        }

        /**
    	 * 
    	 * @param IntId_Aerolinea
    	 */
        public void CrudConsultar(int IntId_Aerolinea){

            // String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Aerolineas WHERE strNombre_aerolinea LIKE '%" + strNombre_aerolinea + "%';"));
            String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Aerolineas WHERE Id_aerolinea= '" + IntId_Aerolinea + "';"));

            System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]);
        }

        /**
    	 * 
    	 * @param IntId_Aerolinea
    	 * @param strNombre_aerolinea
    	 */
        public void CrudActualizar(int IntId_Aerolinea, String strNombre_aerolinea){

            String query = " UPDATE Aerolineas SET Id_aerolinea='"+ IntId_Aerolinea +"', Nombre_aerolinea='"+ strNombre_aerolinea +"'";

            conex.queryUpdate(query);
        }

        public Aerolineas[] CrudListar(){
            
            return null;
        }
    // </editor-fold>

}