package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave03 {
	
	public static void main(String[] args) {

		String helN = showInputDialog("Skriv inn et heltall n (n > 0): ");
		int n = parseInt(helN);
		
		if (n <= 0) {
			showMessageDialog(null, "Ugjylig svar. Skriv inn et heltall større enn 0.");	
		} else {
			long fakultet = 1; //bruker long for store tall
			for (int i = 1; i <= n; i++) {
				fakultet *= i;
			}
			showMessageDialog(null, "Verdien av " + n + "! er: " + fakultet);
		}
	}
}
