package aragon.unam.Proyecto.CodigosProyecto;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListPrueba {
	public static void main(String[] args) {
			ArrayList<Persona> arraylist = new ArrayList<>();
			boolean fin = true;
			String nombre, nombres = " ", indices = " ";
			int edad, indiceUno = 0, indiceDos = 0, indice = 0;
			Persona personaObtenida = null;
			
			do {
				String numero = JOptionPane.showInputDialog(null, "Prueba ArrayList \n"
						+ "Array List\n"
						+ representacionArrayList(arraylist) + "\n"
						+ "Indices \n \n"
						+ "1 - Agregar una Persona al final de la lista \n"
						+ "2 - Agregar una persona a la lista en un lugar específico \n"
						+ "3 - Eliminar todos lo elementos de la lista \n"
						+ "4 - Verificar si existe una Persona en la lista \n"
						+ "5 - Obtener una Persona de un ínidice específico \n"
						+ "6 - Obtener el indice de la primera aparición de una Persona \n"
						+ "7 - Verificar si la lista esta vacia \n"
						+ "8 - Eliminar una Persona en un indice de la lista \n"
						+ "9 - Eliminar la primera aparición de una Persona en la lista \n"
						+ "10 - Remplazar una Persona por otra en un índice dado \n"
						+ "11 - Obtener el tamanio de la lista \n"
						+ "12 - Ordenamiento de la lista en ordén alfabético \n"
						+ "13 - Obtener una sublista dado un rango de índices \n"
						+ "-1 - Finalizar programa");
				switch (Integer.parseInt(numero)) {
				case 1:
					/*ingresar un dato al final de la lista con el método add()*/
					nombre = ingresarNombre();
					edad = ingresarEdad();
					arraylist.add(new Persona(nombre, edad));
					break;
				case 2:
					/*ingresar un dato en un indice especifico con el metodo add(indice, objeto)*/
					indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa el indice donde se incertará la nueva persona: "));
					nombre = ingresarNombre();
					edad = ingresarEdad();
					arraylist.add(indiceUno, new Persona(nombre, edad));
					break;
				case 3:
					/*Elimina todos los elementos de la lista, haciendo la lista vacia con el método clear()*/
					arraylist.clear();
					break;
				case 4:
					/*Verifica si existe un elemento en la lista con el método contains(Objeto)*/
					if(personaObtenida == null) {
						JOptionPane.showMessageDialog(null, "Primero obtenga una persona");
						}else {
							JOptionPane.showMessageDialog(null, "La persona existe?: \n" + arraylist.contains(
									arraylist.get(indiceUno)) + "\n Su nombre es: " + personaObtenida.getNombre());
						}
					break;
				case 5:
					/*Obtiene el objeto bajo el indice ingresado con el método get(indice)*/
					indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa el indice para obtener la persona en ese índice: "));
					personaObtenida = arraylist.get(indiceUno);
					JOptionPane.showMessageDialog(null, 
							"El nombre de la persona es:\n" + personaObtenida.getNombre() + "\n su indice es: " + indiceUno);
					break;
				case 6:
					/*Obtiene el indice del objeto que se le ingrese como parámetro al método indexOf(Objeto)*/
					if(personaObtenida == null) {
					JOptionPane.showMessageDialog(null, "Primero obtenga una persona");
					}else {
						indiceUno = arraylist.indexOf(personaObtenida);
						JOptionPane.showMessageDialog(null, "El indice es: " + indiceUno);
					}
					break;
				case 7:
					/*Devuelve un valor booleano, dependera de true o false si la lista esta vacia con
					 * el método isEmpty()*/
					JOptionPane.showMessageDialog(null, "La lista esta vacia?: \n" + arraylist.isEmpty());
					break;
				case 8:
					/*Elimina un elemento en un indice ingresado con el método remove(indice)*/
					indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa el indice para borrar la persona en ese índice: "));
					personaObtenida = arraylist.remove(indiceUno);
					break;
				case 9:
					/*Elimina la primera aparicion de un objeto con el método remove(objeto)*/
					if(personaObtenida == null) {
						JOptionPane.showMessageDialog(null, "Primero obtenga una persona");
						}else {
							arraylist.remove(personaObtenida);
							personaObtenida = null;
						}
					break;
				case 10:
					/*Sustituye un elemento por otro con el método set(indice, objeto)*/
					nombre = ingresarNombre();
					edad = ingresarEdad();
					Persona nueva = new Persona(nombre, edad);
					indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa indice para sustituit a la persona desde ese índice: "));
					arraylist.set(indiceUno, nueva);
					break;
				case 11:
					/*Devuelve el tamanio de la lista con el método size()*/
					JOptionPane.showMessageDialog(null, "El tamanio de la lista es: \n" + arraylist.size());
					break;
				case 12:
					/*Ordena la lista por orden alfabético mediante la primera letra de los nombres
					 *  del objeto persona contenidos en la lista mediante el método compareTo(Comparator), es
					 *  necesario ingresar como parámetro una comparación que pueda realizar el método compareTo,
					 *  método implementado de la interfaz Comparator*/
					arraylist.sort((o1,o2) -> 
					o1.getNombre().substring(0).compareTo(o2.getNombre().substring(0)));
					break;
				case 13:
					/*Obtiene una sublista de la lista original, en este caso solo representa la lista, pero
					 * puede obtenerse una sublista con el método subList(desde el indiceUno, hasta el indiceDos)*/
					indiceUno = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa el primer indice para obtener a la persona desde ese índice: "));
					indiceDos = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Ingresa el segundo indice para obtener a la persona hasta ese índice: "));
				for (Persona p: arraylist.subList(indiceUno, indiceDos)) {
			        nombres += p.getNombre() + "-";
			        indices += indice + "-";
			        indice++;
			    } 
				JOptionPane.showMessageDialog(null, nombres + "\n" + indices);
				nombres = " ";
				indices = " ";
					indice = 0;	
					break;
				default:
					JOptionPane.showMessageDialog(null, "FIN del programa");
					fin = false;
					break;
				}
			}while(fin);
	}

public static String ingresarNombre(){
	String nombre;
	nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre de la Persona: ");
	return nombre;
}

public static int ingresarEdad(){
	int edad;
	edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de la Persona: "));
	return edad;
}

public static String representacionArrayList(ArrayList<Persona> a) {
	String representacion = "", indices = "";
	int indice = 0;
	for (Persona p : a) {
		representacion+= p.getNombre() + "-";
		indices += indice + "-";
		indice++;
	}
	representacion += "\n" + indices;
	return representacion;
}

}

