package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave02 {

	public static void main(String[] args) {
		
		String helBrutto = showInputDialog("Skriv inn bruttoinntekt: ");
		double bruttoinntekt = parseInt(helBrutto);
		
		double trinnskatt = beregnTrinnskatt(bruttoinntekt);
		
		showMessageDialog(null, "Trinnskatten som skal betales er: " + trinnskatt);
		
	}
	
	public static double beregnTrinnskatt(double inntekt) {
		double skatt = 0;
		
		if (inntekt > 208050) {
	        // Trinn 1
			if (inntekt >= 208051 && inntekt <= 292850) {
	            skatt += (inntekt - 208051) * 0.017; // 1.7%
	        }
			// Trinn 2
	        else if (inntekt >= 292851 && inntekt <= 670000) {
	            skatt += (292850 - 208051) * 0.017; // 1.7%
	            skatt += (inntekt - 292851) * 0.04; // 4%
	        }
	        // Trinn 3
	        else if (inntekt >= 670001 && inntekt <= 937900) {
	            skatt += (292850 - 208051) * 0.017; // 1.7%
	            skatt += (670000 - 292851) * 0.04; // 4%
	            skatt += (inntekt - 670001) * 0.136; // 13%
	        }
	        // Trinn 4
	        else if (inntekt >= 937901 && inntekt <= 1350000) {
	        	skatt += (292850 - 208051) * 0.017; // 1.7%
	        	skatt += (670000 - 292851) * 0.04; // 4%
	            skatt += (937900 - 670001) * 0.136; // 13.6%
	            skatt += (inntekt - 937901) * 0.166; // 16.6%
	        }   
	        // Trinn 5
		    else if (inntekt >= 1350001) {
		      	skatt += (292850 - 208051) * 0.017; // 1.7%
	        	skatt += (670000 - 292851) * 0.04; // 4%
	            skatt += (937900 - 670001) * 0.136; // 13.6%	
	            skatt += (1350000 - 937901) * 0.166; // 16.6%   
	            skatt += (inntekt - 1350001) * 0.176; // 17.6%
	        }	
		}

	    return skatt;
	}
}
