package assignments_conditionalsLoops;

import java.util.Scanner;

public class EvenDaysofaMonth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=31;
        int days=0;
        while(count>0) {
            if(count%2==0) {
                days++;
            }
            count--;
        }
        System.out.println("The no of days Kunal can go out "+days);
    }
}
