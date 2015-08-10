package serviciomensualidad;

import Controlador.Finanza.Mensualidad;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioMensualidad {

	/**
	 * este método le paga la mensualidad a un estudiante
	 * @param rutSc
	 * @param rutEs
	 * @param mes
	 * @return
	 */
	public String regPagoMensualidad(String rutEs, String rutSc, int mes){
		return Mensualidad.regPagoMensualidad(rutEs,rutSc,mes);
	}
	
	/**
	 * este método obtiene el listado de estudiantes morosos en el pago de las mensualidades
	 * @param mes
	 * @return
	 */
	public String obtenerListMorososMensualidad(int mes){
		return Mensualidad.obtenerListMorososMensualidad(mes);
	}
}
