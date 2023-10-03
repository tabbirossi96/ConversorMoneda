package conversorMonedas;

import javax.swing.JOptionPane;

public class OtherToArs {
	
	public void DollarToArs(double valor) {
		double toArs = valor * 349.05;
		toArs = (double) Math.round(toArs *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "USD son " + toArs + "ARS");
	}
	
	
	public void EurosToArs(double valor) {
		double toArs = valor * 365.97;
		toArs = (double) Math.round(toArs *100d)/100;
		JOptionPane.showMessageDialog(null, valor + "EUR son " + toArs + "ARS");
	}
	
	public void LibrasToArs(double valor) {
		double toArs = valor * 422.69;
		toArs = (double) Math.round(toArs *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "GBP son " + toArs + "ARS");
	}
	
	public void YenesToArs(double valor) {
		double toArs = valor * 2.32;
		toArs = (double) Math.round(toArs *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "JPY son " + toArs + "ARS");
	}
	
	public void WonesToArs(double valor) {
		double toArs = valor * 0.26;
		toArs = (double) Math.round(toArs *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "KRW son " + toArs + "ARS");
	}
	
	
}
