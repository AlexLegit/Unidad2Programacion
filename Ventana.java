package unidad2;

import javax.swing.JFrame;

//Ejercicio 4
public class Ventana {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana");

		// selecciona el tamaño de la ventana:
		ventana.setSize(512, 512);

		// hace la operacion al cerrarse la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// hace que la ventana sea visible
		ventana.setVisible(true);
		// hace que la ventana incia de forma Centrada
		ventana.setLocationRelativeTo(null);
	}

}