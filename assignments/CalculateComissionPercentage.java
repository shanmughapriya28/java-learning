package assignments;

import java.util.Scanner;

public class CalculateComissionPercentage {

    public static void main(String[] args) {

        System.out.println("Enter the total sales revenue");
        Scanner in = new Scanner(System.in);
        float totalsalesrevenue = in.nextFloat();
        System.out.println("Enter the commission percentage");
        float commissionpercentage = in.nextFloat();
        double commission = (totalsalesrevenue * commissionpercentage)/100;
        System.out.println("The commission is "+commission);
    }
}
