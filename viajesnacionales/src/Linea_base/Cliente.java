package Linea_base;
import Conexiones.Conexion;

/**
 * @author Mario samudio
 * @version 1.0
 * @created 17-oct-2015 1:06:32 AM
 */
public class Cliente {

	private int intId_Cliente;
	private String strNombre1;
	private String strNombre2;
	private String strApellido1;
	private String strApellido2;
	private String strFecha_nacimiento;
	private boolean bolSexo;
	private String strDocumento;
	private int intTipoDoc;
        
        Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}

// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">
	public void Cliente(){

	}

	/**
	 * 
	 * @param intid_Cliente
	 */
	public void Cliente(int intid_Cliente){

	}

	/**
	 * 
	 * @param intId_Cliente
	 * @param strNombre1
	 * @param strNombre2
	 * @param strApellido1
	 * @param strApellido2
	 * @param strFecha_nacimiento
	 * @param bolSexo
	 * @param strDocumento
	 * @param intTipoDoc
	 */
	public void Cliente(int intId_Cliente, String strNombre1, String strNombre2, String strApellido1, String strApellido2, String strFecha_nacimiento, boolean bolSexo, String strDocumento, int intTipoDoc){

	}
// </editor-fold>

// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">      
	public int getintId_Cliente(){
		return intId_Cliente;
	}

	public String getstrNombre1(){
		return strNombre1;
	}

	public String getstrNombre2(){
		return strNombre2;
	}

	public String getstrApellido1(){
		return strApellido1;
	}

	public String getstrApellido2(){
		return strApellido2;
	}

	public String getstrFecha_nacimiento(){
		return strFecha_nacimiento;
	}

	public boolean isbolSexo(){
		return bolSexo;
	}

	public String getstrDocumento(){
		return strDocumento;
	}

	public int getintTipoDoc(){
		return intTipoDoc;
	}
// </editor-fold>

// <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param newVal
	 */
	public void setintId_Cliente(int newVal){
		intId_Cliente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrNombre1(String newVal){
		strNombre1 = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrNombre2(String newVal){
		strNombre2 = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrApellido1(String newVal){
		strApellido1 = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrApellido2(String newVal){
		strApellido2 = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrFecha_nacimiento(String newVal){
		strFecha_nacimiento = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setbolSexo(boolean newVal){
		bolSexo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrDocumento(String newVal){
		strDocumento = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintTipoDoc(int newVal){
		intTipoDoc = newVal;
	}
// </editor-fold>

// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param intId_Cliente
	 */
	public void CrudConsultar(int intId_Cliente){

		String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Clientes WHERE Id_Cliente= '" + intId_Cliente + "';"));

		System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]+ "-" + res[0][2] + "-" + res[0][3]+ "-" + res[0][4] + "-" + res[0][5]+ "-" + res[0][6] + "-" + res[0][7]+ "-" + res[0][8]);
	}

	/**
	 * 
	 * @param strNombre1
	 * @param strNombre2
	 * @param strApellido1
	 * @param strApellido2
	 * @param strFecha_nacimiento
	 * @param bolSexo
	 * @param strDocumento
	 * @param intTipoDoc
	 */
	public void CrudInsertar(String strNombre1, String strNombre2, String strApellido1, String strApellido2, String strFecha_nacimiento, boolean bolSexo, String strDocumento, int intTipoDoc){

		String query = " insert into Clientes (Nombre1, Nombre2, Apellido1, "
		+ "Apellido2, Fecha_nacimiento, Sexo, Documento, TipoDoc)"
		+ " values "+"('"+strNombre1+"','"+strNombre2+"','"+strApellido1+"','"+strApellido2+"','"+strFecha_nacimiento+"','"+bolSexo+"','"+strDocumento+"','"+intTipoDoc+"')";

		conex.queryUpdate(query);
	}

	/**
	 * 
	 * @param intId_Cliente
	 * @param strNombre1
	 * @param strNombre2
	 * @param strApellido1
	 * @param strApellido2
	 * @param strFecha_nacimiento
	 * @param bolSexo
	 * @param strDocumento
	 * @param intTipoDoc
	 */
	public boolean CrudActualizar(int intId_Cliente, String strNombre1, String strNombre2, String strApellido1, String strApellido2, String strFecha_nacimiento, boolean bolSexo, String strDocumento, int intTipoDoc){
		
		String query = " UPDATE Clientes SET Id_Cliente='"+ intId_Cliente +"', Nombre1='"+ strNombre1 +"', Nombre2='"+ strNombre2 +"', Apellido1='"+ strApellido1 +"',Apellido2='"+ strApellido2 +"', Fecha_nacimiento='"+ strFecha_nacimiento +"', Sexo='"+ bolSexo +"', Documento='"+ strDocumento +"', TipoDoc='"+ intTipoDoc +"'";

		conex.queryUpdate(query);

		return true;
	}
	//TODO:
	public boolean CrudListar(){
		return false;
	}
// </editor-fold>
}