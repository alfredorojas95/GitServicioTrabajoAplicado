package servicioreporte;

import Controlador.Reporte.Reporte;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioReporte {

	/**
	 * este m�todo obtiene los montos de ingresos y gastos durante el periodo academico
	 * @return
	 */
	public String obtenerBalanceIngGasto(){
		return Reporte.obtenerBalanceIngGasto();
	}
}
