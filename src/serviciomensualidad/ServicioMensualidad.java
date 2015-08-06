package serviciomensualidad;

import Controlador.Finanza.Mensualidad;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioMensualidad {

	/**
	 * este m�todo le paga la mensualidad a un estudiante
	 * @param rutSc
	 * @param rutEs
	 * @param mes
	 * @return
	 */
	public String regPagoMensualidad(String rutSc, String rutEs, int mes){
		return Mensualidad.regPagoMensualidad(rutSc,rutEs,mes);
	}
	
	/**
	 * este m�todo obtiene el listado de estudiantes morosos en el pago de las mensualidades
	 * @param mes
	 * @return
	 */
	public String obtenerListMorososMensualidad(int mes){
		return Mensualidad.obtenerListMorososMensualidad(mes);
	}
}
