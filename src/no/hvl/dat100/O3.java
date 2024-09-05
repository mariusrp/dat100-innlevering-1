package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {
    public static void main(String[] args) {
        int number = getValidatedInput("Skriv ett tall: ");
        showMessageDialog(null, getFaculty(number));
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


    private static int getFaculty(int number) {
        int sum = number;
        while (number > 1) {
            sum = sum * (number - 1);
            number--;
        }
        return sum;
    }
}
