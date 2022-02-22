package com.blz.basicprograms;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        System.out.println("How many number of times a coin to flip?");
        Scanner input = new Scanner(System.in);
        int flips = input.nextInt();

        int heads = 0, tails = 0,coin=1;
        double HeadsPercentage,TailsPercentage;

        while (coin<=flips) {
            double random = Math.random();
            //System.out.println(coin);
            if (random < 0.5) {
                tails++;
                System.out.println("It is tails");
            } else {
                heads++;
                System.out.println("It is heads");
            }
            coin++;
        }
        System.out.println("Heads flipped "+heads+" times and Tails flipped "+tails+" times");
        HeadsPercentage=(double)((heads*100)/flips);
        TailsPercentage=100-HeadsPercentage;
        System.out.println("Heads percentage is "+HeadsPercentage+"");
        System.out.println("Tails percentage is "+TailsPercentage+"");

    }
}