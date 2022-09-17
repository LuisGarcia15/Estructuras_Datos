package aragon.unam.pruebas;

import aragon.unam.estructuras.ListaLigadaADT;

public class PruebasListaLigadaADT {
	public static void main(String[] args) {
        System.out.println("Probando implementación 2 de Lista Ligada");
        ListaLigadaADT<Integer> l = new ListaLigadaADT();
        l.transversal();
        System.out.println(l.buscarElemento(1));
        l.eliminarElFinal();
        l.transversal();
        l.eliminarElPrimero();
        l.transversal();
        System.out.println("Creación y agregación de nodos");
        l.agregarAlFinal(5);
        l.agregarAlFinal(10);
        l.agregarAlFinal(12);
        l.agregarAlFinal(20);
        l.agregarAlFinal(25);
        l.transversal();
        System.out.println("Actualiza el dato de un objeto del nodo");
        l.actualizar(12, 14);
        l.transversal();
        System.out.println("Busca el indice de un dato dado");
        System.out.println(l.buscarElemento(25));
        System.out.println("Elimina el nodo final");
        l.eliminarElFinal();
        l.transversal();
        System.out.println("Eliminar el nodo del principio");
        l.eliminarElPrimero();
        l.transversal();
        System.out.println("Elimina el nodo de un indice dado");
        l.eliminar(1);
        l.transversal();
        System.out.println("Agrega un nodo luego del nodo del objeto dado");
        l.agregarDespuesDe(15, 2);
        l.transversal();
        System.out.println("Agrega al inicio un nodo con el objeto dado");
        l.agregarAlInicio(1);
        l.transversal();
        System.out.println("Agrega al final un nodo con el objeto dado");
        l.agregarAlFinal(100);
        l.transversal();
        System.out.println("El tamaño es: " + l.getTamanio());
        System.out.println("¿Esta vacia?: " + l.estaVacia());
        System.out.println("Agrega un nodo luego del nodo del objeto dado");
        l.agregarDespuesDe(60, 2);
        l.transversal();
        System.out.println("El tamaño es: " + l.getTamanio());
        System.out.println("Elimina el nodo de un indice dado");
        l.eliminar(1);
        l.transversal();
        System.out.println("Devuelve el indice donde se encuentre el objeto");
        System.out.println(l.buscarElemento(88));
        l.transversal();
        System.out.println("Actualiza el objeto de un nodo, lo encuentra por el objeto que tiene antes de cambiarlo");
        l.actualizar(79, 200);
        l.transversal();
	}
}
