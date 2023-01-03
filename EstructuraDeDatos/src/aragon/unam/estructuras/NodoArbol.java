package aragon.unam.estructuras;

public class NodoArbol<T>{
    private T dato;
    private NodoArbol<T> nodoIzquierdo;
    private NodoArbol<T> nodoDerecho;
    
    public NodoArbol() {
    }

    public NodoArbol(T valor) {
        this.dato = valor;
    }

    public NodoArbol(T dato, NodoArbol<T> nodoIzquierdo,
    		NodoArbol<T> nodoDerecho) {
        this.dato = dato;
        this.nodoIzquierdo = nodoIzquierdo;
        this.nodoDerecho = nodoDerecho;
    }

    public NodoArbol(T dato, NodoArbol<T> nodoIzquierdo) {
        this.dato = dato;
        this.nodoIzquierdo = nodoIzquierdo;
    }
    
    public NodoArbol(NodoArbol<T> nodoDerecho, T dato) {
        this.dato = dato;
        this.nodoDerecho = nodoDerecho;
    }

    public NodoArbol<T> getNodoIzquierdo() {
		return nodoIzquierdo;
	}

	public void setNodoIzquierdo(NodoArbol<T> nodoIzquierdo) {
		this.nodoIzquierdo = nodoIzquierdo;
	}

	public NodoArbol<T> getNodoDerecho() {
		return nodoDerecho;
	}

	public void setNodoDerecho(NodoArbol<T> nodoDerecho) {
		this.nodoDerecho = nodoDerecho;
	}

	public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}