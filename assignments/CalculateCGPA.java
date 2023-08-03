package assignments;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total no of subjects");
        float noofsubjects = in.nextFloat();
        float temp=noofsubjects;
        float sum=0;
        while(temp>0) {
            System.out.println("Enter the grade point out of 10");
            int gradepoint=in.nextInt();
            sum=sum+gradepoint;
            temp--;
        }
        float CGPA=sum/noofsubjects;
        System.out.println("The CGPA is "+CGPA);
    }
}
