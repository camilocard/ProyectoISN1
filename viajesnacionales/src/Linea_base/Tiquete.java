package Linea_base;
import Conexiones.Conexion;
import javax.swing.JOptionPane;


/**
 * @author Administrador
 * @version 1.0
 * @created 13-oct-2015 12:05:11 PM
 */
public class Tiquete {

	private int intId_tiquete;
	private int intAerolinea;
	private int intReservado;
	private int intItinerario;
	private double doubleValor;

	Conexion conex = new Conexion();

	public void finalize() throws Throwable {

	}

	// <editor-fold desc="Construcotres de la clase." defaultstate="collapsed">
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
		 * @param intItinerario
		 * @param doubleValor
		 */
		public void Tiquete(int IntId_tiquete, int intAerolinea, int intReservado, int intItinerario, double doubleValor){

		}
	// </editor-fold>

	// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">
		public int getintId_tiquete(){
			return intId_tiquete;
		}

		public double getdoubleValor(){
			return doubleValor;
		}

		public int getintAerolinea(){
			return intAerolinea;
		}

		public int getintReservado(){
			return intReservado;
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
		public void setdoubleValor(double newVal){
			doubleValor = newVal;
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
	// </editor-fold>

	// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
	
		/**
		 * 
		 * @param intAerolinea
		 * @param intReservado
		 * @param intItinerario
		 * @param doubleValor
		 */
		public void Crudinsertar(int intAerolinea, int intReservado, int intItinerario, double doubleValor){

			String query = " insert into Planes (Id_Tiquete, Aerolinea, Reservado, Itinerario, Valor)"
			+ " values "+"('"+intAerolinea+"','"+intReservado+"','"+intItinerario+"','"+doubleValor+"')";

			conex.queryUpdate(query);

		}

		/**
		 * 
		 * @param intId_tiquete
		 */
		public void CrudConsultar(int intId_tiquete){

			String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT * FROM Tiquetes WHERE Id_Tiquete= '" + intId_tiquete + "';"));

			System.out.println("El registro es: " + res[0][0] + "-" + res[0][1] + "-" + res[0][2] + res[0][3] + "-" + res[0][4]);


		}

		/**
		 * 
		 * @param IntId_tiquete
		 * @param intAerolinea
		 * @param intReservado
		 * @param intItinerario
		 * @param doubleValor
		 */
		public void CrudActualizar(int IntId_tiquete, int intAerolinea, int intReservado, int intItinerario, double doubleValor){

			String query = " UPDATE Aerolineas SET Id_Tiquete='"+ intId_tiquete +"', Aerolinea='"+ intAerolinea +"', Reservado='"+ intReservado +"', Itinerario='"+ intItinerario +"', Valor='"+ doubleValor +"'";

			conex.queryUpdate(query);
		}

		/**
		 * 
		 * @param IntId_tiquete
		 * @param intAerolinea
		 * @param intReservado
		 * @param intItinerario
		 * @param doubleValor
		 */
		public void CrudListar(int IntId_tiquete, int intAerolinea, int intReservado, int intItinerario, double doubleValor){

		}
	// </editor-fold>

}