package serviciomatricula;

import Controlador.Finanza.Matricula;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioMatricula {

	/**
	 * este método le paga la matrpicula a un estudiante
	 * @param rutEstudiante
	 * @param rutSecretaria
	 * @return
	 */
	public String pagarMatricula(String rutEstudiante,String rutSecretaria){
		return Matricula.pagarMatricula(rutEstudiante, rutSecretaria);
	}
	
	/**
	 * este método devuelve el listado de estudiantes morosos en el pago de matrícula
	 * @return
	 */
	public String obtenerListMorososMatricula(){
		return Matricula.obtenerListMorososMatricula();
	}
}
