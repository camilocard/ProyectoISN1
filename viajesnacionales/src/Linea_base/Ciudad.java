package Linea_base;
import Conexiones.Conexion;

/**
 * @author Administrador
 * @version 1.0
 * @created 17-oct-2015 1:06:32 AM
 */
public class Ciudad {

	private int intId_Ciudad;
	private int strNombre_Ciudad;
        Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}
// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">
	public void Ciudad(){

	}

	/**
	 * 
	 * @param intId_Ciudad
	 */
	public void Ciudad(int intId_Ciudad){

	}

	/**
	 * 
	 * @param intId_Ciudad
	 * @param strNombre_Ciudad
	 */
	public void Ciudad(int intId_Ciudad, String strNombre_Ciudad){

	}
// </editor-fold>

// <editor-fold desc="Métodos get y set de la clase." defaultstate="collapsed">      
	public int getintId_Ciudad(){
		return intId_Ciudad;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintId_Ciudad(int newVal){
		intId_Ciudad = newVal;
	}

	public int getstrNombre_Ciudad(){
		return strNombre_Ciudad;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrNombre_Ciudad(int newVal){
		strNombre_Ciudad = newVal;
	}
// </editor-fold>

// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
	/**
	 * 
	 * @param IntId_Ciudad
	 */
	public void CrudConsultar(int IntId_Ciudad){

		String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Ciudades WHERE Id_ciudad= '" + intId_Ciudad + "';"));

		System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]);
	}

	/**
	 * 
	 * @param strNombre_Ciudad
	 */
	public void CrudInsertar(String strNombre_Ciudad){

		String query = " insert into Ciudades (Nombre)"
		+ " values "+"('"+strNombre_Ciudad+"')";

		conex.queryUpdate(query);
	}

	/**
	 * 
	 * @param intId_Ciudad
	 * @param strNombre_Ciudad
	 */
	public void CrudActualizar(int intId_Ciudad, String strNombre_Ciudad){

		String query = " UPDATE Ciudades SET Id_ciudad='"+ intId_Ciudad +"', Nombre='"+ strNombre_Ciudad +"'";

		conex.queryUpdate(query);
	}
	//TODO:
	public void CrudListar(){

	}
// </editor-fold>
}