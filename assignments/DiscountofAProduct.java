package assignments;

import java.util.Scanner;

public class DiscountofAProduct
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the product price");
        float product_price=in.nextFloat(); //100
        System.out.println("Enter the discount %");
        int discount = in.nextInt(); //20
        double finalprice = product_price - (discount*product_price)/100; //80
        System.out.println("The final price is "+finalprice);
    }
}
