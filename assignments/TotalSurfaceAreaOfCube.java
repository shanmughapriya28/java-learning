package assignments;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = in.nextInt();
        int tsa = 6*side*side;
        System.out.println("The total surface area of cube "+tsa);
    }
}
