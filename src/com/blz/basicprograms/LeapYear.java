package com.blz.basicprograms;
 import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the year number in 4 digits eg: 0001");
        int year=input.nextInt();
        if((year%100 != 0) && (year%4 == 0) || (year%400 == 0)){
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }
    }
}
