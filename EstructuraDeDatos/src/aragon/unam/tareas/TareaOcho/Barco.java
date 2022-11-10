package aragon.unam.tareas.TareaOcho;

import aragon.unam.estructuras.ColaAcotadaADT;

public class Barco {
	public static void main(String[] args) {
		ColaAcotadaADT<String> barco = new ColaAcotadaADT<>(7);
		String personas[] = {"Maestre", "Ninios", "Mecanico"
				, "Mujeres", "3era Edad", "Ninias", "Hombres"
				, "Vigia", "Capitan", "Timonel"};
		String personajes = "";
		
		for (int i = 0; i < personas.length; i++) {
			personajes += "|" + personas[i] + "| ";
		}
	
		System.out.printf("%50s %n","Prueba de ColaAcotadaADT - Tarea 8");
		System.out.println(personajes);
		System.out.println("-------------------------");
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(4, personas[0]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(2, personas[1]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(4, personas[2]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(3, personas[3]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(2, personas[4]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(1, personas[5]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(3, personas[6]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(4, personas[7]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(5, personas[8]);
		System.out.println(barco);
		System.out.println("-------------------------");
		barco.enqueue(4, personas[9]);
		System.out.println(barco);
		System.out.println("-------------------------");
		System.out.println("Recuperando el elemento con mas prioridad");
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
		System.out.println("Elemento recuperado: " + barco.dequeue());
		System.out.println(barco);
	}
}
