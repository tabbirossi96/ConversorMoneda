package conversorMonedas;

import javax.swing.JOptionPane;

public class ArsToOther {

	
	public void ArsToDollar (double valor) {
		double toDollar = valor / 349.05;
		toDollar = (double) Math.round(toDollar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "ARS son " + toDollar + "USD");
	}
	
	public void ArsToEuros(double valor) {
		double toEuro = valor / 365.97;
		toEuro = (double) Math.round(toEuro *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "ARS son " + toEuro + "EUR");
	}
	
	public void ArsToLibras(double valor) {
		double toLibra = valor / 422.69;
		toLibra = (double) Math.round(toLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "ARS son " + toLibra + "GBP");
	}
	
	public void ArsToYenes(double valor) {
		double toYen = valor / 2.32;
		toYen = (double) Math.round(toYen *100d)/100;
        JOptionPane.showMessageDialog(null, "ARS son " + toYen + "JPY");
	}
	
	public void ArsToWones(double valor) {
		double toWon = valor / 0.26;
		toWon = (double) Math.round(toWon *100d)/100;
        JOptionPane.showMessageDialog(null, "ARS son " + toWon + "KRW");
	}
}
