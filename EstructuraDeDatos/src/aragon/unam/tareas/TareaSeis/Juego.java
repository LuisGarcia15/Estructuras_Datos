package aragon.unam.tareas.TareaSeis;

public class Juego {
	private Laberinto2 laberinto = new Laberinto2();

	public Juego() {

	}
	
	public void iniciaJuego() {
		String coordenadas;
		System.out.printf("%" + (this.laberinto.getLaberinto().getFilas()*5) + "s %n", "LABERINTO");
		System.out.println(this.laberinto.getLaberinto().toString());
		while(laberinto.isFin()) {
			coordenadas = laberinto.getPila().peek();
			this.laberinto.evaluarReglas(Integer.parseInt(coordenadas.substring(0, 1)), 
					Integer.parseInt(coordenadas.substring(2, 3)));
		}
	}
	
}
