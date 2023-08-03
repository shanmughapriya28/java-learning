package assignments_conditionalsLoops;

import java.util.Scanner;

public class PerimeterofParallelogram {

    public static void main(String[] args) {

        System.out.println("Enter the base");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        System.out.println("Enter the height");
        int height = in.nextInt();
        int perimeter = 2* (base * height);
        System.out.println("Enter the perimeter "+perimeter);
    }
}
