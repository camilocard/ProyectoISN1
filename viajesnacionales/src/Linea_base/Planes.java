package Linea_base;
import Conexiones.Conexion;

/**
 * @author Mario
 * @version 1.0
 * @created 13-oct-2015 5:24:48 PM
 */
public class Planes {

	private int intid_plan;
	private String strNombre;
	private int intCosto;
        Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}

	public void Planes(){

	}

	/**
	 * 
	 * @param intid_plan
	 */
	public void Planes(int intid_plan){

	}

	/**
	 * 
	 * @param intid_plan
	 * @param strNombre
	 * @param intCosto
	 */
	public void Planes(int intid_plan, String strNombre, int intCosto){

	}

	public int getintid_plan(){
		return intid_plan;
	}

	public String getstrNombre(){
		return strNombre;
	}

	public int getintCosto(){
		return intCosto;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintid_plan(int newVal){
		intid_plan = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrNombre(String newVal){
		strNombre = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintCosto(int newVal){
		intCosto = newVal;
	}

	/**
	 * 
	 * @param intid_plan
	 */
	public void CrudConsultar(int intid_plan){
		String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Planes WHERE Id_plan= '" + intid_plan + "';"));

		System.out.println("El registro es: " + res[0][0] + "-" + res[0][1] + "-" + res[0][2]);
	}

	/**
	 * 
	 * @param strNombre
	 * @param intCosto
	 */
	public void CrudInsertar(String strNombre, int intCosto){
		String query = " insert into Planes (nombre_plan, costo_plan)"
            + " values "+"('"+strNombre+"','"+intCosto+"')";

        conex.queryUpdate(query);
	}

	/**
	 * 
	 * @param intid_plan
	 * @param strNombre
	 * @param intCosto
	 */
	public boolean CrudListar(int intid_plan, String strNombre, int intCosto){
		return false;
	}

	/**
	 * 
	 * @param intid_plan
	 * @param strNombre
	 * @param intCosto
	 */
	public void CrudActualizar(int intid_plan, String strNombre, int intCosto){

		String query = " UPDATE Planes SET Id_plan='"+ intid_plan +"', nombre_plan='"+ strNombre +"'";

		conex.queryUpdate(query);

	}

}
