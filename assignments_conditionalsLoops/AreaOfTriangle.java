package assignments_conditionalsLoops;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        System.out.println("Enter the base of a triangle");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.println("Enter the height of a triangle");
        int height = input.nextInt();
        int area = (base * height)/2;
        System.out.println("The area of a triangle is "+area);
    }
}
