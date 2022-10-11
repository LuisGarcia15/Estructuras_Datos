package aragon.unam.estructuras;

import java.util.ArrayList;

public class StackADT <T>{
	ArrayList<T> pila;

	public StackADT() {
		this.pila = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return this.pila.isEmpty();
	}
	
	public int length() {
		return this.pila.size();
	}
	
	public T pop(){
		if(!this.pila.isEmpty()) {
		T elemento = this.pila.get(this.pila.size()-1);
		this.pila.remove(this.pila.size()-1);
		return elemento;
		}
		return null;
	}
	
	public T peek() {
		if(!this.pila.isEmpty()) {
		T elemento = this.pila.get(this.pila.size()-1);
		return elemento;
		}
		return null;
	}
	
	public void push(T valor){
		this.pila.add(valor);
	}
	
	@Override
	public String toString() {
		String pila = "";
		if(this.pila.isEmpty()) {
			pila += "| | \n";
		}else {
		@SuppressWarnings("unchecked")
		ArrayList<T> copiaPila = (ArrayList<T>) this.pila.clone();
		String []matriz = new String[copiaPila.size()];
		int contador = matriz.length, contador2 = 0;
		for(int i = contador; i > 0; i--) {
			matriz[contador2] = String.valueOf(copiaPila.get(copiaPila.size()-1));
			copiaPila.remove(copiaPila.size()-1);
			contador2++;
			}
		for (String s : matriz) {
			pila += "|" + s + "| \n";
			}
		}
		return pila;
	}
}
