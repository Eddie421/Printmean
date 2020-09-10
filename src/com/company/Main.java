package com.company;

public class Main {

    public static void main(String[] args) {
        //text

        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc( 1, 1, 3,  3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc( 1, 2, 3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc( 1,  -2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc( -1, -11, 24, 2));
    }

    public static String meanCalc(int a, int b, int c, int d) {
        // gör en sträng av "mean"

        double mean = (a + b + c + d) / 4.0;
        String meanString = "" + mean;

        return meanString;
    }
}