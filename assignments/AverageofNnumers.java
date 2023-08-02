package assignments;

import java.util.Scanner;

public class AverageofNnumers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = in.nextInt(); //5
        int sum=0;
        for(int i=1;i<=limit;i++) {  //1+2+3+4+5 = 15/5=3
            sum = sum+i;
        }
        double avg = sum/limit;
        System.out.println("Average of a n numbers "+avg);
    }
}
