package aragon.unam.estructuras;

public class ArbolBinarioADT {
	private NodoArbol<Integer> head;
	private int tamnio = 0;

	public ArbolBinarioADT() {

	}

	public void insert(int valor) {
		int num = 0;
		NodoArbol<Integer> aux = this.head;
		while (true) {
			if (aux == null) {
				aux.setDato(valor);
				break;
			} else {
				num = aux.getDato();
				if (valor > num) {
					aux = aux.getNodoDerecho();
				} else {
					if (valor < num) {
						aux = aux.getNodoIzquierdo();
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
		return ""; 
	}
}
