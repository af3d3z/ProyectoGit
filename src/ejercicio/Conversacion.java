package ejercicio;
/***
 * Clase conversación
*/
public class Conversacion {
	/***
	 * Saluda al mundo
	 * */
	public void saludar() {
		System.out.println("Hola Mundo!");
	}
	
	/***
	 * Comprueba el estado de felicidad por si la maquina opta por suspenderte el curso entero
	 * @return el indice de felicidad de la maquina
	 */
	public int estadoAnimo() {
		int felicidad;
		felicidad = (int) (Math.random()*2);
		return felicidad;
	}
}
