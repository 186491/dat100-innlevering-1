package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave01 {

	public static void main(String[] args) {
		int antallStudenter = 10;
		
		for (int i = 1; i <= antallStudenter; i++) {
			int poengsum = -1; 
			
			while (poengsum < 0 || poengsum > 100) {
				String helPoeng = showInputDialog("Skriv inn poengsummen for student " + i + ": ");
				poengsum = parseInt(helPoeng);
				
				if (poengsum < 0 || poengsum > 100) {
					showMessageDialog(null, "Ugjylig poengsum! Skriv inn en poengsum mellom 0 og 100.");
				}
			}
			
			char karakter;
			if (poengsum >= 90) {
				karakter = 'A';	
			} else if (poengsum >= 80) {
				karakter = 'B';
			} else if (poengsum >= 60) {
				karakter = 'C';
			} else if (poengsum >= 50) {
				karakter = 'D';
			} else if (poengsum >= 40) {
				karakter = 'E';
			} else {
				karakter = 'F';	
			}
			showMessageDialog(null, "Karakter for student " + i + ": " + karakter);
		}

	}

}
