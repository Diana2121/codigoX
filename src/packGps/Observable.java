package packGps;

import java.util.ArrayList;

/**
 * Quien implemente la interface Observable deberá redefinir todos sus métodos.
 *
 */

public interface Observable {
	/**
	 * Metodo que permite agregar un observador.
	 * @param obs
	 */
	public void addObservador(Observador obs);
	/**
	 * Método que permite quitar un observador.
	 * @param obs
	 */
	public void removerObservador(Observador obs);
	/**
	 * Metodo que permite notoficar a sus observadores.
	 */
	public void notificar();
}
