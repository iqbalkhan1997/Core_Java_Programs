package com.blz.basicprograms;

    import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int X, Y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        X = s.nextInt();
        System.out.println("Enter the second number:");
        Y = s.nextInt();
        double Distance=Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
        System.out.println("Distance from the origin is "+ Distance);
    }
}
