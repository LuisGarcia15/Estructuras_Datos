package aragon.unam.pruebas;

import aragon.unam.estructuras.ColaAcotadaADT;

public class PruebasColaAcotada {
	public static void main(String[] args) {
		//Probando Constructor, prioridad 3
		ColaAcotadaADT<String> cola =new ColaAcotadaADT<>(3);
		
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Esta vacia?: " + cola.isEmpty());
		System.out.println(cola);
		
		cola.enqueue(1, "Luis");
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Esta vacia?: " + cola.isEmpty());
		System.out.println(cola);
		
		cola.enqueue(1, "Gustavo");
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola); 
		
		cola.enqueue(2, "Jose");
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		
		cola.enqueue(2, "Garcia");
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		
		cola.enqueue(3, "Elena");
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		
		cola.enqueue(3, "Lara");
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		
		System.out.println("Recuperando el elemento con mas prioridad");
		System.out.println(cola);
		System.out.println("Elemento recuperado: " + cola.dequeue());
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		System.out.println("Elemento recuperado: " + cola.dequeue());
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		System.out.println("Elemento recuperado: " + cola.dequeue());
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		System.out.println("Elemento recuperado: " + cola.dequeue());
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		System.out.println("Elemento recuperado: " + cola.dequeue());
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		System.out.println("Elemento recuperado: " + cola.dequeue());
		System.out.println("Tamanio: " + cola.length());
		System.out.println(cola);
		
	}
}
