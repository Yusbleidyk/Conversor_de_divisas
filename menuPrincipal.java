package menuPrincipal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class menuPrincipal {

	static conversorMoneda conversionMoneda = new conversorMoneda();
	conversionTemperatura conversionT = new conversionTemperatura();

	  public static void main(String[] args) {

		String[] options = { "Conversor de Moneda", "Conversor de Temperatura" };
		String menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		switch (menu) {
		case "Conversor de Moneda":
			
			conversorMoneda.main(args);

			break;

		case "Conversor de Temperatura":
			
			conversionTemperatura.main(args);

			break;

		default:
			break;
		}

		int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Option...",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);

		switch (seleccion) {
		case 0:
			
			main(options);

			break;

		case 1:

			JOptionPane.showMessageDialog(null, "Programa Finalizado");

			break;

		default:

			JOptionPane.showMessageDialog(null, "Programa Finalizado");

			break;
		}
	}

}
