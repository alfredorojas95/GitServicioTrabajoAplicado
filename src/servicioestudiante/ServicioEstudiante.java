package servicioestudiante;

import Controlador.Academico.StaffAcademico.Estudiante;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioEstudiante {

	/**
	 * este m�todo devuelve el promedio de un estudiante y su porcentaje de asistencia
	 * @param rutEstudiante
	 * @return
	 */
	public String obtenerSituacionEstudiante(String rutEstudiante){
		return Estudiante.obtenerSituacionEstudiante(rutEstudiante);
	}
	
	/**
	 * este m�todo buusca a un estudiante con su rut
	 * @param rutEst
	 * @return
	 */
	public String[] buscarEst(String rutEst){
		return Estudiante.buscarEstudiate(rutEst);
	}
	
}
