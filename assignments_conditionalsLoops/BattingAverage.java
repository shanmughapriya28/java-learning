package assignments_conditionalsLoops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total runs scored");
        int runs = in.nextInt();
        System.out.println("Enter the total no of times they have been out");
        int out = in.nextInt();
        float battingaverage = runs/out;
        System.out.println("The batting average "+battingaverage);
    }
}
