package packGps;

import java.util.ArrayList;
/**
 * Clase abstracta Punto
 * @author diii2
 *
 */
public abstract class Punto {
	
	private Posicion posicion;// Atributos comunes a las SubClases. Son equivalentes sem�nticamente los
								// atributos posicion ~ ubicacion, tomaaremos posicion.
	private String nombre;

//	construcotr
	public Punto(Posicion posicion, String nombre) {
		this.posicion = posicion;
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}



}
