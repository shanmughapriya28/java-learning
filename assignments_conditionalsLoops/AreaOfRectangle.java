package assignments_conditionalsLoops;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        System.out.println("Enter the breadth of the rectangle");
        Scanner input = new Scanner(System.in);
        int breadth = input.nextInt();
        System.out.println("Enter the length of the rectangle");
        int length = input.nextInt();
        int area = length * breadth;
        System.out.println("The area of a rectangle "+area);
    }
}


