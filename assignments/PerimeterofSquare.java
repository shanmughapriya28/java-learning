package assignments;

import java.util.Scanner;

public class PerimeterofSquare {

    public static void main(String[] args) {
        System.out.println("Enter the side");
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int perimeter = 4*side;
        System.out.println("the perimeter of the square "+perimeter);
    }
}
