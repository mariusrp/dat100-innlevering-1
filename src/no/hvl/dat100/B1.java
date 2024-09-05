package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B1 {
    public static void main(String[] args) {
        int lowerLimit = getValidatedInput("Nedre grense: ");
        int upperLimit = getValidatedInput("Øvre grense: ");

        if (lowerLimit > upperLimit) {
            showMessageDialog(null, "Feil: Nedre grense må være mindre enn eller lik øvre grense.");
        } else {
            String oddNumbers = findOddNumbers(lowerLimit, upperLimit);
            showMessageDialog(null, "Oddetall: " + oddNumbers);
        }
    }

    private static int getValidatedInput(String message) {
        while (true) {
            try {
                String input = showInputDialog(message);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Skriv et gyldig tall.");
            }
        }
    }

    private static String findOddNumbers(int lowerLimit, int upperLimit) {
        StringBuilder output = new StringBuilder();
        if (lowerLimit % 2 == 0) {
            lowerLimit++; 
        }
        for (int i = lowerLimit; i <= upperLimit; i += 2) {
            output.append(i);
            if (i + 2 <= upperLimit) {
                output.append(", ");
            }
        }
        return output.toString();
    }
}
