package com.blz.basicprograms;
    import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int Num = input.nextInt();
        if (Num % 2 == 0) {
            System.out.println("Entered number "+Num+" is Even");
        } else {
            System.out.println("Entered number "+Num+" is Odd");
        }
    }
}
