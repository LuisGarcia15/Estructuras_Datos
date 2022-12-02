package aragon.unam.pruebas;

import aragon.unam.estructuras.HashTableADT;

public class PruebaTablaHash {
	public static void main(String[] args) {
		HashTableADT<Integer> prueba = new HashTableADT<>(7);
	
		System.out.printf("%50s %n", "Prueba del ADT TablaHash");
		System.out.printf("%27S %n","probando el metodo add()");
		prueba.add("uno", 1);
		prueba.add("dos", 2);
		prueba.add("tres", 3);
		prueba.add("cuatro", 4);
		prueba.add("cinco", 5);
		prueba.add("seis", 6);
		prueba.add("siete", 7);
		prueba.add("ocho", 8);
		prueba.add("nueve", 9);
		prueba.add("diez", 10);
		System.out.println(prueba);
		System.out.printf("%31S %n","probando el metodo valueOf()");
		System.out.println("Obteniendo valor de llave \"dos\": " + prueba.valueOf("dos"));
		System.out.println(prueba);
		System.out.println("Obteniendo valor de llave \"cuatro\": " + prueba.valueOf("cuatro"));
		System.out.println("Obteniendo valor de llave \"seis\": " + prueba.valueOf("seis"));
		System.out.println("Obteniendo valor de llave \"ocho\": " + prueba.valueOf("ocho"));
		System.out.println("Obteniendo valor de llave \"diez\": " + prueba.valueOf("diez") + "\n");
		System.out.printf("%30S %n","probando el metodo remove()");
		System.out.println("removiendo el valor de la llave \"uno\":");
		prueba.remove("uno");
		System.out.println(prueba);
		System.out.println("removiendo el valor de la llave \"tres\":");
		prueba.remove("tres");
		System.out.println(prueba);
		System.out.println("removiendo el valor de la llave \"cinco\":");
		prueba.remove("cinco");
		System.out.println(prueba);
		System.out.println("removiendo el valor de la llave \"siete\":");
		prueba.remove("siete");
		System.out.println(prueba);
		System.out.println("removiendo el valor de la llave \"nueve\":");
		prueba.remove("nueve");
		System.out.println(prueba);
	}
}
