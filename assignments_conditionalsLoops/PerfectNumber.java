package assignments_conditionalsLoops;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=in.nextInt();
        int sum=0;
        for(int i=1;i<number;i++) {
            if(number%i==0) {
                sum=sum+i;
            }
        }
        if(sum==number) {
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
}
