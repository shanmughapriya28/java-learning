package assignments_conditionalsLoops;

import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args) {
        System.out.println("Enter the base");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.println("Enter the height");
        int height = input.nextInt();
        int area = base*height;
        System.out.println("the area of parallelogram "+area);
    }
}
