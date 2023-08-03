package assignments_conditionalsLoops;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        float valueofPI = 3.14f;
        System.out.println("Enter the radius of the circle");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        double area = valueofPI*radius*radius;
        System.out.println("The area of the circle is "+area);
    }
}
