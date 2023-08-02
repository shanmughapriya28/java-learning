package assignments;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit"); //7  0,1,1,2,3,5,8
        int limit = in.nextInt();
        int n1=0;
        int n2=1;
        int count=3;
        int sum=0;
        while(count<=limit) {
            sum=n1+n2;
            n1=n2;
            n2=sum;
            count++;
        }
        System.out.println(sum);
    }
}
