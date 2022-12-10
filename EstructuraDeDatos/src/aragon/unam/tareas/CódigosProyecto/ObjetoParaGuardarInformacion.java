package aragon.unam.tareas.CódigosProyecto;

import java.util.ArrayList;

public class ObjetoParaGuardarInformacion {
	private ArrayList<Integer> lista = new ArrayList<>();
	private String descripcion;
	
	public ObjetoParaGuardarInformacion() {
		super();
	}

	public ArrayList<Integer> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
