package Linea_base;
import Conexiones.Conexion;
import javax.swing.JOptionPane;


/**
 * @author Mario samudio
 * @version 1.0
 * @created 13-oct-2015 12:05:10 PM
 */
public class Contacto {

	private int intId_Contacto;
	private int intCliente;
	private int intEmpleado;
	private String strTelefono_fijo;
	private String strCelular;
	private String strDireccion;
	private String strCorreo_electronico;
	Conexion conex = new Conexion();

	public void finalize() throws Throwable {

	}

	// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">

		public Contacto(){

		}

		/**
		 * 
		 * @param intId_Contacto
		 */
		public void Contacto(int intId_Contacto){

		}

		/**
		 * 
		 * @param intId_Contacto
		 * @param intCliente
		 * @param intEmpleado
		 * @param strTelefono_fijo
		 * @param strCelular
		 * @param strDireccion
		 * @param strCorreo_electronico
		 */
		public void Contacto(int intId_Contacto, int intCliente, int intEmpleado, String strTelefono_fijo, String strCelular, String strDireccion, String strCorreo_electronico){

		}
 	// </editor-fold>

	// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">

		public int getintCliente(){
			return intCliente;
		}

		public int getintEmpleado(){
			return intEmpleado;
		}

		public int getintId_Contacto(){
			return intId_Contacto;
		}

		public String getstrCelular(){
			return strCelular;
		}

		public String getstrCorreo_electronico(){
			return strCorreo_electronico;
		}

		public String getstrDireccion(){
			return strDireccion;
		}

		public String getstrTelefono_fijo(){
			return strTelefono_fijo;
		}
	// </editor-fold>

	// <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">
		/**
		 * 
		 * @param newVal
		 */
		public void setintCliente(int newVal){
			intCliente = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setintEmpleado(int newVal){
			intEmpleado = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setintId_Contacto(int newVal){
			intId_Contacto = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setstrCelular(String newVal){
			strCelular = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setstrCorreo_electronico(String newVal){
			strCorreo_electronico = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setstrDireccion(String newVal){
			strDireccion = newVal;
		}

		/**
		 * 
		 * @param newVal
		 */
		public void setstrTelefono_fijo(String newVal){
			strTelefono_fijo = newVal;
		}
	// </editor-fold>


	// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
		/**
		 * 
		 * @param intId_Contacto
		 */
		public void CrudConsultar(int intId_Contacto){

			String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Contacto WHERE Id_contacto= '" + intId_Contacto + "';"));

			System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]+ "-" + res[0][2] + "-" + res[0][3]+ "-" + res[0][4] + "-" + res[0][5]+ "-" + res[0][6]);

		}

		/**
		 * 
		 * @param intCliente
		 * @param intEmpleado
		 * @param strTelefono_fijo
		 * @param strCelular
		 * @param strDireccion
		 * @param strCorreo_electronico
		 */
		public void CrudInsertar(int intCliente, int intEmpleado, String strTelefono_fijo, String strCelular, String strDireccion, String strCorreo_electronico){

			String query = " insert into Contacto (Cliente, Empleado, Telefono_fijo, "
			+ "Celular, Direccion, Correo_electronico)"
			+ " values "+"('"+intCliente+"','"+intEmpleado+"','"+strTelefono_fijo+"','"+strCelular+"','"+strDireccion+"','"+strCorreo_electronico+"')";

	        conex.queryUpdate(query);

		}

		/**
		 * 
		 * @param intId_Contacto
		 * @param intCliente
		 * @param intEmpleado
		 * @param strTelefono_fijo
		 * @param strCelular
		 * @param strDireccion
		 * @param strCorreo_electronico
		 */
		public void CrudActualizar(int intId_Contacto, int intCliente, int intEmpleado, String strTelefono_fijo, String strCelular, String strDireccion, String strCorreo_electronico){

			String query = " UPDATE Contacto SET Id_contacto='"+ intId_Contacto +"', Cliente='"+ intCliente +"', Empleado='"+ intEmpleado +"', Telefono_fijo='"+ strTelefono_fijo +"', Celular='"+ strCelular +"', Direccion='"+ strDireccion +"', Correo_electronico='"+ strCorreo_electronico +"'";

			conex.queryUpdate(query);
		}

		/**
		 * 
		 * @param intId_Contacto
		 * @param intCliente
		 * @param intEmpleado
		 * @param strTelefono_fijo
		 * @param strCelular
		 * @param strDireccion
		 * @param strCorreo_electronico
		 */
		public void CrudListar(int intId_Contacto, int intCliente, int intEmpleado, String strTelefono_fijo, String strCelular, String strDireccion, String strCorreo_electronico){

		}
	// </editor-fold>



}