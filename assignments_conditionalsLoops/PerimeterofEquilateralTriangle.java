package assignments_conditionalsLoops;

import java.util.Scanner;

public interface PerimeterofEquilateralTriangle {

    public static void main(String[] args) {
        System.out.println("Enter the side of the triangle");
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int perimeter = 3 * side * side * side;
        System.out.println("The perimeter of the triangle "+perimeter);
    }
}
