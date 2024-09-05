package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B2 {
    public static void main(String[] args) {
        double x = getValidatedDoubleInput("Enter a number: ");
        int n = getValidatedIntegerInput("Times to multiply: ");

        double resultByMath = Math.pow(x, n);
        double resultByLoop = x;
        for (int i = 0; i < n - 1; i++) {
            resultByLoop = resultByLoop * x;
        }

        showMessageDialog(null, "Math: " +resultByMath + ", Loop: " + resultByLoop);
    }

    private static double getValidatedDoubleInput(String message) {
        while (true) {
            try {
                String inputStr = showInputDialog(message);
                double number = Double.parseDouble(inputStr);
                return number;
            } catch (NumberFormatException e) {
               showMessageDialog(null, "Skriv et gyldig tall (Double).");
            }
        }
    }

    private static int getValidatedIntegerInput(String message) {
        while (true) {
            try {
                String inputStr = showInputDialog(message);
                int number = Integer.parseInt(inputStr);
                return number;
            } catch (NumberFormatException e) {
               showMessageDialog(null, "Skriv et gyldig tall (Int).");
            }
        }
    }

    
}
