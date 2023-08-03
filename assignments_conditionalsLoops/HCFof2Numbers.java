package assignments_conditionalsLoops;

import java.util.Scanner;

public class HCFof2Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=in.nextInt();
        System.out.println("Enter the second number");
        int num2=in.nextInt();
        int minimum=Math.min(num1,num2);
        int finalvalue=0;
        if(num1%minimum==0 && num2%minimum==0) {
            finalvalue=minimum;
        }
        else {
            for(int i=minimum/2;i>=2;i--) {
                if(num1%i==0 && num2%i==0) {
                    finalvalue=i;
                }
            }
        }
        System.out.println("The HCF of two numbers is "+finalvalue);

    }
}
