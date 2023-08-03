package assignments_conditionalsLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = in.next();
        String reverseword="";
        for(int i=word.length()-1;i>=0;i--) {
            reverseword=reverseword+word.charAt(i);
        }
        System.out.println("The reverese of a string is "+reverseword);
    }
}
