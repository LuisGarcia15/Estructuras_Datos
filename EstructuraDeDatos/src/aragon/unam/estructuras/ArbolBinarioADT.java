package aragon.unam.estructuras;

public class ArbolBinarioADT {
	private NodoArbol<Integer> head;
	int tamanio = 0;

	public ArbolBinarioADT() {
		this.head = new NodoArbol<>();
	}

	public int getTamanio() {
		return this.tamanio;
	}
	public void insert(int valor) {
		int num = 0;
		NodoArbol<Integer> auxUno = this.head;
		NodoArbol<Integer> auxDos = auxUno;
		while (true) {
			if (auxUno.estaVacio()) {
				auxUno.setDato(valor);
				tamanio++;
				break;
			} else {
				num = auxDos.getDato();
				if (valor > num) {
					auxDos = auxUno;
					auxUno.setNodoDerecho(new NodoArbol<>());
					auxUno = auxUno.getNodoDerecho();
				} else {
					if (valor < num) {
						auxDos = auxUno;
						auxUno.setNodoIzquierdo(new NodoArbol<>());
						auxUno = auxUno.getNodoIzquierdo();
					} else {
						break;
					}
				}
			}
		}
	}
	
	public void remover(int valor) {
		
	}
	
	public boolean search(int valor) {
		int num = 0;
		NodoArbol<Integer> auxUno = this.head;
		NodoArbol<Integer> auxDos = auxUno;
		while (true) {
			if (auxUno.getDato() == valor) {
				return true;
			} else {
				if(auxUno.getNodoDerecho() != null | auxUno.getNodoIzquierdo() != null) {
				num = auxDos.getDato();
				if (valor > num) {
					auxDos = auxUno;
					auxUno = auxUno.getNodoDerecho();
				} else {
					if (valor < num) {
						auxDos = auxUno;
						auxUno = auxUno.getNodoIzquierdo();
					} 
					}
				}else {
					return false;
				}
			}
		}
	}
	
	public String transversal (int formato) {
		return recorridos(formato, this.head);
	}
	
	private String recorridos(int num, NodoArbol<Integer> nodoIzqODer) {
		String formato = "";
		NodoArbol<Integer> aux = nodoIzqODer;
		
		switch(num){
		case 1://Pre Orden
			if(aux.getDato() == null){
				formato += null + " ";
				return formato;
			}
			
			formato += aux.getDato() + " ";
			
			if(aux.getNodoIzquierdo() != null) {
				formato += recorridos(num, aux.getNodoIzquierdo());
			}
			
			if(aux.getNodoDerecho() != null) {
				formato += recorridos(num, aux.getNodoDerecho());
			}
	
			return formato;
		case 2: //In Orden
			if(aux.getNodoIzquierdo() != null) {
				formato += recorridos(num, aux.getNodoIzquierdo());
			}
			
			formato += aux.getDato() + " ";
			
			if(aux.getNodoDerecho() != null) {
				formato += recorridos(num, aux.getNodoDerecho());
			}
	
			return formato;
		case 3://Post-Orden
			if(aux.getNodoIzquierdo() != null) {
				formato += recorridos(num, aux.getNodoIzquierdo());
			}
			
			if(aux.getNodoDerecho() != null) {
				formato += recorridos(num, aux.getNodoDerecho());
			}
			
			if(aux.getDato() == null){
				formato += null + " ";
				return formato;
			}
			
			formato += aux.getDato() + " ";
			return formato;
			}
		return "";
		}
	}
	

