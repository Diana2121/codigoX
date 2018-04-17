package grafica;

public interface ObservableCheckBoton {
	public void agregarObservador(ObservadorCheckBoton obs);

	public void quitarObservador(ObservableCheckBoton obs);

	public void notificar();
}
