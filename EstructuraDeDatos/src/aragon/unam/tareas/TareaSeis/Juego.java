package aragon.unam.tareas.TareaSeis;

public class Juego {
	private Laberinto laberinto = new Laberinto();

	public Juego() {

	}
	
	public void iniciaJuego() {
		String coordenadas;
		System.out.println("LABERINTO");
		System.out.println(this.laberinto.getLaberinto().toString());
		while(laberinto.isFin()) {
			coordenadas = laberinto.getPila().peek();
			this.laberinto.evaluarReglas(Integer.parseInt(coordenadas.substring(0, 1)), 
					Integer.parseInt(coordenadas.substring(2, 3)));
		}
	}
	
}
