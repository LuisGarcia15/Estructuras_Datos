package aragon.unam.tareas.TareaSeis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import aragon.unam.estructuras.Array2DADT;
import aragon.unam.estructuras.ArrayADT;
import aragon.unam.estructuras.StackADT;

public class Laberinto{
	
	private Array2DADT<String> laberinto;
	private StackADT<String> pila = new StackADT<>();
	private ArrayADT<Integer> coordenadas = new ArrayADT<>(6);
	private boolean fin = true;
	
	public Laberinto() {
		String filas, texto = "";
		int contador = 1, punteroCoordenadas = 0,punteroFilas = 0;
		String auxiliar[] = new String[2];
		File f = new File(System.getProperty("user.dir") + "/archivos/laberinto.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((filas = br.readLine()) != null) {
				texto = filas + ",\n";
				switch(contador) {
					case 1:
						auxiliar = texto.split(",");
						laberinto = new Array2DADT<>(Integer.parseInt(auxiliar[0]), 
								Integer.parseInt(auxiliar[1]));
						contador++;
						break;
					case 2:
						auxiliar = texto.split(",");
						for(int i = 0; i < auxiliar.length-1; i++) {
							this.coordenadas.setItem(Integer.parseInt(auxiliar[i]), i);
							punteroCoordenadas++;
						}
						this.pila.push(auxiliar[0] + "," + auxiliar[1]);
						contador++;
						break;
					case 3:
						auxiliar = texto.split(",");
						for(int i = 0; i < auxiliar.length-1; i++) {
							this.coordenadas.setItem(Integer.parseInt(auxiliar[i]), punteroCoordenadas);
							punteroCoordenadas++;
						}
						contador++;
						break;
					default:
						auxiliar = texto.split(",");
						for (int i = 0; i < auxiliar.length-1; i++) {
							if(i == this.coordenadas.getItem(3) && 
									punteroFilas == this.coordenadas.getItem(2)) {
								this.laberinto.setElemento("M", punteroFilas, i);
							}else {
								if(i == this.coordenadas.getItem(1) && 
										punteroFilas == this.coordenadas.getItem(0)) {
									this.laberinto.setElemento("L", punteroFilas, i);
								}else {
								this.laberinto.setElemento(auxiliar[i], punteroFilas, i);
								}
							}
						}
						punteroFilas++;
						break;
				}
			}
			System.out.println(this.laberinto.toString());
		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		}
	
	public Array2DADT<String> getLaberinto() {
		return laberinto;
	}

	public StackADT<String> getPila() {
		return pila;
	}

	public ArrayADT<Integer> getCoordenadas() {
		return coordenadas;
	}
	
	public boolean isFin() {
		return fin;
	}

