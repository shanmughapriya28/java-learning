package assignments;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {
        System.out.println("Enter the side of the triangle");
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        double area = (Math.sqrt(3)/4) * side * side;
        System.out.println("The area of the triangle is "+area);
    }
}
