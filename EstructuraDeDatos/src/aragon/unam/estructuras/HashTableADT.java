package aragon.unam.estructuras;

public class HashTableADT <T>{
	private ArrayADTModificada<T> tabla;
	private	ArrayADTModificada<String> keys;
	private ColaADT<String> colaLLaves;
	private ColaADT<Integer> colaIndices;

	public HashTableADT(int tamanio) {
		if(tamanio >= 7) {
		tabla = new ArrayADTModificada<>(tamanio);
		keys = new ArrayADTModificada<>(tamanio);
		colaLLaves = new ColaADT<>();
		colaIndices =  new ColaADT<>();
		}
	}
	
	public void add(String key, T valor) {
		int indice = this.funcionHash(key);//obtiene el indice
		if(this.tabla.getItem(indice) == null) {//verifica si la lista ligada en un indice en nula
			this.keys.setItem(new ListaLigadaADTModificada<String>(), indice);
			this.tabla.setItem(new ListaLigadaADTModificada<T>(), indice);//si es nula, agrega una lista ligada a ese indice
			this.keys.getItem(indice).agregarAlFinal(key);
			this.tabla.getItem(indice).agregarAlFinal(valor);//agrega el valor t a la lista ligada
			this.colaLLaves.enqueue(key);//guarda la llave en la cola de llaves
			this.colaIndices.enqueue(indice);// guarda el indice en la cola de llaves
		}else {// si la lista ligada no es nula
			if(this.tabla.getItem(indice).getTamanio() == this.tabla.getItem(indice).getTamanioRestringido()) {
				//y el tamanio de la lista es igual al tamanio restringido
				int indiceAux = 0;//se declara una variable
				this.tabla.getItem(indice).setTamanioRestringido(this.tabla.getItem(indice).getTamanioRestringido() + 5);
				//se le aumentan en 10 al numero del tamanio restringido
				this.keys.getItem(indice).setTamanioRestringido(this.keys.getItem(indice).getTamanioRestringido() + 5);
				this.tabla.getItem(indice).agregarAlFinal(valor);//se agrega al final el valor
				ArrayADTModificada<T> tabla2 = new ArrayADTModificada<>(this.tabla.getLength() + 2);
				ArrayADTModificada<String> keys2 = new ArrayADTModificada<>(this.keys.getLength() + 2);
				//Se crea un nuevo arreglo con 2 casillas extra de la que habia anteriormente
				while(!this.colaLLaves.isEmpty() && !this.colaLLaves.isEmpty()) {
					String llave = colaLLaves.dequeue();
					int indices = colaIndices.dequeue();
					//Se inicia un ciclo while que itera hasta que las colas llave e indice esten vacias
				indiceAux= this.funcionHash(llave);
				//Se obtiene en la variable declarada un nuevo indice para la nueva tabla hash junto con la cola llaves 
				tabla2.setItem(this.tabla.getItem(indices), indiceAux);
				//de la cola indicices se van almacenando las listas que ya se tenian junto con los nuevos indices obtenidos
				keys2.setItem(this.keys.getItem(indice), indiceAux);
				}
				this.tabla = tabla2;
				//una ves se acaba el ciclo while, el atributo tabla se le asigna la nueva tabla hash
				this.keys = keys2;
			}else {
				int contador = 1;
				boolean entrada = false;
				for (String item : this.keys.getItem(indice)) {
					if(key.equals(item)) {
						entrada = true;
						break;
					}else {
						contador++;
					}
				}
				if(entrada) {
					this.tabla.getItem(indice).agregarDespuesDe(valor, (contador-1));
					this.tabla.getItem(indice).eliminar(contador);
				}else {
				//Si el indice no es igual al tamaño restringido
				this.tabla.getItem(indice).agregarAlFinal(valor);
				//Se agrega un valor a la lista ligada en un cierto indice
				this.keys.getItem(indice).agregarAlFinal(key);
				}
			}
		}
		
	}
	
	public T valueOf(String key) {
		int indice = this.funcionHash(key), contadorLlave = 1, contadorValor = 1;
			for (String item : this.keys.getItem(indice)){
				if(key.equals(item)) {
					break;
				}else {
					contadorLlave++;
				}
			}
			for (T valor : this.tabla.getItem(indice)) {
				if(contadorValor == contadorLlave) {
					return valor;
				}else {
					contadorValor++;
				}
			}
		return null;
	}
	
	public void remove(String key) {
		int indice = this.funcionHash(key), contador = 1;
		boolean entrada = false;
		for (String item : this.keys.getItem(indice)) {
			if(key.equals(item)) {
				this.keys.getItem(indice).eliminar(contador);
				entrada = true;
				break;
			}else {
				contador++;
			}
		}
		if(entrada) {
		this.tabla.getItem(indice).eliminar(contador);
		}
		}
	
	private int funcionHash(String key) {
		int indice = 0;
		for(int i = 0; i < key.length(); i++) {
			indice += key.charAt(i);
		}
		indice = indice % this.tabla.getLength();
		return indice;
	}
	
	@Override
	public String toString() {
		String estado = "";
		int contador = 0;
		for (int i = 0; i < this.tabla.getLength(); i++) {
			estado += contador + " --- " + this.tabla.getItem(i) + "\n";
			contador++;
		}
		
		return estado;
	}
	
	
	
}
