package com.blz.basicprograms;
    import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Nth Harmonic number");
        int Num=input.nextInt();
        double div=0.00,store=0.00,Harmonic=0.00;
        for(int i=1;i<=Num;i++){
            div = (double) 1/i;
            System.out.print(div +", ");
            store =+ store + div;
            Harmonic =+ Harmonic + store;
        }
        System.out.print("\nFor the Entered number, Harmonic value is "+ Harmonic);
    }
}
