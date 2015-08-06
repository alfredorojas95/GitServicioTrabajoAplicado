package serviciomatricula;

import Controlador.Finanza.Matricula;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioMatricula {

	/**
	 * este m�todo le paga la matrpicula a un estudiante
	 * @param rutEstudiante
	 * @param rutSecretaria
	 * @return
	 */
	public String pagarMatricula(String rutEstudiante,String rutSecretaria){
		return Matricula.pagarMatricula(rutEstudiante, rutSecretaria);
	}
	
	/**
	 * este m�todo devuelve el listado de estudiantes morosos en el pago de matr�cula
	 * @return
	 */
	public String obtenerListMorososMatricula(){
		return Matricula.obtenerListMorososMatricula();
	}
}
