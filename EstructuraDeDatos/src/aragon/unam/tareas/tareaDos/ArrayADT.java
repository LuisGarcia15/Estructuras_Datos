package aragon.unam.tareas.tareaDos;

import java.util.ArrayList;

public class ArrayADT<T> {
	private int tamanio;
	private ArrayList<T> datos;

	public ArrayADT(int tamanio) {
		this.tamanio = tamanio;
		this.datos = new ArrayList<T>();

		for (int i = 0; i < this.tamanio; i++) {
			this.datos.add(null);
		}

	}

	public T getItem(int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			return datos.get(indice);
		}

		return null;
	}

	public void setItem(T elemento, int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			datos.set(indice, elemento);
		}
	}

	public int getLength() {
		return this.tamanio;
	}

	public void clear(T parametro) {
		for (int i = 0; i < this.tamanio; i++) {
			this.datos.set(i, parametro);
		}
	}

	@Override
	public String toString() {
		return "ArrayADT [tama�o=" + tamanio + ", datos=" + datos.getClass() + "]";
	}

}

class Pruebas {
	public static void main(String[] args) {

		ArrayADT<Integer> enteros = new ArrayADT<Integer>(5);
		ArrayADT<String> cadenas = new ArrayADT<String>(5);

		System.out.println("Método setItem()");
		for (int i = 0; i < enteros.getLength(); i++) {
			enteros.setItem(i + 1, i);
			cadenas.setItem("Abecedario".substring(i, 10), i);
		}

		System.out.println();

		System.out.println("Método getItem()");
		for (int i = 0; i < enteros.getLength(); i++) {
			System.out.println(enteros.getItem(i));
			System.out.println(cadenas.getItem(i));
		}

		System.out.println();

		System.out.println("Método getLength()");
		System.out.println("La longitud del Array enteros es: " + enteros.getLength());
		System.out.println("La longitud del Array cadenas es: " + cadenas.getLength());

		System.out.println();

		System.out.println("Método clear()");
		enteros.clear(100);
		cadenas.clear("Universidad");
		for (int i = 0; i < enteros.getLength(); i++) {
			System.out.println(enteros.getItem(i));
			System.out.println(cadenas.getItem(i));
		}

		System.out.println();

		System.out.println("Método toString()");
		System.out.println("Método toString del Array enteros es: " + enteros);
		System.out.println("Método toString del Array cadenas es: " + cadenas);
	}
}