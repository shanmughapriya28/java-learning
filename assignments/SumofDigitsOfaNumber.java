package assignments;

import java.util.Scanner;

public class SumofDigitsOfaNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        int temp=number;
        int sum=0;
        while(temp>0) {
            int n=temp%10;
            sum=sum+n;
            temp=temp/10;
        }
        System.out.println("The sum of the digits "+sum);
    }
}
