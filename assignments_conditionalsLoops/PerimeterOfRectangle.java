package assignments_conditionalsLoops;

import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {
        System.out.println("Enter the base");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        System.out.println("Enter the length");
        int length = in.nextInt();
        int perimeter = 2*(base+length);
        System.out.println("The perimeter of the rectangle "+perimeter);
    }
}
