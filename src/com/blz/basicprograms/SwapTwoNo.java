package com.blz.basicprograms;
    import java.util.Scanner;
public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = input.nextInt();
        System.out.println("Enter second number");
        int secondNum = input.nextInt();
        System.out.println("Entered first number is " + firstNum + " and second number is " + secondNum + "");
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("After swapping first number is " + firstNum + " and second number is " + secondNum + "");
    }
}