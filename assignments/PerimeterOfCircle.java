package assignments;

import java.util.Scanner;

public class PerimeterOfCircle {

    public static void main(String[] args) {

        float valueofPI = 3.14f;
        System.out.println("Enter the radius of the circle");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        double perimeter = 2 * valueofPI * radius;
        System.out.println("The perimeter of a circle "+perimeter);

    }
}
