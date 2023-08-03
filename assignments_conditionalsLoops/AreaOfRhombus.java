package assignments_conditionalsLoops;

import java.util.Scanner;

public class AreaOfRhombus {

    public static void main(String[] args) {
        System.out.println("Enter the first diagonal length");
        Scanner input = new Scanner(System.in);
        int diagonal1 = input.nextInt();
        System.out.println("Enter the second diagonal length");
        int diagonal2 = input.nextInt();
        int area = (diagonal1 * diagonal2)/2;
        System.out.println("Area of a rhombus is "+area);
    }
}
