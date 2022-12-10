package aragon.unam.tareas.CódigosProyecto;

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
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:"));
			caja.getLista().add(numero);
			break;
		case 2:
			for (int i = 0; i < caja.getLista().size(); i++) {
				suma += caja.getLista().get(i);
			}
			JOptionPane.showMessageDialog(null, "La suma de la lista es: " + suma);
			break;
		case 3:
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
			JOptionPane.showMessageDialog(null, "La pila esta vacia?\n" + bitacora.isEmpty());
			break;
		case 6:
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
