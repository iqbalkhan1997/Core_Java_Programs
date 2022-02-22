package com.blz.basicprograms;
    import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 to the power value");
        int N=input.nextInt();

        for(int i=0;i<=N;i++){
            int poWer=(int)(Math.pow(2,i));
            System.out.println("2 power "+i+" is "+ poWer);
        }
    }
}
