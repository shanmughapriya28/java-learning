package assignments;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of subjects");
        int noofsubjects = in.nextInt();
        int temp=noofsubjects;
        float total=0;
        while(temp>0) {
            System.out.println("Enter the marks of the subject");
            float marks = in.nextFloat();
            total=total+marks;
            temp--;
        }
        double average = total/noofsubjects;
        System.out.println("The average marks is "+average);
    }
}
