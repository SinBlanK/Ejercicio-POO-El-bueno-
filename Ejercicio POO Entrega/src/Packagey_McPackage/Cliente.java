package Packagey_McPackage;

public class Cliente {
private   String Nombre;
private  String DNI;
private  boolean Socio;
private String  Membresia;




public Cliente(String Nombre,String DNI, String Membresia,String socio) {
	this.DNI=DNI;
	this.Nombre=Nombre;
	if (socio.equals("si")  || socio.equals("SI") ||  socio.equals("Si") ) {
	this.Socio=true;
	}
	this.Membresia=Membresia;
	
}
	
public Cliente(String Nombre , String DNI) {
	this.DNI=DNI;
	this.Nombre=Nombre;
	this.Socio = false;
	
}

public String getNombre() {
	return this.Nombre;
}

public String getDNI() {
	
	return this.DNI;
}

public boolean setSocioFalse() {
	this.Membresia = "ninguna";
	return this.Socio = false;
	
}


public static int getDescuento(Cliente objeto) {
	if (objeto.Socio == true && objeto.Membresia.equals("Platino")) {
		return 10;
	}else if(objeto.Socio == true && objeto.Membresia.equals("Oro")) {
		return 15;
	}else if( objeto.Membresia.equals("Premium")&& objeto.Socio == true ) {
		return 20;
	}else {
		return 0;
	}
	
	}

public boolean getSocio() {
	return this.Socio;
}

public static void to_String(Cliente objeto) {
	System.out.println("Nombre : "+objeto.Nombre+"\n"+"DNI : "+objeto.DNI);
	if (objeto.Membresia == null) {
		System.out.println("Membresia : ninguna");
	}else if(objeto.Membresia != null) {
		System.out.println("Membresia :" + objeto.Membresia);
	}if(objeto.Socio == true) {
		System.out.println("Socio : si");
	}else {System.out.println("Socio : no");}
	
	
}



public void setMember(String membresia) {
	
	this.Membresia = membresia;
	this.Socio = true;
	
}







}
