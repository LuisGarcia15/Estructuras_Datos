package aragon.unam.pruebas;

import aragon.unam.estructuras.ListaLigadaADT;

public class PruebasListaLigadaADT {
	public static void main(String[] args) {
		System.out.println("Probando implementación de Lista Ligada");
        ListaLigadaADT<Integer> lista = new ListaLigadaADT();
        lista.agregarAlFinal(10);
        lista.transversal();
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(40);
        lista.transversal();
        lista.agregarAlInicio(100);
        lista.transversal();
        lista.agregarDespuesDe(42, 3);
        lista.transversal();
        lista.eliminar(2);
        lista.transversal();
        lista.eliminarElPrimero();
        lista.transversal();
        System.out.println(lista.getTamanio());
	}
}
