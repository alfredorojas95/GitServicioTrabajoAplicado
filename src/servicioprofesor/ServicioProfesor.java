package servicioprofesor;

import Controlador.Academico.StaffAcademico.Profesor;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioProfesor {

	/**
	 * este método le registra la nota de un curso a un estudiante
	 * @param rutEst
	 * @param idCurso
	 * @param notaS
	 * @param rutProf
	 * @return
	 */
	public String registrarPromedio(String rutEst, int idCurso, String notaS, String rutProf){
		return Profesor.registrarPromedio(rutEst, idCurso, notaS, rutProf);
	}
	
	/**
	 * este método le registra el porcentaje de asistencia a un estudiante
	 * @param rutEst
	 * @param idCurso
	 * @param notaS
	 * @param rutProf
	 * @return
	 */
	public String registrarAsistencia(String rutEst, int idCurso, String notaS, String rutProf){
		return Profesor.registrarAsistencia(rutEst, idCurso, notaS, rutProf);
	}
}
