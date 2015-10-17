package Linea_base;
import Conexiones.Conexion;

/**
 * @author Mario
 * @version 1.0
 * @created 17-oct-2015 9:04:06 AM
 */
public class Plan {

	private int intid_plan;
	private String strNombre;
	private double douCosto;
        Conexion conex = new Conexion();
        
        



	public void finalize() throws Throwable {

	}

	// <editor-fold desc="Construcotres de la clase." defaultstate="collapsed">
		public void Plan(){

		}

		/**
		 * 
		 * @param intid_plan
		 */
		public void Plan(int intid_plan){

		}

		/**
		 * 
		 * @param intid_plan
		 * @param strNombre
		 * @param douCosto
		 */
		public void Plan(int intid_plan, String strNombre, double douCosto){

		}
	// </editor-fold>

	// <editor-fold desc="Métodos get de la clase." defaultstate="collapsed">
		public int getintid_plan(){
			return intid_plan;
		}

		public String getstrNombre(){
			return strNombre;
		}

		public double getdouCosto(){
			return douCosto;
		}
	// </editor-fold>


	// <editor-fold desc="Métodos set de la clase." defaultstate="collapsed">
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
		public void setdouCosto(double newVal){
			douCosto = newVal;
		}
	// </editor-fold>

	// <editor-fold desc="Métodos CRUD de la clase." defaultstate="collapsed">
		/**
		 * 
		 * @param intid_plan
		 */
		public void CrudConsultar(int intid_plan){

			String[][]res = conex.resultadoQuery(conex.queryConsulta("SELECT Id_plan, nombre_plan, costo_plan FROM Planes WHERE Id_plan= '" + intid_plan + "';"));

			System.out.println("El registro es: " + res[0][0] + "-" + res[0][1]);

		}

		/**
		 * 
		 * @param strNombre
		 * @param douCosto
		 */
		public void CrudInsertar(String strNombre, double douCosto){

			String query = " insert into Planes (nombre_plan, costo_plan)"
			+ " values "+"('"+ strNombre +"', '"+ douCosto +"')";

			conex.queryUpdate(query);
		}

		/**
		 * 
		 * @param intid_plan
		 * @param strNombre
		 * @param douCosto
		 */
		public void CrudActualizar(int intid_plan, String strNombre, double douCosto){

			String query = " UPDATE Planes SET Id_plan='"+ intid_plan +"', nombre_plan='"+ strNombre +"', costo_plan='"+ douCosto +"'";

			conex.queryUpdate(query);

		}

		public boolean CrudListar(){
			return false;
		}

	// </editor-fold>

}