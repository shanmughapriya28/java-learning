package assignments_conditionalsLoops;

import java.util.Scanner;

public class PowerinJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base"); //2
        int base=in.nextInt();
        System.out.println("Enter the power"); //3
        int power=in.nextInt();
        int product =1;
        for(int i=1;i<=power;i++) {
            product=product*base; //8
        }
        System.out.println("The power is "+product);
    }
}
