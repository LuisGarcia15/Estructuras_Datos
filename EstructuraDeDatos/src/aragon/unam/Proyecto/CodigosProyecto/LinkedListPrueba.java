package aragon.unam.Proyecto.CodigosProyecto;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class LinkedListPrueba {
	public static void main(String[] args) {
		boolean fin = true;
		LinkedList<Integer> listaLigada = new LinkedList<>();
		@SuppressWarnings("unused")
		int elemento, indiceUno, elementoObtenido;
		
		do {
			
			String numero = JOptionPane.showInputDialog(null, "Prueba LinkedList \n"
					+ "Lista Ligada \n"
					+ representacionLista(listaLigada) + "\n"
					+ "Indices \n \n"
					+ "1 - Agregar un elemento a la lista \n"
					+ "2 - Agregar un elemento a la lista en un lugar específico \n"
					+ "3 - Agregar un elemento al inicio de la lista \n"
					+ "4 - Agregar un elemento al final de la lista \n"
					+ "5 - Eliminar todos lo elementos de la lista \n"
					+ "6 - Verificar si existe un elemento en la lista \n"
					+ "7 - Obtener un elemento de un ínidice específico \n"
					+ "8 - Obtener el primer elemento en la lista \n"
					+ "9 - Obtener el último elemento en la lista \n"
					+ "10 - Obtener el indice de la primera aparición de un elemento \n"
					+ "11 - Devuelve un valor booleano si es posible insertar un elemento al inicio de la lista \n"
					+ "12 - Devuelve un valor booleano si es posible insertar un elemento al final de la lista \n"
					+ "13 - Recupera y elimina el primer elemento de la lista \n"
					+ "14 - Recupera y elimina el último elemento de la lista \n"
					+ "15 - Verificar si la lista esta vacia \n"
					+ "16 - Eliminar un elemento en un indice de la lista \n"
					+ "17 - Remplazar un elemento por otro en un índice dado \n"
					+ "18 - Obtener el tamanio de la lista \n"
					+ "-1 - Finalizar programa");
			switch (Integer.parseInt(numero)) {
			case 1:
				/*ingresar un dato al final de la lista con el método add()*/
				elemento = ingresaNumero();
				listaLigada.add(elemento);
				break;
			case 2:
				/*ingresar un dato en un indice especifico con el metodo add(indice, objeto)*/
				elemento = ingresaNumero();
				indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Ingresa el indice para insertar un elemento en ese indice: "));
				listaLigada.add(indiceUno, elemento);
				break;
			case 3:
				/*Ingresa un elemento al inicio de la lista con el método addFirst(elemento)*/
				elemento = ingresaNumero();
				listaLigada.addFirst(elemento);
				break;
			case 4:
				/*Ingresa un elemento al final de la lista con el método addLast(elemento)*/
				elemento = ingresaNumero();
				listaLigada.addLast(elemento);
				break;
			case 5:
				/*Elimina todos los elementos de la lista, haciendo la lista vacia con el método clear()*/
				listaLigada.clear();
				break;
			case 6:
				/*Verifica si existe un elemento en la lista con el método contains(Objeto)*/
				elemento = ingresaNumero();
				JOptionPane.showMessageDialog(null, 
						"Se encuentra el elemento " + elemento + " en la lista? \n" +
						listaLigada.contains(elemento));
				break;
			case 7:
				/*Obtiene el objeto bajo el indice ingresado con el método get(indice)*/
				indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice: "));
				elemento = listaLigada.get(indiceUno);
				JOptionPane.showMessageDialog(null, 
						"El elemento obtenido en el indice " + indiceUno + " es " + elemento);
				break;
			case 8:
				/*Obtiene el objeto contenido en el primero slot de la lista con el método getFirst()*/
				elemento = listaLigada.getFirst();
				JOptionPane.showMessageDialog(null, 
						"El elemento obtenido del principio de la lista es " + elemento);
				break;
			case 9:
				/*Obtiene el objeto contenido en el último slot de la lista con el método getLast()*/
				elemento = listaLigada.getLast();
				JOptionPane.showMessageDialog(null, 
						"El elemento obtenido del final de la lista es " + elemento);
				break;
			case 10:
				/*Obtiene el indice del objeto que se le ingrese como parámetro al método indexOf(Objeto)*/
				elemento = ingresaNumero();
				indiceUno = listaLigada.indexOf(elemento);
				JOptionPane.showMessageDialog(null, 
						"El elemento " + elemento + " aparece por primera vez en el indice " 
						+ indiceUno);
				break;
			case 11:
				/*Ingresa un elemento al inicio de la lista y regresa un true si fue posible ingresarlo
				 * de lo contrario regresa false. Esto con el método offerFirst()*/
				elemento = ingresaNumero();
				JOptionPane.showMessageDialog(null, 
						"Es posible ingresar el elemento " + elemento + " al inicio de la lista? \n"
						+ listaLigada.offerFirst(elemento));
				break;
			case 12:
				/*Ingresa un elemento al final de la lista y regresa un true si fue posible ingresarlo
				 * de lo contrario regresa false. Esto con el método offerLast()*/
				elemento = ingresaNumero();
				JOptionPane.showMessageDialog(null, 
						"Es posible ingresar el elemento " + elemento + " al final de la lista? \n"
						+ listaLigada.offerLast(elemento));
				break;
			case 13:/*Obtiene el elemento al incio de la lista y elimina el elemento obtenido
					 * del principio de la lista. Esto con el método pollFirst()*/
				elemento = listaLigada.pollFirst();
				JOptionPane.showMessageDialog(null, 
						"El el elemento " + elemento + " fue obtenido y eliminado del principio de la lista");
				break;
			case 14:/*Obtiene el elemento al final de la lista y elimina el elemento obtenido
				 * del final de la lista. Esto con el método pollLast()*/
				elemento = listaLigada.pollLast();
				JOptionPane.showMessageDialog(null, 
						"El el elemento " + elemento + " fue obtenido y eliminado del final de la lista");
				break;
			case 15:
				/*Devuelve un valor booleano, dependera de true o false si la lista esta vacia con
				 * el método isEmpty()*/
				JOptionPane.showMessageDialog(null, 
						"La lista esta vacia? " + listaLigada.isEmpty());
				break;
			case 16:
				/*Elimina un elemento en un indice ingresado con el método remove(indice)*/
				indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice: "));
				listaLigada.remove(indiceUno);
				break;
			case 17:
				/*Sustituye un elemento por otro con el método set(indice, objeto)*/
				indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice: "));
				elemento = ingresaNumero();
				listaLigada.set(indiceUno, elemento);
				break;
			case 18:
				/*Devuelve el tamanio de la lista con el método size()*/
				JOptionPane.showMessageDialog(null, 
						"El tamanio de la lista es " + listaLigada.size());
				break;
			default:
				JOptionPane.showMessageDialog(null, "FIN del programa");
				fin = false;
				break;
			}
		}while(fin);
}

public static int ingresaNumero(){
int numero;
numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero: "));
return numero;
}

public static String representacionLista(LinkedList<Integer> l) {
	String representacion = "", indices = "";
	int indice = 0;
	for (Integer integer : l) {
		representacion+= integer + "-";
		indices += indice + "-";
		indice++;
	}
	representacion += "\n" + indices;
	return representacion;
}

}

