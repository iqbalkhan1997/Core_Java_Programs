package com.blz.basicprograms;
    import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Nth Harmonic number");
        int N = input.nextInt();
        //primeFactors(N);
        int i;
        for(i=2;i*i<=N;i++){
            while(N%i==0){
                System.out.println(i+" ");
                N=N/i;
            }
            }

        }


    }
