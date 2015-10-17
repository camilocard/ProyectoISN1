package Linea_base;
import Conexiones.Conexion;

/**
 * @author Administrador
 * @version 1.0
 * @created 17-oct-2015 1:06:33 AM
 */
public class Tiquete {

	private int intId_tiquete;
	private int intAerolinea;
	private int intReservado;
	private int intOrigen;
	private int intDestino;
	private double doubleValor;
        
        Conexion conex = new Conexion();



	public void finalize() throws Throwable {

	}
// <editor-fold desc="Constructores de la clase." defaultstate="collapsed">

	public void Tiquete(){

	}

	/**
	 * 
	 * @param IntId_tiquete
	 */
	public void Tiquete(int IntId_tiquete){

	}

	/**
	 * 
	 * @param IntId_tiquete
	 * @param intAerolinea
	 * @param intReservado
	 * @param intOrigen
	 * @param intDestino
	 * @param doubleValor
	 */
	public void Tiquete(int IntId_tiquete, int intAerolinea, int intReservado, int intOrigen, int intDestino, double doubleValor){

	}
// </editor-fold>

// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">      

	public int getintId_tiquete(){
		return intId_tiquete;
	}

	public int getintAerolinea(){
		return intAerolinea;
	}

	public int getintReservado(){
		return intReservado;
	}

	public int getintOrigen(){
		return intOrigen;
	}

	public int getintDestino(){
		return intDestino;
	}

	public double getdoubleValor(){
		return doubleValor;
	}
// </editor-fold>

// <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param newVal
	 */
	public void setintId_tiquete(int newVal){
		intId_tiquete = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintAerolinea(int newVal){
		intAerolinea = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintReservado(int newVal){
		intReservado = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintOrigen(int newVal){
		intOrigen = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setintDestino(int newVal){
		intDestino = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdoubleValor(double newVal){
		doubleValor = newVal;
	}
// </editor-fold>

// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">

	/**
	 * 
	 * @param intId_tiquete
	 */
	public void CrudConsultar(int intId_tiquete){

		String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Tiquetes WHERE Id_Tiquete= '" + intId_tiquete + "';"));

		System.out.println("El registro es: " + res[0][0] + "-" + res[0][1] + "-" + res[0][2] + res[0][3] + "-" + res[0][4] + "-" + res[0][5]);
	}

	/**
	 * 
	 * @param intAerolinea
	 * @param intReservado
	 * @param intOrigen
	 * @param intDestino
	 * @param doubleValor
	 */
	public void Crudinsertar(int intAerolinea, int intReservado, int intOrigen, int intDestino, double doubleValor){

		String query = " insert into Tiquetes ( Aerolinea, Reservado, Origen, Destino, Valor)"
		+ " values "+"('"+intAerolinea+"','"+intReservado+"','"+intOrigen+"','"+intDestino+"','"+doubleValor+"')";

		conex.queryUpdate(query);
	}

	/**
	 * 
	 * @param IntId_tiquete
	 * @param intAerolinea
	 * @param intReservado
	 * @param intOrigen
	 * @param intDestino
	 * @param doubleValor
	 */
	public void CrudActualizar(int IntId_tiquete, int intAerolinea, int intReservado, int intOrigen, int intDestino, double doubleValor){

		String query = " UPDATE Tiquetes SET Id_Tiquete='"+ intId_tiquete +"', Aerolinea='"+ intAerolinea +"', Reservado='"+ intReservado +"', Origen='"+ intOrigen +"', Destino='"+ intDestino +"', Valor='"+ doubleValor +"'";

		conex.queryUpdate(query);
	}

	public void CrudListar(){

	}
// </editor-fold>
}





