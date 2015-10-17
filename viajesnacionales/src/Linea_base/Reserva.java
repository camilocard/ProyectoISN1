package Linea_base;
import Conexiones.Conexion;

/**
 * @author Administrador
 * @version 1.0
 * @created 17-oct-2015 1:06:33 AM
 */
public class Reserva {

	private int intId_reserva;
	private int intNum_Reserva;
	private int intCliente_que_reserva;
	private int intPlan_escogido;
	private String strFecha_salida;
	private String strFecha_regreso;
	private int intEmpleado;
        
        Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}
// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">

	public void Reserva(){

	}

	/**
	 * 
	 * @param intid_reserva
	 */
	public void Reserva(int intid_reserva){

	}

	/**
	 * 
	 * @param intId_reserva
	 * @param intNum_Reserva
	 * @param intCliente_que_reserva
	 * @param intPlan_escogido
	 * @param srtFecha_salida
	 * @param strFecha_regreso
	 * @param intEmpledo
	 */
	public void Reserva(int intId_reserva, int intNum_Reserva, int intCliente_que_reserva, int intPlan_escogido, String srtFecha_salida, String strFecha_regreso, int intEmpledo){

	}
// </editor-fold>


// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">      

	public int getintId_reserva(){
		return intId_reserva;
	}

	public int getintNum_Reserva(){
		return intNum_Reserva;
	}

	public int getintCliente_que_reserva(){
		return intCliente_que_reserva;
	}

	public int getintPlan_escogido(){
		return intPlan_escogido;
	}

	public String getstrFecha_salida(){
		return strFecha_salida;
	}

	public String getstrFecha_regreso(){
		return strFecha_regreso;
	}

	public int getintEmpleado(){
		return intEmpleado;
	}
// </editor-fold>


// <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param newVal
	 */
	public void setintId_reserva(int newVal){
		intId_reserva = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintNum_Reserva(int newVal){
		intNum_Reserva = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintCliente_que_reserva(int newVal){
		intCliente_que_reserva = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintPlan_escogido(int newVal){
		intPlan_escogido = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrFecha_salida(String newVal){
		strFecha_salida = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstrFecha_regreso(String newVal){
		strFecha_regreso = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintEmpleado(int newVal){
		intEmpleado = newVal;
	}
// </editor-fold>

// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param intId_reserva
	 */
	public void CrudConsultar(int intId_reserva){

		String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Reservas WHERE Id_reserva= '" + intId_reserva + "';"));

		System.out.println("El registro es: " + res[0][0] + "-" + res[0][1] + "-" + res[0][2] + res[0][3] + "-" + res[0][4] + "-" + res[0][5] + "-" + res[0][6]);
	}

	/**
	 * 
	 * @param intNum_Reserva
	 * @param intCliente_que_reserva
	 * @param intPlan_escogido
	 * @param srtFecha_salida
	 * @param strFecha_regreso
	 * @param intEmpleado
	 */
	public void CrudInsertar(int intNum_Reserva, int intCliente_que_reserva, int intPlan_escogido, String srtFecha_salida, String strFecha_regreso, int intEmpleado){

		String query = " insert into Reservas (Num_reserva, Cliente_que_reserva, plan_escogido, fecha_salida, fecha_regreso, Empleado)"
		+ " values "+"('"+intNum_Reserva+"','"+intCliente_que_reserva+"','"+intPlan_escogido+"','"+strFecha_salida+"','"+strFecha_regreso+"','"+intEmpleado+"')";

		conex.queryUpdate(query);
	}

	/**
	 * 
	 * @param intId_reserva
	 * @param intNum_Reserva
	 * @param intCliente_que_reserva
	 * @param intPlan_escogido
	 * @param srtFecha_salida
	 * @param strFecha_regreso
	 * @param intEmpleado
	 */
	public void CrudActualizar(int intId_reserva, int intNum_Reserva, int intCliente_que_reserva, int intPlan_escogido, String srtFecha_salida, String strFecha_regreso, int intEmpleado){

		String query = " UPDATE Reservas SET Id_reserva='"+ intId_reserva +"', Num_reserva='"+ intNum_Reserva +"',	Cliente_que_reserva='"+ intCliente_que_reserva +"',	plan_escogido='"+ intPlan_escogido +"', fecha_salida='"+ strFecha_salida +"', fecha_regreso='"+ strFecha_regreso +"',	Empleado='"+ intEmpleado +"'";

		conex.queryUpdate(query);
	}
	//TODO:
	public boolean CrudListar(){
		return false;
	}
// </editor-fold>
}





