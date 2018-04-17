package util;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;

import grafica.Vista;
import packGps.Mapa;
import packGps.Punto;

public class grafica {

	public static void dibujarPunto(Graphics g) {
		for (int i = 0; i < Mapa.getInstancia().getListaPuntos().size(); i++) {
			int latitud = (int) Mapa.getInstancia().getListaPuntos().get(i).getPosicion().getLatitud();
			int longitud = (int) Mapa.getInstancia().getListaPuntos().get(i).getPosicion().getLongitud();
			String nombrePunto = Mapa.getInstancia().getListaPuntos().get(i).getNombre();
			// TODO DIBUJAR STRING (.drawSgtring)
			g.setColor(Color.red);
			g.drawOval(latitud - 10, longitud - 10, 25, 25);
			g.drawString(nombrePunto, (latitud - 20), longitud - 5);
		}
	}

	public static void dibujarRuta(Graphics g) {
		for (int i= 0; i< Mapa.getInstancia().getListaRuta().size(); i++) {
			Punto origen=Mapa.getInstancia().getListaRuta().get(i).getOrigen();
			Punto destino=Mapa.getInstancia().getListaRuta().get(i).getDestino();
			
			int x1=(int) origen.getPosicion().getLatitud();
			int y1=		(int) origen.getPosicion().getLongitud();
			int x2=(int) destino.getPosicion().getLatitud();
			int y2=(int) destino.getPosicion().getLongitud();
			g.drawLine(x1,y1 ,x2 ,y2);
		}
	}

	public static void crearVentana() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = Vista.getInstancia();// Llamo al
														// metodo
														// getInstancia
														// del Patron
														// Singleton.//Llamo
														// al metodo
														// getInstancia
														// del Patron
														// Singleton.
					window.getFrameGps().setVisible(true);
					window.getFrameGps().setSize(1000, 700);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
