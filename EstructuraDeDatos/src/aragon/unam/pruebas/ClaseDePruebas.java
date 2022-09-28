package aragon.unam.pruebas;

import aragon.unam.estructuras.ListaDoblementeLigadaADT;
import aragon.unam.estructuras.ListaDoblementeLigadaADT2DaVersion;
import aragon.unam.estructuras.ListaLigadaADT;
import aragon.unam.estructuras.Nodo;
import aragon.unam.estructuras.NodoDoble;

public class ClaseDePruebas {
	public static void main(String[] args) {
		ListaDoblementeLigadaADT2DaVersion<Integer> i = new ListaDoblementeLigadaADT2DaVersion<>();
		i.agregarAlInicio(1);
		i.eliminarElPrimero();
		System.out.println(i.getTamanio());
		i.transversal(true);
	}
	
}
