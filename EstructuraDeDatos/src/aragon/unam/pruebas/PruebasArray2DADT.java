package aragon.unam.pruebas;

import aragon.unam.estructuras.Array2DADT;

public class PruebasArray2DADT {
	public static void main(String[] args) {
		
		Array2DADT<Integer> array = new Array2DADT<>(4, 3);
		
		array.setElemento(1, 0, 0);
		array.setElemento(2, 0, 1);
		array.setElemento(3, 0, 2);
		array.setElemento(4, 1, 0);
		array.setElemento(5, 1, 1);
		array.setElemento(6, 1, 2);
		array.setElemento(7, 2, 0);
		array.setElemento(8, 2, 1);
		array.setElemento(9, 2, 2);
		array.setElemento(10, 3, 0);
		array.setElemento(11, 3, 1);
		array.setElemento(12, 3, 2);
		
		System.out.println(array);
		array.limpiar(100);
		System.out.println("+++++++++++++++");
		System.out.println(array);
		
		/*for(int i = 0; i < array.getFilas(); i++) {
		for (int j = 0; j < array.getColumnas(); j++) {
			System.out.print(array.getElemento(i, j) + "-");
			System.out.print("["+i+","+j+"]    ");
		}
		System.out.println("");
		}*/
		
	}
}