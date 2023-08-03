package assignments_conditionalsLoops;

import java.util.Scanner;

public class LargestOfAllNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int largest = 0;
        while(true) {
            System.out.println("Enter a number"); // 2 5 8 4 0 = 8
            int number = in.nextInt();
            if(number!=0) {
                if(number>largest) {
                    largest=number;
                }
            }
            else {
                break;
            }
        }
        System.out.println("The largest of the nos are "+largest);
    }
}
