package assignments;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char alphabet=in.next().trim().charAt(0);
        if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u') {
            System.out.println("Its a vowel");
        }
        else {
            System.out.println("Its a consonant");
        }
    }
}
