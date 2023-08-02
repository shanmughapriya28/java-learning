package assignments;

import java.util.Scanner;

public class VolumeOfPyramid {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base length");
        int baselength = in.nextInt();
        System.out.println("Enter the base width");
        int widthlength = in.nextInt();
        System.out.println("Enter the height");
        int height = in.nextInt();
        double volume = (baselength*widthlength*height)/3;
        System.out.println("The volume of the pyramid is "+volume);
    }
}
