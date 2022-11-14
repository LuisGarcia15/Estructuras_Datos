package aragon.unam.estructuras;

public class HashTableADT <T>{
	private ArrayADT<T> tabla;
	//BoRRA
	public HashTableADT(int tamanio) throws Throwable {
		if(tamanio >= 7 && tamanio % tamanio == 0 && tamanio % 1 == 0) {
		this.tabla = new ArrayADT<>(tamanio);
		}else {
			throw new Exception("El tamanio debe ser mayor "
					+ "a 7 y un numero primo");
		}
	}
	
	
}
