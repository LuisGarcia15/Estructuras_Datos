package aragon.unam.pruebas;

import aragon.unam.estructuras.ListaDoblementeLigadaADT;
import aragon.unam.estructuras.ListaLigadaADT;
import aragon.unam.estructuras.Nodo;
import aragon.unam.estructuras.NodoDoble;

public class ClaseDePruebas {
	public static void main(String[] args) {
		ListaDoblementeLigadaADT<Integer> i = new ListaDoblementeLigadaADT<>();
		i.agregarAlFinal(2);
		i.transversal();
		i.agregarAlInicio(1);
		i.transversal();
		i.agregarAlInicio(10);
		i.transversal();
		i.agregarDespuesDe(100, 1);
		i.transversal();
		i.eliminar(2);
		i.transversal();
		i.eliminarElPrimero();
		i.transversal();
		i.eliminarElFinal();
		i.transversal();
		System.out.println(i.buscarElemento(1));
		i.actualizar(1, 100000);
		i.transversal();
		i.agregarAlFinal(2);
		i.agregarAlFinal(3);
		i.agregarAlFinal(4);
		i.transversal();
		i.actualizar(4, 100);
		i.transversal();
		System.out.println(i.buscarElemento(100));
		
	}
}
