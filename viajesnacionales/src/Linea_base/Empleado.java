package Linea_base;
import Conexiones.Conexion;
import javax.swing.JOptionPane;


/**
 * @author Administrador
 * @version 1.0
 * @created 13-oct-2015 12:05:10 PM
 */
public class Empleado {

	private int intId_empleado;
	private String strCargo;
	private String strNombre1;
	private String strNombre2;
	private String strApellido1;
	private String strApellido2;
	private String strFechaNac;
	private boolean bolSexo;
	private String strDocumento;
	private String strTipoDoc;
	Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}

	// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">
		public void Empleado(){

		}
		/**
		 * 
		 * @param intid_empleado
		 */
		public void Empleados(int intid_empleado){

		}

		/**
		 * 
		 * @param intId_empleado
		 * @param srtCargo
		 * @param strNombre1
		 * @param strNombre2
		 * @param strApellido1
		 * @param strApellido2
		 * @param bolSexo
		 * @param strFechaNac
		 * @param strTipoDoc
		 */
		public void Empleado(int intId_empleado, String srtCargo, String strNombre1, String strNombre2, String strApellido1, String strApellido2, boolean bolSexo, String strFechaNac, String strTipoDoc){

		}
	// </editor-fold>

	// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">
		public String getstrCargo(){
			return strCargo;
		}

		public int getintId_empleado(){
			return intId_empleado;
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
	// </editor-fold>

	// <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">
		/**
		 * 
		 * @param newVal
		 */
		public void setstrCargo(String newVal){
			strCargo = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setintId_empleado(int newVal){
			intId_empleado = newVal;
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

		public String getstrApellido2(){
			return strApellido2;
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

		public boolean isbolSexo(){
			return bolSexo;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setbolSexo(boolean newVal){
			bolSexo = newVal;
		}

	// </editor-fold>

	public String getstrDocumento(){
		return strDocumento;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrDocumento(String newVal){
		strDocumento = newVal;
	}

	public String getstrTipoDoc(){
		return strTipoDoc;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrTipoDoc(String newVal){
		strTipoDoc = newVal;
	}

	// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
		/**
		 * 
		 * @param intId_empleado
		 */
		public void CrudConsultar(int intId_empleado){
			String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Empleados WHERE Id_empleado= '" + intId_empleado + "';"));

			System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]+ "-" + res[0][2] + "-" + res[0][3]+ "-" + res[0][4] + "-" + res[0][5] + "-" + res[0][6] + "-" + res[0][7] + "-" + res[0][8] + "-" + res[0][9]);

		}

		/**
		 * 
		 * @param srtCargo
		 * @param strNombre1
		 * @param strNombre2
		 * @param strApellido1
		 * @param strApellido2
		 * @param strFechaNac
		 * @param bolSexo
		 * @param strDocumento
		 * @param strTipoDoc
		 */
		public void CrudInsertar(String srtCargo, String strNombre1, String strNombre2, String strApellido1, String strApellido2, String strFechaNac, boolean bolSexo, String strDocumento, String strTipoDoc){
			
			String query = " insert into Empleados (Cargo, Nombre1, Nombre2, Apellido1, "
			+ "Apellido2, FechaNac, Sexo, Documento, TipoDoc)"
			+ " values "+"('"+strCargo+"','"+strNombre1+"','"+strNombre2+"','"+strApellido1+"','"+strApellido2+"','"+strFechaNac+"','"+bolSexo+"','"+strDocumento+"','"+strTipoDoc+"')";

	        conex.queryUpdate(query);
		}

		/**
		 * 
		 * @param intId_empleado
		 * @param srtCargo
		 * @param strNombre1
		 * @param strNombre2
		 * @param strApellido1
		 * @param strApellido2
		 * @param bolSexo
		 * @param strFechaNac
		 * @param strDocumento
		 * @param strTipoDoc
		 */
		public void CrudActualizar(int intId_empleado, String srtCargo, String strNombre1, String strNombre2, String strApellido1, String strApellido2, boolean bolSexo, String strFechaNac, String strDocumento, String strTipoDoc){

			String query = " UPDATE Empleados SET Id_empleado='"+ intId_empleado +"', Cargo='"+ strCargo +"', Nombre1='"+ strNombre1 +"', Nombre2='"+ strNombre2 +"', Apellido1='"+ strApellido1 +"',Apellido2='"+ strApellido2 +"', FechaNac='"+ strFechaNac +"', Sexo='"+ bolSexo +"', Documento='"+ strDocumento +"', TipoDoc='"+ strTipoDoc +"'";

			conex.queryUpdate(query);

		}

		/**
		 * 
		 * @param intId_empleado
		 * @param srtCargo
		 * @param strNombre1
		 * @param strNombre2
		 * @param strApellido1
		 * @param strApellido2
		 * @param bolSexo
		 * @param strFechaNac
		 * @param strDocumento
		 * @param strTipoDoc
		 */
		public void CrudListar(int intId_empleado, String srtCargo, String strNombre1, String strNombre2, String strApellido1, String strApellido2, boolean bolSexo, String strFechaNac, String strDocumento, String strTipoDoc){

		}
	// </editor-fold>

}