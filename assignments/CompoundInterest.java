package assignments;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal");
        float principal = in.nextFloat();
        System.out.println("Enter the interest rate ");
        int rateOfInterest = in.nextInt();
        System.out.println("Enter the no of times the interest has been applied for ");
        int nooftimes = in.nextInt();
        System.out.println("Enter the time duration");
        float duration = in.nextFloat();
        double amount = principal*((nooftimes+rateOfInterest)/nooftimes)*nooftimes*duration;
        System.out.println("The amount "+amount);
    }
}
