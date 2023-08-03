package assignments;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        int temp=number;
        int newnum=0;
        while(temp>0) {
            int n=temp%10;
            newnum=newnum*10+n;
            temp=temp/10;
        }
        if(newnum==number) {
            System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given number is not palindrome");
        }
    }
}
