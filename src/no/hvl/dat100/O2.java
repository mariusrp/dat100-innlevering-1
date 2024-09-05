package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

    static class Karakter { 
        int grense;
        char karakter;

        Karakter(int grense, char karakter) {
            this.grense = grense;
            this.karakter = karakter;
        }
    }

    private static final Karakter[] karakterer = {
        new Karakter(90, 'A'),
        new Karakter(80, 'B'),
        new Karakter(60, 'C'),
        new Karakter(50, 'D'),
        new Karakter(40, 'E'),
        new Karakter(0, 'F'),
    };

    public static char beregnKarakter(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("Score må være mellom 0 og 100");
        }

        for (Karakter karakter : karakterer) {
            if (score >= karakter.grense) {
                return karakter.karakter;
            }
        }
        return 'F';
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int score = 0;
            boolean isValidInput = false;

            while (!isValidInput) {
                try {
                    score = parseInt(showInputDialog("Legg inn score: "));
                    char result = beregnKarakter(score);
                    System.out.println("Du får karakter " + result);
                    isValidInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } 
            }
        }
    }
}
