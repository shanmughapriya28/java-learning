package assignments_conditionalsLoops;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cost of an asset");
        int costOfAsset = in.nextInt();
        System.out.println("Enter the residual value");
        int residualValue = in.nextInt();
        System.out.println("Enter the useful life of an asset");
        int UsefulLifeasset = in.nextInt();
        float depreciationValue = (costOfAsset - residualValue)/UsefulLifeasset;
        System.out.println("Enter the depreciation value "+depreciationValue);
    }
}
