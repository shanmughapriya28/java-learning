package assignments;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        System.out.println("Getting the x1,y1 values for point a");
        Scanner in = new Scanner(System.in);
        int x1=in.nextInt();
        int y1=in.nextInt();
        System.out.println("Getting the x2,y2 values for point b");
        int x2=in.nextInt();
        int y2=in.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between two points "+distance);
    }
}
