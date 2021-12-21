package Packagey_McPackage;

import java.util.Date;

public class Visita {
	private String DNI;
	private String Nombre;
	private int factura;
	private Cliente prueba;
	private Date fecha;
	
public Visita( Cliente objeto,Date fecha) {
	this.prueba = objeto;
	this.factura = 0;
	this.DNI = objeto.getDNI();
	this.Nombre = objeto.getNombre();
	this.fecha = fecha;
	
}
	
public void setImporte(int importe , Visita objeto) {
	if(prueba.getSocio()==true) {
	int importefinal = (importe-(importe*Cliente.getDescuento(this.prueba)/100));
	objeto.factura= importefinal;
	}else
	objeto.factura= 0;
	
}	

public static void visitasToString(Visita objeto) {
	System.out.println("El nombre del cliente es "+ objeto.Nombre );
	System.out.println("Visita :" + objeto.factura+"€");
	System.out.println(objeto.getDate().toString());
	
	
}


public Date getDate() {
	return this.fecha;
	
}

public String getDNIVisita() {
	return this.DNI;
}

	
	}
