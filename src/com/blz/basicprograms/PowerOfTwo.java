package com.blz.basicprograms;
    import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value from 0 to 30 to calculate 2 to the power value");
        int N=input.nextInt();
    if(N<=30){
        for(int i=0;i<=N;i++){
            int poWer=(int)(Math.pow(2,i));
            System.out.println("2 power "+i+" is "+ poWer);
        }
        else{
         System.out.println("Please enter the value between 0 to 30");
        }
      }
   }     
}
