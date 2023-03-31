package ejercicioCiclos;
import javax.swing.JOptionPane;

public class Biblioteca {
	
	/**
	 * Permite leer un numero double mediante una caja de dialogo
	 * @param pregunta, la pregunta que verá el usuario
	 * @return el numero que ingreso el usuario
	 */
	public static double leerDouble(String pregunta){
		return Double.parseDouble(JOptionPane.showInputDialog(pregunta));	
	}
	
	/**
	 * Permite leer un numero int mediante una caja de dialogo
	 * @param pregunta, la pregunta que verá el usuario
	 * @return el numero que ingreso el usuario
	 */
	public static int leerInt(String pregunta) {
		return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
	}

	/**
	 * Permite mostrar un mensaje mediante una caja de dialogo
	 * @param Mensaje, el mensaje que verá el usuario
	 */
	public static void imprimirVentana(String Mensaje) {
		JOptionPane.showMessageDialog(null, Mensaje);
	}
	/**
	 * Permite mostrar un mensaje mediante la consola
	 * @param Mensaje, el mensaje que verá el usuario
	 */
	public static void imprimirConsola(String respuesta) {
		System.out.print(respuesta);
		//println imprime con un salto de linea
	}
	/**
	 * Permite leer un numero Byte mediante una caja de dialogo
	 * @param pregunta, la pregunta que verá el usuario
	 * @return el numero que ingreso el usuario
	 */
	public static byte leerByte(String pregunta) {
		return Byte.parseByte(JOptionPane.showInputDialog(pregunta));
	}

}
