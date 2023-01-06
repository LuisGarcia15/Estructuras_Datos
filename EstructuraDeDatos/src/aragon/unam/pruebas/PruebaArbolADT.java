package aragon.unam.pruebas;

import aragon.unam.estructuras.ArbolBinarioADT;

public class PruebaArbolADT {
	public static void main(String[] args) {
		ArbolBinarioADT arbol = new ArbolBinarioADT();
		arbol.insert(100);
		arbol.insert(90);
		arbol.insert(95);
		//arbol.insert(80);
		//arbol.insert(85);
		//arbol.insert(70);
		
		System.out.println("Pre orden: " + arbol.transversal(1));
		
		//System.out.println("Tamaño: " + arbol.getTamanio());
		//System.out.println("Existe el 50?: " + arbol.search(50));
		//System.out.println("Existe el 60?: " + arbol.search(60));
		//System.out.println("Existe el 40?: " + arbol.search(40));
		//System.out.println("Existe el 45?: " + arbol.search(45));
	}
}
