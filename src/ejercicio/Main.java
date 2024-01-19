package ejercicio;

public class Main {
	public static void main(String[] args) {
		Conversacion c = new Conversacion();
		c.saludar();
		if (c.estadoAnimo()==1) {
			System.out.println("¡Estoy de buen humor!");
		} else {
			System.out.println("Hoy te van a dar por todos lados. Te suspendere todas las asignaturas porque puedo y porque quiero.");
		}	
	}
}
