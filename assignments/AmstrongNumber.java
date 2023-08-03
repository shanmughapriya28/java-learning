package assignments;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number"); //153 1+125+27=153
        int number =in.nextInt();
        int temp=number;
        int sum=0;
        int mul=1;
        while(temp>0) {
            int n = temp%10;
            sum=sum+n*n*n;
            temp=temp/10;
        }
        if(sum==number) {
            System.out.println("Amstrong number");
        }
        else {
            System.out.println("Not a amstrong number");
        }
    }
}
