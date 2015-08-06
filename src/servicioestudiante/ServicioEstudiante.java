package servicioestudiante;

import Controlador.Academico.StaffAcademico.Estudiante;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioEstudiante {

	/**
	 * este método devuelve el promedio de un estudiante y su porcentaje de asistencia
	 * @param rutEstudiante
	 * @return
	 */
	public String obtenerSituacionEstudiante(String rutEstudiante){
		return Estudiante.obtenerSituacionEstudiante(rutEstudiante);
	}
	
}
