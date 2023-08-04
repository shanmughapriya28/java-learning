package Functions_Lectures;

import java.util.Scanner;

public class SumUsingFunction {

    public static void main(String[] args) {

        //sum();
        //int sum=sum2();
        //System.out.println(sum);
        int ans = sum3(20,30);
        System.out.println(ans);

        //pass the value of the numbers while calling the function

    }

    static int sum3(int a, int b) {
        int sum=a+b;
        return sum;
    }

    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=in.nextInt();
        System.out.println("Enter number 2");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=in.nextInt();
        System.out.println("Enter number 2");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum "+sum);
    }

    /*
         access modifier {we'll look in OOPS} return_type name(arguments) {
             body of function
             return statement
         }

     */
}
