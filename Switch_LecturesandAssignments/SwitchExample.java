package Switch_LecturesandAssignments;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruit =in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("Kind of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grape":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}
