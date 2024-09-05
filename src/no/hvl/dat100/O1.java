package no.hvl.dat100;

import java.util.Scanner;

class Trinn {
    private double nedreGrense;
    private double øvreGrense;
    private double sats;

    public Trinn(double nedreGrense, double øvreGrense, double sats) {
        this.nedreGrense = nedreGrense;
        this.øvreGrense = øvreGrense;
        this.sats = sats;
    }

    public double beregnTrinnskatt(double inntekt) {
        if (inntekt > nedreGrense) {
            double skattbartBeløp = Math.min(inntekt, øvreGrense) - nedreGrense;
            return skattbartBeløp * sats;
        }
        return 0;
    }
}

public class O1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn din årsinntekt: ");
        double årsinntekt = scanner.nextDouble();
        scanner.close();
        
        double totalTrinnskatt = 0;
        Trinn[] trinnListe = {
            new Trinn(208051, 292850, 0.017),
            new Trinn(292851, 670000, 0.04),
            new Trinn(670001, 937900, 0.136),
            new Trinn(937901, 1350000, 0.166),
            new Trinn(1350001, Double.MAX_VALUE, 0.176)
        };

        for (Trinn trinn : trinnListe) {
            totalTrinnskatt += trinn.beregnTrinnskatt(årsinntekt);
        }

        System.out.printf("Total trinnskatt for en inntekt på %.2f NOK er: %.2f NOK%n", årsinntekt, totalTrinnskatt);
    }
}