	public  void evaluarReglas(int filas, int columnas) {
		int filasEvaluar, columnasEvaluar, contador = 1, contadorParedes = 0;
		String casilla;
		boolean salida = true;
		while(salida) {
			switch (contador) {
			case 1:
				filasEvaluar = filas;
				columnasEvaluar = columnas;
				columnasEvaluar++;
				if(filasEvaluar >= 0 && filasEvaluar <= (this.laberinto.getFilas()-1) &&
						columnasEvaluar >= 0 && columnasEvaluar <= (this.laberinto.getColumnas()-1)) {
					casilla = this.laberinto.getElemento(filasEvaluar, columnasEvaluar);
					if(casilla.equals("M")) {
						if(this.isMeta(filas, columnas, filasEvaluar, columnasEvaluar)) {
							this.fin = !this.fin;
							salida = !salida;
						}
					}else {
						if(casilla.equals(" ")) {
						this.avanzar(filas, columnas, filasEvaluar, columnasEvaluar);
						salida = !salida;
						}
					}
				}
				contador++;
				break;
			case 2:
				filasEvaluar = filas;
				columnasEvaluar = columnas;
				filasEvaluar--;
				if(filasEvaluar >= 0 && filasEvaluar <= (this.laberinto.getFilas()-1) &&
						columnasEvaluar >= 0 && columnasEvaluar <= (this.laberinto.getColumnas()-1)) {
					casilla = this.laberinto.getElemento(filasEvaluar, columnasEvaluar);
					if(casilla.equals("M")) {
						if(this.isMeta(filas, columnas, filasEvaluar, columnasEvaluar)) {
							this.fin = !this.fin;
							salida = !salida;
						}
					}else {
						if(casilla.equals(" ")) {
						this.avanzar(filas, columnas, filasEvaluar, columnasEvaluar);
						salida = !salida;
						}
					}
				}
				contador++;
				break;
			case 3:
				filasEvaluar = filas;
				columnasEvaluar = columnas;
				columnasEvaluar--;
				if(filasEvaluar >= 0 && filasEvaluar <= (this.laberinto.getFilas()-1) &&
						columnasEvaluar >= 0 && columnasEvaluar <= (this.laberinto.getColumnas()-1)) {
					casilla = this.laberinto.getElemento(filasEvaluar, columnasEvaluar);
					if(casilla.equals("M")) {
						if(this.isMeta(filas, columnas, filasEvaluar, columnasEvaluar)) {
							this.fin = !this.fin;
							salida = !salida;
						}
					}else {
						if(casilla.equals(" ")) {
						this.avanzar(filas, columnas, filasEvaluar, columnasEvaluar);
						salida = !salida;
						}
					}
				}
				contador++;
				break;
			case 4:
				filasEvaluar = filas;
				columnasEvaluar = columnas;
				filasEvaluar++;
				if(filasEvaluar >= 0 && filasEvaluar <= (this.laberinto.getFilas()-1) &&
						columnasEvaluar >= 0 && columnasEvaluar <= (this.laberinto.getColumnas()-1)) {
					casilla = this.laberinto.getElemento(filasEvaluar, columnasEvaluar);
					if(casilla.equals("M")) {
						if(this.isMeta(filas, columnas, filasEvaluar, columnasEvaluar)) {
							this.fin = !this.fin;
							salida = !salida;
						}
					}else {
						if(casilla.equals(" ")) {
						this.avanzar(filas, columnas, filasEvaluar, columnasEvaluar);
						salida = !salida;
						}
					}
				}
				contador++;
				break;
			case 5:
				if(this.pila.length() != 1) {
					this.retroceder();
					salida = !salida;	
				}
				contador++;
				break;
			default:
				System.out.println("Laberinto sin solucion");
				this.fin = !this.fin;
				salida = !salida;
				break;
			}

			}
		}
	
	public boolean isMeta(int filas, int columnas, int filasEvaluadas, int columnasEvaluadas) {
		this.laberinto.setElemento("L", filasEvaluadas, columnasEvaluadas);
		this.laberinto.setElemento("#", filas, columnas);
		this.pila.push(filasEvaluadas + "," + columnasEvaluadas);
		System.out.println(this.laberinto.toString());
		System.out.println("*******************************");
		return this.coordenadas.getItem(2) == filasEvaluadas && 
				this.coordenadas.getItem(3) == columnasEvaluadas;
	}
	
	public void avanzar(int filas, int columnas, int filasEvaluadas, int columnasEvaluadas) {
		this.laberinto.setElemento("L", filasEvaluadas, columnasEvaluadas);
		this.laberinto.setElemento("#", filas, columnas);
		this.pila.push(filasEvaluadas + "," + columnasEvaluadas);
		System.out.println(this.laberinto.toString());
		System.out.println("*******************************");
	}
	
	public void retroceder() {
		String coordenada = this.pila.peek();
		this.pila.pop();
		this.laberinto.setElemento("X", Integer.parseInt(coordenada.substring(0, 1)), 
				Integer.parseInt(coordenada.substring(2, 3)));
		this.laberinto.setElemento("L", Integer.parseInt(this.pila.peek().substring(0, 1)), 
				Integer.parseInt(this.pila.peek().substring(2, 3)));
		System.out.println(this.laberinto.toString());
		System.out.println("*******************************");
	}
	
	
}
