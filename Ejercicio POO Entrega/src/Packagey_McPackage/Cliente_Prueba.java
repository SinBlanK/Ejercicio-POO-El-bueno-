package Packagey_McPackage;
import java.util.Scanner;

public class Cliente_Prueba {
	public static void main(String[] args)  {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca número de clientes y visitas para inicializar el programa");
		Salon Salonprueba = new Salon(leer.nextInt(),leer.nextInt());
		int opcion;
		boolean salir = false;
		while (!salir) {
			System.out.println("Selecciona una de las opciones");
			System.out.println("1.Añadir Cliente");
			System.out.println("2.Dar de baja");
			System.out.println("3.Añadir visita");
			System.out.println("4.Mostrar Clientes");
			System.out.println("5.Obtener visitas");
			System.out.println("6.Mostrar todas las visitas");
			System.out.println("7.Buscar cliente");
			System.out.println("8.Cambiar membresia");
			System.out.println("9.Salir");
			opcion = leer.nextInt();
		switch (opcion) {
			
			case 1:
				Salon.anadirCliente();
				break;
			
			case 2:
				Salon.bajaCliente();
				break;
			
			case 3:
				Salon.anadirVisita();
				break;
				
			case 4:
				Salon.mostrarClientes();
				break;
			
			case 5:
				Salon.getVisitasCliente();
				break;
				
			case 6:
				Salon.mostrarVisitas();
				break;
			
			case 7:
				Salon.getCliente();
				break;
				
			case 8:
				Salon.setMembresiacliente();
				break;
			case 9:
				salir = true;
				break;
		
		}}
		
		
	}
	
	
	
	
}
