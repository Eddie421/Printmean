package com.company;

public class Main {

    public static void main(String[] args) {
        //text

        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc( 1, 1, 3,  3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc( 1, 2, 3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc( 1,  -2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc( -1, -11, 24, 2));
        System.out.println("Mean of -11, -113, 124, 23: " + meanCalc( -11, -111, 124, 23));
    }

    public static String meanCalc(int a, int b, int c, int d) {
        // gör en sträng av "mean"

        double mean = (a + b + c + d) / 4.0;
        String meanString = "" + mean;

        //5,0

        return meanString;
    }
}