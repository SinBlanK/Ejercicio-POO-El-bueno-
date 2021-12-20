package Packagey_McPackage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Salon {
	private static int maxnumclientes;
	private static int maxnumvisitas;
	private static Cliente clientes[];
	private static Visita  visitas[];
	public static int contador = 0;
	public static int contavisitas = 0;
	
	public Salon (int maxC , int maxV) {
		maxnumclientes = maxC;
		maxnumvisitas = maxV;
		clientes = new Cliente[maxnumclientes];
		visitas = new Visita[maxnumvisitas];
	}
	
	public static void anadirVisita()  {
		Scanner leer = new Scanner(System.in);
		System.out.println();
		if (contavisitas < maxnumvisitas) {
		System.out.println("Introduce el DNI para añadir la visita :");
		String DNI = leer.next();
		System.out.println("Introduce la fecha");
		String sDate1=leer.next(); 
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			for (int i = 0; i < clientes.length-(maxnumclientes-contador);i++ ) {
				if (clientes[i].getDNI().equals(DNI) ) {
					 visitas[contavisitas] = new Visita(clientes[i], date1);
					 System.out.println("Introduce el importe:");
					 visitas[contavisitas].setImporte(leer.nextInt(),visitas[contavisitas]);
					 contavisitas++;
					 }
			}}
		else {System.out.println("No se pueden añadir más visitas");
			System.out.println();
		}
		
	}
	
	public static void getVisitasCliente()  {
		Scanner leer = new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce el DNI del cliente :");
		String DNI = leer.next();
		
		

		for (int i = 0; i < visitas.length-(maxnumvisitas-contavisitas); i++) {
			if (visitas[i].getDNIVisita().equals(DNI)) {Visita.visitasToString(visitas[i]);}
			
		}
		System.out.println();
		System.out.println();
		
	
		
		
	}
	
	
	public static void anadirCliente() {
		Scanner leer = new Scanner(System.in);
		
		int opcion;
		
		if (contador < maxnumclientes) {
			System.out.println("Seleccione la siguiente opción");
			System.out.println();
			System.out.println("1.Añadir cliente socio(Nombre,DNI,Membresía,Socio:SI/NO)");
			System.out.println("2.Añadir cliente no socio(Nombre,DNI)");
			opcion = leer.nextInt();
			switch (opcion) {
			
			case 1:
			clientes[contador] = new Cliente (leer.next(),leer.next(),leer.next(),leer.next());
			contador++;
			break;
			
			case 2:
			clientes[contador] = new Cliente (leer.next(),leer.next());
			contador++;
			break;
			}
		}else {
			System.out.println("No se pueden crear más clientes");
			System.out.println();}
		
		
		
	}
	
	
	
	public static void getCliente() {
		Scanner leer = new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce el DNI que quieras buscar :");
		String DNI = leer.next();
		System.out.println();
		System.out.println("La ficha del cliente es :");
		System.out.println();
		
		
	
		for (int i = 0; i < clientes.length-(maxnumclientes-contador);i++ ) {
			if (clientes[i].getDNI().equals(DNI)) {
				Cliente.to_String(clientes[i]);
				}}
		
		System.out.println();
		System.out.println();
		
		
		}
		
		public static void mostrarVisitas() {
			for (int i = 0; i < visitas.length-(maxnumvisitas-contavisitas); i++) {
				 Visita.visitasToString(visitas[i]);}
			System.out.println();
			System.out.println();
				
			}
		
		
	
	public static void mostrarClientes() {
	System.out.println("Lista de clientes");
	System.out.println();
	for (int i = 0; i < clientes.length-(maxnumclientes-contador);i++ ) {
		Cliente.to_String(clientes[i]);
		System.out.println();
		
	}
		
		
	}
	
	public static void bajaCliente() {
		Scanner leer = new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce el DNI del cliente que quieres dar de baja :");
		String DNI = leer.next();
		System.out.println();
		for (int i = 0; i < clientes.length-(maxnumclientes-contador); i++) {
			if (clientes[i].getDNI().equals(DNI)) {
				clientes[i].setSocioFalse();}
		}
		
	}
	
	
	
	public static void setMembresiacliente() {
		Scanner leer = new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce el DNI del cliente al que quieras cambiar la membresía :");
		String DNI = leer.next();
		System.out.println();
	
		for (int i = 0; i < clientes.length-(maxnumclientes-contador); i++) {
			if (clientes[i].getDNI().equals(DNI)) {
				System.out.println("Introduce la nueva membresia");
				clientes[i].setMember(leer.next());;
				}}
		}
		
	
	
	
}
