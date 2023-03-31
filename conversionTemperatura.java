package menuPrincipal;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class conversionTemperatura {
	public static void main(String[] args) {
		String[] options = { "Convertir de ºC a ºF", "Convertir de ºF a ºC", "Convertir de ºK a ºC","Convertir de ºC a ºK","Convertir de ºK a ºF", "Convertir de ºF a ºK"};
		String menuOpcion = (String) JOptionPane.showInputDialog(null,
				"Elija la temperatura a la que desea realizar la conversión", "Grados", JOptionPane.QUESTION_MESSAGE, null,
				options, options[0]);
		Scanner leerOpcion = new Scanner(System.in);

		switch (menuOpcion) {

		case "Convertir de ºC a ºF":
			
			double F = (double) (((ingresarTemperatura(0))* 1.8) + 32);

			JOptionPane.showMessageDialog(null, "La temperatura en escala  Fahrenheit es: " + F + "º");

			break;

		case "Convertir de ºF a ºC":
			
			double C = (double) (((ingresarTemperatura(0))-32)/ 1.8);
			JOptionPane.showMessageDialog(null, "La temperatura en escala  Celsius es: " + C + "º");
			
			break;
		case "Convertir de ºK a ºC": 
			
			double c = (double) (((ingresarTemperatura(0))- 273.15));
			JOptionPane.showMessageDialog(null, "La temperatura en escala  Celsius es: " + c + "º");

			

			break;
		case "Convertir de ºC a ºK":
			
			double K = (double) (((ingresarTemperatura(0))+ 273.15));
			
			JOptionPane.showMessageDialog(null, "La temperatura en escala  Kelvin es: " + K + "º");

			

			break;
		case "Convertir de ºK a ºF":
			
			double tK = (double) (((ingresarTemperatura(0)*9/5)-459.67));
			
			JOptionPane.showMessageDialog(null, "La temperatura en escala  Fahrenheit es: " + tK + "º");

			
			break;
		case "Convertir de ºF a ºK":
			
			double f = (double) (((ingresarTemperatura(0))+ 459.67)*0.5555);
			
			JOptionPane.showMessageDialog(null, "La temperatura en escala  Kelvin es: " + f + "º");
			
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Opción incorrecta");
			break;
		}
	}
	@SuppressWarnings("null")
	public static double ingresarTemperatura(double totalTemperatura) {
		try { 
			Double temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese temperatura que desea convertir", null));
			return temperatura;
		
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El dato ingresado no es válido. "
					+ "ingrese un valor numérico");
			main(null);
			
        }
		return (Double) null;
	}
	
	
}
