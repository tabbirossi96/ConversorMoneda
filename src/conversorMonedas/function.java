package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ArsToOther monedas = new ArsToOther();
	OtherToArs pesos = new OtherToArs();

	public void ConvertirMonedas(double Minput) {
		Object opcionInput = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
						"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
						"De Yen a Pesos", "De Won Coreano a Pesos" },
				"Seleccion"));

		if (opcionInput == null) {
			return;
		}

		String opcion = opcionInput.toString();
		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.ArsToDollar(Minput);
			break;
		case "De Pesos a Euro":
			monedas.ArsToEuros(Minput);
			break;
		case "De Pesos a Libras":
			monedas.ArsToLibras(Minput);
			break;
		case "De Pesos a Yen":
			monedas.ArsToYenes(Minput);
			break;
		case "De Pesos a Won Coreano":
			monedas.ArsToWones(Minput);
			break;
		case "De Dólar a Pesos":
			pesos.DollarToArs(Minput);
			break;
		case "De Euro a Pesos":
			pesos.EurosToArs(Minput);
			break;
		case "De Libras a Pesos":
			pesos.LibrasToArs(Minput);
			break;
		case "De Yen a Pesos":
			pesos.YenesToArs(Minput);
			break;
		case "De Won Coreano a Pesos":
			pesos.WonesToArs(Minput);
			break;
		default:
			break;
		}
	}

}
