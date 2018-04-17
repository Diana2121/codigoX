package packGps;

import rutas.Ruta;

/**
 * Clase Punto de Interés.
 * @author Diana
 *
 */
public class PuntoDeInteres {
	private int kilometro;
	private Ruta ruta;

	/**
	 * Constructor de PuntoDeInteres
	 * @param kilometro
	 * @param ruta
	 */
	public PuntoDeInteres(int kilometro, Ruta ruta) {
		this.kilometro = kilometro;
		this.ruta = ruta;
	}

}
