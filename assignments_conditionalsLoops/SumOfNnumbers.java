package assignments_conditionalsLoops;

import java.util.Scanner;

public class SumOfNnumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = in.nextInt();
        int sum=0;
        while(limit>0) {
            System.out.println("Enter the number");
            int number = in.nextInt();
            sum=sum+number;
            limit--;
        }
        System.out.println("The sum of n numbers is "+sum);
    }
}
