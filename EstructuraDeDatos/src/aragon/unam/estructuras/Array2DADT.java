package aragon.unam.estructuras;

public class Array2DADT<T> {

	private int filas;
	private int columnas;
	private ArrayADT<ArrayADT<T>> array;

	public Array2DADT(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		array = new ArrayADT<>(columnas);

		for (int i = 0; i < array.getLength(); i++) {
			array.setItem(new ArrayADT<>(filas), i);
		}
	}

	public int getFilas() {
		return this.filas;
	}

	public int getColumnas() {
		return this.columnas;
	}

	public void setElemento(T dato, int filas, int columnas) {
		this.array.getItem(columnas).setItem(dato, filas);
	}

	public T getElemento(int filas, int columnas) {
		return this.array.getItem(columnas).getItem(filas);
	}

	public void limpiar(T dato) {
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				this.setElemento(dato, i, j);
				;
			}
		}
	}

	@Override
	public String toString() {
		String array = "";
		for (int i = 0; i < this.filas; i++) {
			for (int j = 0; j < this.columnas; j++) {
				array += this.getElemento(i, j) + " ";
			}
			array += "\n";
		}
		return array;
	}
	 
	
}