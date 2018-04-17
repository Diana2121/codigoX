package dijkstra;

import java.util.ArrayList;

import packGps.Mapa;
import rutas.Ruta;

public class CalculoDistancia {
/**
 * Obtiene el camino óptimo utilizando la lista de rutas, según las elecciones de origen y destino del usuario.
 * @param listaRuta
 * @param eleccionOrigen
 * @param eleccionDestino
 */
	public void calcularCamino(ArrayList<Ruta> listaRuta, String eleccionOrigen, String eleccionDestino) {
		//Nodo nodoA = new Nodo();

		//Nodo nodoB = new Nodo();

		Grafo grafo = new Grafo();

		for (int i = 0; i < listaRuta.size(); i++) {
			Ruta rutaActual = listaRuta.get(i);
			
			Nodo nodoA = new Nodo();

			Nodo nodoB = new Nodo();
			
			nodoA.setNombre(rutaActual.getOrigen().getNombre());
			nodoB.setNombre(rutaActual.getDestino().getNombre());

			grafo.agregarNodo(nodoA);
			grafo.agregarNodo(nodoB);

			grafo.agregarCamino(nodoA, nodoB, (int) listaRuta.get(i).getLongitud());
		}

		//grafo.mostrarNodos();
		
		Nodo nodoOpcA = new Nodo();
		Nodo nodoOpcB = new Nodo();

		nodoOpcA = buscarEleccionOrigen(grafo.getNodos(), eleccionOrigen);

		//System.out.println("nodoA: " + nodoOpcA.getNombre());
		nodoOpcB = buscarEleccionOrigen(grafo.getNodos(), eleccionDestino);
		//System.out.println("nodoB: " + nodoOpcB.getNombre());

		grafo.generarRecorrido(nodoOpcA);
		// ACA VA LA OPCION DEL USUARIO!!
		grafo.caminoOptimo(nodoOpcA, nodoOpcB);

		// actualizarColor(Mapa.getInstancia());

	}

	/**
	 * Busco si el nodo es igual al nombre de eleccion Origen
	 * @param nodos
	 * @param eleccionOrigen
	 * @return aux
	 * 
	 * TODO VERIFICACR ESTO
	 */
	private Nodo buscarEleccionOrigen(ArrayList<Nodo> nodos, String eleccionOrigen) {
		
		Nodo aux = new Nodo();
		aux=null;
		while (aux==null){
			for (int i = 0; i < nodos.size(); i++) {
				Nodo nodoActual=nodos.get(i);
				if (nodoActual.getNombre()==eleccionOrigen){
					aux = nodos.get(i);
				}
			}
		}
//		if (aux==null){
//			System.out.println("*****aux=NULL");
//		}

		return aux;
		
		
	}


}
