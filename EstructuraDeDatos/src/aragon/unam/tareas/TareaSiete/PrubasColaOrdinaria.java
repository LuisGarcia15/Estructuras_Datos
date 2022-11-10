package aragon.unam.tareas.TareaSiete;

import aragon.unam.estructuras.ColaADT;

public class PrubasColaOrdinaria {
	public static void main(String[] args) {
		//Probando Constructor
		ColaADT<String> cola =  new ColaADT<>();
		//Probando método isEmty 1/2
		System.out.printf("%50s %n","Prueba de ColaADT - Tarea 7");
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Esta vacia?: " + cola.isEmpty());
		//Probando toString, método enqueue y método length
		cola.enqueue("Perro");
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		//Probando método isEmpty 2/2
		System.out.println("Esta Vacia?: " + cola.isEmpty());
		cola.enqueue("Gato");
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		cola.enqueue("Oveja");
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		cola.enqueue("Elefante");
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		//Probando método dequeue
		System.out.println("Eliminando y retornando elemento de la cola");
		System.out.println(cola);
		System.out.println("Recuperanco #1: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Recuperanco #2: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Recuperanco #3: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Recuperanco #4: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());

	}
}
