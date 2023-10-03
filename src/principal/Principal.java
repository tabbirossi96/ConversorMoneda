package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;

public class Principal {
	public static void main(String[] args) {

		function monedas = new function();

		while (true) {

			String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
			if (input != null) {
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						break;
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
			}

			else {
				break;
			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0) {
				return true;
			} else {
				return false;
			}

		} catch (NumberFormatException e) {
			return false;
		}
	}
}
