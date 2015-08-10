package serviciocurso;

import Controlador.Academico.Curso;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioCurso {

	/**
	 * este método crea un curso
	 * @param nombreCurso
	 * @param rutJefeAdm
	 * @return
	 */
	public String crearCurso(String nombreCurso, String rutJefeAdm){
		return Curso.crearCurso(nombreCurso,rutJefeAdm);
	}
	
	/**
	 * este método desactiva un curso
	 * @param id código del curso
	 * @param rutDirector
	 * @return
	 */
	public String desactivarCurso(int id, String rutDirector){
		return Curso.desactivarCurso(id, rutDirector);
	}
	
	/**
	 * este método le asigna un profesor a un curso
	 * @param id (código curso)
	 * @param rutProfe
	 * @param rutJefeAdm
	 * @return
	 */
	public String asignarProfesor(int id, String rutProfe,String rutJefeAdm){
		return Curso.asignarProfesor(id,rutProfe,rutJefeAdm);
	}
	
	/**
	 * este método inscribe a un estudiante en un curso
	 * @param idCurso
	 * @param rutEstudiante
	 * @param rutProf
	 * @return
	 */
	public String inscribirEstudiantes(int idCurso, String rutEstudiante, String rutProf){
		return Curso.inscribirEstudiantes(idCurso, rutEstudiante, rutProf);
	}
	
	/**
	 * este método entrega los datos de un curso entregado su código
	 * @param id
	 * @return
	 */
	public String[] buscarCurso(int id){
		return Curso.buscarCurso(id);
	}
}
