package aragon.unam.estructuras;

import java.util.ArrayList;

public class ArrayADTModificada<T> {
	private int tamanio;
	private ArrayList<ListaLigadaADTModificada<T>> datos;
	private int numeroDeElementos;

	public ArrayADTModificada(int tamaño) {
		this.tamanio = tamaño;
		this.datos = new ArrayList<ListaLigadaADTModificada<T>>();

		for (int i = 0; i < this.tamanio; i++) {
			this.datos.add(null);
		}

	}
	
	public int getNumeroDeElementos() {
		return numeroDeElementos;
	}
	
	public void setNumeroDeElementos(int numeroDeElementos) {
		this.numeroDeElementos = numeroDeElementos;
	}

	public ListaLigadaADTModificada<T> getItem(int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			return datos.get(indice);
		}

		return null;
	}

	public void setItem(ListaLigadaADTModificada<T> lista, int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			if(lista != null && (lista.equals(this.datos.get(indice)) || this.datos.get(indice) != null)){
				this.datos.set(indice, lista);
			}else {
				if(lista == null) {
					this.datos.set(indice, lista);
					this.numeroDeElementos--;
				}else {
				this.datos.set(indice, lista);
				this.numeroDeElementos++;
				}
			}
		}
	}

	public int getLength() {
		return this.tamanio;
	}


	@Override
	public String toString() {
		int contador = 0;
		String estado = "------------- "+ this.tamanio +" -------------\n";
        for (ListaLigadaADTModificada<T> dato: datos) {
            if(dato != null){
                estado += contador + "-" + dato.toString()+"\n";
                contador++;
            }
        }
        return estado;
	}
}