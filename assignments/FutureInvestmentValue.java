package assignments;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the present value");
        int presentvalue = in.nextInt();
        System.out.println("Enter the interest rate");
        int interest = in.nextInt();
        System.out.println("Enter the time");
        int n=in.nextInt();
        int value = 1+interest;
        int totalvalue=1;
        while(n>0) {
           totalvalue=totalvalue*value;
           n--;
        }
        int futureinvestment = totalvalue*presentvalue;
        System.out.println("The future investment is "+futureinvestment);
    }
}
