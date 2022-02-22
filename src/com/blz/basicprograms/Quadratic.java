package com.blz.basicprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c;
        double root1=0.0, root2=0.0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the a value:");
        a = s.nextDouble();
        System.out.print("Enter the b value:");
        b = s.nextDouble();
        System.out.print("Enter the c value:");
        c = s.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Roots are imaginary");
        } else if (delta == 0) {
            System.out.println("Roots are Equal");
            root1 = -b / (2 * a);
            root2 = -b / (2 * a);
        } else {
            System.out.println("Roots are Unequal");
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        System.out.println("Roots of the quadratic equations are");
        System.out.println("Root1 : "+ root1);
        System.out.println("Root2 : "+ root2);
    }
}
