package Linea_base;
import Conexiones.Conexion;

/**
 * @author Mario samudio
 * @version 1.0
 * @created 17-oct-2015 1:06:33 AM
 * @
 */
public class TipoDocumento {

	private int intId_tipodoc;
	private String strDenominacion;
        Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}
// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">

	public void TipoDocumento(){

	}

	/**
	 * 
	 * @param intId_tipodoc
	 */
	public void TipoDocumento(int intId_tipodoc){

	}

	/**
	 * 
	 * @param intId_tipodoc
	 * @param strDenominacion
	 */
	public void TipoDocumento(int intId_tipodoc, String strDenominacion){

	}
// </editor-fold>


// <editor-fold desc="Métodos get y set de la clase." defaultstate="collapsed">      

	public int getintId_tipodoc(){
		return intId_tipodoc;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintId_tipodoc(int newVal){
		intId_tipodoc = newVal;
	}

	public String getstrDenominacion(){
		return strDenominacion;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrDenominacion(String newVal){
		strDenominacion = newVal;
	}
// </editor-fold>	


// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param intId_tipodoc
	 */
	public void CrudConsultar(int intId_tipodoc){

		String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM TipoDocumentos WHERE Id_tipodoc= '" + intId_tipodoc + "';"));

		System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]);
	}

	/**
	 * 
	 * @param strDenominacion
	 */
	public void CrudInsertar(String strDenominacion){

		String query = " insert into TipoDocumentos (denominacion)"
		+ " values "+"('"+strDenominacion+"')";

		conex.queryUpdate(query);
	}

	/**
	 * 
	 * @param intId_tipodoc
	 * @param strDenominacion
	 */
	public boolean CrudActualizar(int intId_tipodoc, String strDenominacion){

		String query = " UPDATE TipoDocumentos SET Id_tipodoc='"+ intId_tipodoc +"', denominacion='"+ strDenominacion +"'";

		conex.queryUpdate(query);

		return false;
	}
        //TODO:
	public void CrudListar(){

	}
// </editor-fold>
}