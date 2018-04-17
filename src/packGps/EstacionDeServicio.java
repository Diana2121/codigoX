package packGps;

import rutas.Ruta;

/**
 * Clase EstacionDeServicio hereda de PuntoDeInteres.
 * 
 * @author diii2
 *
 */
public class EstacionDeServicio extends PuntoDeInteres {
	private TipoDeCombustible tipoDeCombustible;
	private Marca marca;

	/**
	 * Constructor de EstacionDeServicio.
	 * 
	 * @param kilometro
	 * @param ruta
	 */
	public EstacionDeServicio(int kilometro, Ruta ruta) {
		super(kilometro, ruta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de EstacionDeServicio.
	 * 
	 * @param tipoDeCombustible
	 * @param marca
	 * @param kilometro
	 * @param ruta
	 */

	public EstacionDeServicio(TipoDeCombustible tipoDeCombustible, Marca marca, int kilometro, Ruta ruta) {
		super(kilometro, ruta);
		this.tipoDeCombustible = tipoDeCombustible;
		this.marca = marca;
	}

	/**
	 * Devuelve el tipo de combustible.
	 * 
	 * @return tipoDeCombustible.
	 */
	public TipoDeCombustible getTipoDeCombustible() {
		return tipoDeCombustible;
	}
/**
 * Setea el tipo de combustible que posee la estación de servicio.
 * @param tipoDeCombustible
 */
	public void setTipoDeCombustible(TipoDeCombustible tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
/**
 * Devuelve la marca de combustible.
 * @return marca
 */
	public Marca getMarca() {
		return marca;
	}
/**
 * Setea la marca de combustible.
 * @param marca
 */
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
