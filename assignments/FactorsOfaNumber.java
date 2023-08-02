package assignments;

import java.util.Scanner;

public class FactorsOfaNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt(); // 15 1,3,5,15
        for(int i=1;i<=number;i++) {
            if(number%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
