package packGps;

import rutas.Ruta;

/**
 * Clase Alojamiento hereda de PuntoDeInteres {@link PuntoDeInteres puntoDeInteres}
 */

public class Alojamiento extends PuntoDeInteres {
	private int cantidadEstrellas;
	private String nombre;
	private boolean cochera;
	
	/**
	 * Constructor de Alojamiento.
	 * @param kilometro
	 * @param ruta
	 */
	public Alojamiento(int kilometro, Ruta ruta) {
		super(kilometro, ruta);
	}

	/**
	 * Constructor de Alojamiento.
	 * @param cantidadEstrellas
	 * @param nombre
	 * @param cochera
	 * @param kilometro
	 * @param ruta
	 */
	public Alojamiento(int cantidadEstrellas, String nombre, boolean cochera, int kilometro, Ruta ruta) {
		super(kilometro, ruta);
		this.cantidadEstrellas = cantidadEstrellas;
		this.nombre = nombre;
		this.cochera = cochera;
	}

	/**
	 * Devuelve la cantidad de estrellas.
	 * @return cantidadEstrellas
	 */
	public int getCantidadEstrellas() {
		return cantidadEstrellas;
	}

	/**
	 * Setea la cantidad de estrellas
	 * @param cantidadEstrellas
	 */
	public void setCantidadEstrellas(int cantidadEstrellas) {
		this.cantidadEstrellas = cantidadEstrellas;
	}

	/**
	 * Devuelve el nombre del alojamiento. 
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setea el nombre del alojamiento.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve si el alojamiento posee cochera.
	 * @return
	 */
	public boolean isCochera() {
		return cochera;
	}

	/**
	 * Setea el valor de cochera.
	 * @param cochera
	 */
	public void setCochera(boolean cochera) {
		this.cochera = cochera;
	}

}
