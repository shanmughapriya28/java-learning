package assignments;

import java.util.Scanner;

public class VolumeofSphere {

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        double volume = 1.33 * 3.14 * radius*radius;
        System.out.println("The volume of the sphere is "+volume);
    }
}
