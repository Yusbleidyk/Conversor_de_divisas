package menuPrincipal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class conversorMoneda {

	public static void main(String[] args) {

		String[] options = { "De pesos Chilenos  a Dólar", "De Dólar pesos a Chilenos", "De pesos Chilenos  a Euros","De Euros a pesos Chilenos",
				"De pesos Chilenos  a Libras Esterlinas", "De  Libras Esterlinas a pesos Chilenos", "De pesos Chilenos  a Yen Japonés",
				"De Yen Japonés a pesos Chilenos", "De pesos Chilenos  a Won sul-coreano", "De Won sul-coreano a pesos Chilenos" };
		String menuOpcion = (String) JOptionPane.showInputDialog(null,
				"Elija la moneda a la que desea convertir tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null,
				options, options[0]);
		Scanner leerOpcion = new Scanner(System.in);

		switch (menuOpcion) {

		case "De pesos Chilenos  a Dólar":

			JOptionPane.showMessageDialog(null, convertird(0.0013, 0, "USD"));

			break;

		case "De Dólar pesos a Chilenos":

			JOptionPane.showMessageDialog(null, convertird(792.12, 0, "CLP"));

			break;
		case "De pesos Chilenos  a Euros":

			JOptionPane.showMessageDialog(null, convertird(0.0011, 0, "EUR"));

			break;
		case "De Euros a pesos Chilenos":

			JOptionPane.showMessageDialog(null, convertird(858.86, 0, "CLP"));

			break;
		case "De pesos Chilenos  a Libras Esterlinas":

			JOptionPane.showMessageDialog(null, convertird(0.0010, 0, "GBP"));

			break;
		case "De  Libras Esterlinas a pesos Chilenos":

			JOptionPane.showMessageDialog(null, convertird(975.69, 0, "CLP"));

			break;
		case "De pesos Chilenos  a Yen Japonés":

			JOptionPane.showMessageDialog(null, convertird(0.1675, 0, "JPY"));

			break;
		case "De Yen Japonés a pesos Chilenos":

			JOptionPane.showMessageDialog(null, convertird(5.96, 0, "CLP"));

			break;
		case "De pesos Chilenos  a Won sul-coreano":

			JOptionPane.showMessageDialog(null, convertird(1.60, 0, "KRW"));
			break;
		case "De Won sul-coreano a pesos Chilenos":

			JOptionPane.showMessageDialog(null, convertird(0.61, 0,"CLP"));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opción incorrecta");
			break;
		}

	}

	@SuppressWarnings("null")
	public static double ingresarCantidad(double totalCantidad) {
		try { 
			Double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir", null));
			return cantidad;
		
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El dato ingresado no es válido. "
					+ "ingrese un valor numérico");
			main(null);
			
        }
		return (Double) null;
	}

	
	
	public static String convertird(double valorPeso, double cantidadMoneda, String pais) {
		double cantidadConvertir = ingresarCantidad(cantidadMoneda);
		double moneda = cantidadConvertir*valorPeso;
		String respuesta = ("Tienes " + moneda + " " + pais);
		return respuesta;

	}


}
