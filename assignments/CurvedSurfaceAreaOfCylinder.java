package assignments;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius = in.nextFloat();
        System.out.println("Enter the height");
        float height = in.nextFloat();
        double csa = 2*3.14*radius*height;
        System.out.println("The curved surface area of cylinder "+csa);
    }
}
