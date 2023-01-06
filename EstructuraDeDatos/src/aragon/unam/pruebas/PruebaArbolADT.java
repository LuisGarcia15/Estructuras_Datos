package aragon.unam.pruebas;

import aragon.unam.estructuras.ArbolBinarioADT;

public class PruebaArbolADT {
	public static void main(String[] args) {
		ArbolBinarioADT arbol = new ArbolBinarioADT();
		arbol.insert(100);
		arbol.insert(90);
		arbol.insert(95);
		arbol.insert(80);
		arbol.insert(85);
		arbol.insert(70);
		arbol.insert(110);
		arbol.insert(109);
		arbol.insert(111);
		arbol.insert(118);
		arbol.insert(115);
		
		System.out.println("Pre orden: " + arbol.transversal(1));
		System.out.println("In orden: " + arbol.transversal(2));
		System.out.println("Post orden: " + arbol.transversal(3));
		System.out.println("False");
		System.out.println("Existe el 50?: " + arbol.search(50));
		System.out.println("Existe el 60?: " + arbol.search(60));
		System.out.println("Existe el 40?: " + arbol.search(40));
		System.out.println("Existe el 45?: " + arbol.search(45));
		System.out.println("true");
		System.out.println("Existe el 100?: " + arbol.search(100));
		System.out.println("Existe el 90?: " + arbol.search(90));
		System.out.println("Existe el 95?: " + arbol.search(95));
		System.out.println("Existe el 80?: " + arbol.search(80));
		System.out.println("Existe el 85?: " + arbol.search(85));
		System.out.println("Existe el 70?: " + arbol.search(70));
		System.out.println("Existe el 110?: " + arbol.search(110));
		System.out.println("Existe el 109?: " + arbol.search(109));
		System.out.println("Existe el 111?: " + arbol.search(111));
		System.out.println("Existe el 118?: " + arbol.search(118));
		System.out.println("Existe el 115?: " + arbol.search(115));
	}
}
