package com.blz.basicprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double t, v;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the fahrenheit value below 50 :");
        t = s.nextDouble();
        System.out.println("Enter the wind speed value between 3 to 120 :");
        v = s.nextDouble();
        if (t <= 50 && v >= 3 && v <= 120) {
            double windChill = 35.74 + (0.6215 * t) + (0.4275 * t * Math.pow(v, 0.16)) - 35.75 * Math.pow(v, 0.16);
            System.out.println("Wind Chill value is : " + windChill);
        }
        else{
            System.out.println("Enter the values in the provided range");
        }
    }
}
