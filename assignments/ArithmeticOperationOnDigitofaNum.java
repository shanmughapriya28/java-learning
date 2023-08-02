package assignments;

import java.util.Scanner;

public class ArithmeticOperationOnDigitofaNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt(); // 87 56-15=41  343 36-10 = 26
        int multiple = 1;
        int add=0;
        int sub=0;
        while(number>0) {
            int num=number%10;
            multiple=multiple*num;
            add=add+num;
            number=number/10;
        }
        sub=multiple-add;
        System.out.println(sub);
    }
}
