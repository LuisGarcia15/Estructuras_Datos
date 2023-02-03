package aragon.unam.Proyecto.CodigosProyecto;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class StackPrueba {
	public static void main(String[] args) {
		Stack <ObjetoParaGuardarInformacion> bitacora = new Stack<>() ;
		ObjetoParaGuardarInformacion caja =  new ObjetoParaGuardarInformacion();
		ObjetoParaGuardarInformacion auxiliar;
		ArrayList<Integer> a = new ArrayList<>();
		int numero, suma = 0;
		boolean fin = true;
		
		do {
		int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Prueba Stack \n"
				+ "Lista " + representacionLista(caja.getLista()) + "\n"
				+ "1 - Ingresar un número a la lista \n"
				+ "2 - Suma todos los números de la lista \n"
				+ "3 - Guardar lista actual \n"
				+ "4 - Eliminar la ultima lista guardada \n"
				+ "5 - Informa sobre si la pila es vacia \n"
				+ "6 - Informa la descripción del ultimo estado del objeto duardado en la pila \n"
				+ "-1 - Salir"));
		
		switch (eleccion) {
		case 1:
			/*ingresar un dato al final de la lista contenida en el atributo del objeto
			 * que contiene la lista de tipo ArrayList con el método add()*/
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:"));
			caja.getLista().add(numero);
			break;
		case 2:
			/*Suma todos los números cotenidos en el atributo del objeto que contiene la lista
			 * de tipo ArrayList*/
			for (int i = 0; i < caja.getLista().size(); i++) {
				suma += caja.getLista().get(i);
			}
			JOptionPane.showMessageDialog(null, "La suma de la lista es: " + suma);
			break;
		case 3:
			/*Permite guardar un estado del objeto que simula las caracteristicas de Git, junto con
			 * una descripción de los cambios guardados en el objeto Stack mediante el método
			 * push()*/
			ObjetoParaGuardarInformacion auxiliarDos = new ObjetoParaGuardarInformacion();
			String mensaje = JOptionPane.showInputDialog(null, "Incluya una breve descripción para guardar el estado del objeto");
			caja.setDescripcion(mensaje);
			for (int i = 0; i < caja.getLista().size(); i++) {
				auxiliarDos.getLista().add(caja.getLista().get(i));
			}
			auxiliarDos.setDescripcion(caja.getDescripcion());
			bitacora.push(auxiliarDos);
			break;
		case 4:
			/*Elimina el último estado del objeto guardado en el objeto Stack que se encuentra en la cima
			 * del objeto Stack y devuelve ese objeto eliminado esto mediante el método pop()*/
			bitacora.pop();
			if(bitacora.isEmpty()) {
				caja.getLista().clear();
				caja.setDescripcion("");
			}else {
			ObjetoParaGuardarInformacion auxiliarTres = bitacora.peek();
				a.clear();
				for (int i = 0; i < auxiliarTres.getLista().size(); i++) {
					a.add(auxiliarTres.getLista().get(i));
				}
				caja.setLista(a);
				caja.setDescripcion(auxiliarTres.getDescripcion());
				auxiliarTres = null;
			}
			break;
		case 5:
			/*Devuelve un valor booleano, dependera de true o false si el objeto Stack esta vacio con
			 * el método isEmpty()*/
			JOptionPane.showMessageDialog(null, "La pila esta vacia?\n" + bitacora.isEmpty());
			break;
		case 6:
			/*Informa acerca del último cambio realizado en el atributo del objeto que contiene la lista
			 * de tipo ArrayList obteniendo pero no eliminado el objeto que se encuentra en la parte 
			 * superior del Objeto Stack*/
			if(bitacora.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay descripción guardada");
			}else {
			auxiliar = bitacora.peek();
			JOptionPane.showMessageDialog(null, "La última descripción es: " 
		+ auxiliar.getDescripcion());
		}
			break;
		default:
			JOptionPane.showMessageDialog(null, "FIN del programa");
			fin = false;
			break;
		}
		}while(fin);
		
	}
	
	public static String representacionLista(ArrayList<Integer> a) {
		String representacion = "";
		if(a == null) {
			return "";
		}
		for (Integer integer : a) {
			representacion+= integer + "-";
		}
		return representacion;
	}
}
