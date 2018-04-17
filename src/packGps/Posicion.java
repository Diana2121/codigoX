package packGps;

/**
 * Clase Posicion.
 * 
 * @author diii2
 *
 */
public class Posicion {
	private float latitud;
	private float longitud;

	/**
	 * Constructor de Clase Posicion.
	 * 
	 * @param latitud
	 * @param longitud
	 */
	public Posicion(float latitud, float longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * Devuelve la latitud.
	 * 
	 * @return latitud.
	 */
	public float getLatitud() {
		return latitud;
	}

	/**
	 * Setea la latitud.
	 * 
	 * @param latitud
	 */
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	/**
	 * Devuelve la longitud.
	 * 
	 * @return longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * Setea la longitud.
	 * @param longitud
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

}
