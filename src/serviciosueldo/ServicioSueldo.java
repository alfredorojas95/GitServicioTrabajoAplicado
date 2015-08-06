package serviciosueldo;

import Controlador.Finanza.Sueldo;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioSueldo {

	/**
	 * este m�todo le registra un sueldo a un profesor
	 * @param rutProf
	 * @param rutAdm
	 * @param mes
	 * @return
	 */
	public String registrarSueldoProf(String rutProf, String rutAdm, int mes){
		return Sueldo.registrarSueldoProf(rutProf, rutAdm, mes);
	}
	
	/**
	 * este m�todo consulta los sueldos de un profesor y si fue realizado o no
	 * @param rutProf
	 * @return
	 */
	public String consSueldoProf(String rutProf){
		return Sueldo.consSueldoProf(rutProf);
	}
}
