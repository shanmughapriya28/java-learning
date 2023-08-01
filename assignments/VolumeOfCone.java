package assignments;

import java.util.Scanner;

public class VolumeOfCone {

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        System.out.println("Enter the height");
        float height = in.nextFloat();
        double volume = 0.33 * 3.14 * (radius*radius*height);
        System.out.println("The volume of the cone "+volume);
    }
}
