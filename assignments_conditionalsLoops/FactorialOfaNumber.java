package assignments_conditionalsLoops;

import java.util.Scanner;

public class FactorialOfaNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt(); //4 4*3*2*1 = 24
        int count=number;
        int factorial=1;
        while(count>0) {
            factorial=factorial*count;
            count--;
        }
        System.out.println("the factorial of a number is "+factorial);
    }
}
