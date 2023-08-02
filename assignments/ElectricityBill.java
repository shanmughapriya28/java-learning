package assignments;

import java.util.Scanner;

public class ElectricityBill
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the reading of electricity");
        int meter_reading=in.nextInt();
        int cost=0;
        if(meter_reading<101) { // 88
            cost = 100; // 100
        }
        else if(meter_reading>100 && meter_reading<201) {  //150
            cost = 100 + (meter_reading-100)*6; //400
        }
        else if(meter_reading>200 && meter_reading<501) { //230
            cost = 100 + (meter_reading-200)*12; //460
        }
        else if(meter_reading>500) {
            cost = 100 + (meter_reading-500)*20; // 610 cost= 2300
        }
        System.out.println("The electricity bill is "+cost);
    }
}
