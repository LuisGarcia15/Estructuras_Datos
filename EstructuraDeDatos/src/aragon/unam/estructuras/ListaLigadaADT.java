/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aragon.unam.estructuras;

/**
 *
 * @author Cabrera
 */
public class ListaLigadaADT<T> {

    Nodo<T> head;
    int tamanio;

    public ListaLigadaADT() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(T valor) {
        Nodo nuevo = new Nodo(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tamanio++;
        } else {
            Nodo aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.tamanio++;
        }
    }

    public void agregarAlInicio(T valor) {
        Nodo nuevo = new Nodo(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tamanio++;
        } else {
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
            this.tamanio++;
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        Nodo nuevo = new Nodo(valor);
        Nodo aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
        this.tamanio++;
    }

    public void eliminar(int posicion){
        Nodo aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        this.tamanio--;
    }
    
    public void eliminarElPrimero() {
    	if(this.head != null) {
    	Nodo aux = this.head;
    	aux = aux.getSiguiente();
    	this.head = aux;
    	this.tamanio--;
    	}
    }
    
    public void eliminarElFinal() {
    	
    }
    
    public int buscarElemento(T dato) {
    	return 0;
    }
    
    public void actualizar(T valorABuscar, T valorParaActualizar) {
    	
    }
    
    public void transversal() {
        Nodo curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }

}
