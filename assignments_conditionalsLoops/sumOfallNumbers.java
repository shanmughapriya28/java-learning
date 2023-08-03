package assignments_conditionalsLoops;

import java.util.Scanner;

public class sumOfallNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while(true) {
            System.out.println("Enter a number");
            int number = in.nextInt(); // 1 2 4 7 0 =14
            if(number!=0) {
                 sum = sum+number;
            }
            else {
                break;
            }
        }
        System.out.println(sum);
    }
}
