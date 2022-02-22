package com.blz.basicprograms;
    import java.util.Scanner;
public class CheckVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter single letter");
        char ch = (char) input.next().toLowerCase().charAt(0);;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
