package aragon.unam.Proyecto.CódigosProyecto;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		if(this.edad < o.getEdad()) {
			return -1;
		}else {
			if(this.edad > o.getEdad()) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	
}
