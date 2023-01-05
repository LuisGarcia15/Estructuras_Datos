package aragon.unam.estructuras;

public class ArbolBinarioADT {
	private NodoArbol<Integer> head;

	public ArbolBinarioADT() {
		this.head = new NodoArbol<>();
	}

	public void insert(int valor) {
		boolean impresion = true;
		int num = 0;
		NodoArbol<Integer> auxUno = this.head;
		NodoArbol<Integer> auxDos = auxUno;
		while (true) {
			if (auxUno.estaVacio()) {
				auxUno.setDato(valor);
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
	
	public void search(int valor) {
		
	}
	
	public String transversal (int formato) {
		String cadena = "";
		switch(formato) {
		case 1://caso 2 - pre orden
			return recorridos(formato, this.head);
			
		case 2://caso 2 - in orden
			return recorridos(formato, this.head);
			
		case 3://caso 3 - post orden
			return recorridos(formato, this.head);
		}
		return ""; 
	}
	
	private String recorridos(int num, NodoArbol<Integer> nodoIzqODer) {
		String formato = "";
		NodoArbol<Integer> aux = nodoIzqODer;
		
		switch(num){
		case 1:
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
		case 2:
			if(aux.getNodoIzquierdo() != null) {
				formato += aux.getNodoIzquierdo().getDato() + " ";
				formato += recorridos(num, aux.getNodoIzquierdo());
			}
			
			formato += aux.getDato() + " ";
			
			if(aux.getNodoDerecho() != null) {
				formato += aux.getNodoDerecho().getDato() + " ";
				formato += recorridos(num, aux.getNodoDerecho());
			}
	
			return formato;
		case 3:
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
	

