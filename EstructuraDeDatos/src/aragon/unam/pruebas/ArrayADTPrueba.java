package aragon.unam.pruebas;

import aragon.unam.tareas.tareaDos.ArrayADT;

public class ArrayADTPrueba {
	public static void main(String[] args) {
		ArrayADT<Integer> a =  new ArrayADT<Integer>(3);
		a.setItem(1, 0);
		a.setItem(2, 1);
		a.setItem(3, 2);
		
		System.out.println(a.toString());
	}
}
