package aragon.unam.pruebas;

import aragon.unam.estructuras.ArbolBinarioADT;

public class PruebaArbolADT {
	public static void main(String[] args) {
		String representacion = "";
		ArbolBinarioADT arbol = new ArbolBinarioADT();
		arbol.insert(50);
		arbol.insert(60);
		arbol.insert(40);
		
		representacion = arbol.transversal(2);
		
		System.out.println(representacion);
			
	}
}
