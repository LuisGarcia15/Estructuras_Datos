package aragon.unam.estructuras;

import java.util.ArrayList;

public class StackADT2 <T>{
	ListaLigadaADT<T> pila;

	public StackADT2() {
		this.pila = new ListaLigadaADT<>();
	}
	
	public boolean isEmpty() {
		return this.pila.estaVacia();
	}
	
	public int length() {
		return this.pila.getTamanio();
	}
	
	public T pop(){
		if(!this.pila.estaVacia()) {
		this.pila.eliminarElFinal();
		}
		return null;
	}
	
	public T peek() {
		int contador = 0;
		if(!this.pila.estaVacia()) {
		for (T t : pila) {
				if(contador == this.pila.getTamanio()) {
					return t;
				}
				contador++;
			}
		}
		return null;
	}
	
	public void push(T valor){
		this.pila.agregarAlFinal(valor);
	}
	
	@Override
	public String toString() {
		String pila = "";
		if(this.pila.estaVacia()) {
			pila += "| | \n";
		}else {
		int contador = this.pila.getTamanio();
		int contador2 = 1;
		while(contador > 0) {
			for (T t : this.pila) {
				if(contador2 == contador) {
					pila += "|" + t + "| \n";
					contador--;
					contador2 = 1;
					break;
				}else {
					contador2++;
					}
				}
			}
		}
		return pila;
	}
}
