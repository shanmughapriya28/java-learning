package assignments;

import java.util.Scanner;

public class SumOfAllkindsofNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negativesum=0;
        int positiveevensum=0;
        int positiveoddsum=0;
        while(true) {
            System.out.println("Enter a number");
            int number = in.nextInt();
            if(number<0) {
                negativesum+=number;
            }
            else if(number>0 && number%2==0) {
                positiveevensum+=number;
            }
            else if(number>0 && number%2==1) {
                positiveoddsum+=number;
            }
            else if(number==0) {
                break;
            }
        }
        System.out.println("Negative numbers sum "+negativesum);
        System.out.println("Positive odd numbers sum "+positiveoddsum);
        System.out.println("Positive even numbers sum "+positiveevensum);
    }
}
