package com.blz.basicprograms;
    import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Nth Harmonic number");
        int Num=input.nextInt();
        double div=0.0,store=0.0,Harmonic=0.0;
        for(int i=1;i<=Num;i++){
            div = (double) 1/i;
            System.out.print(div +", ");
            store =+ store + div;
            Harmonic =+ Harmonic + store;
        }
        System.out.print("\nEntered Harmonic value is "+ Harmonic);
    }
}
