import java.io.InputStreamReader;
import java.util.Scanner;

public class LtrstoGal {

    public static void main(String[] args) {


        double gallons = 100;
        int counter = 5;


        double liters;

        for (double a = 1; a <= gallons; a+=4) {

            liters = a*3.785;

            //System.out.println(numLitersAfterConversion + " liters = " numOfGallonsToConvert"
            //print the number of liters followed by the word liters


            if (a>1) {
                System.out.printf("%.2f liters = %.1f gallons",liters,a);
                System.out.println();
            }
            else {System.out.printf("%.2f liters = %.1f gallon",liters,a);
                System.out.println();}

            counter++;

            if (counter %5 == 0) {

                System.out.println();

            }

        }
        System.out.println("We are done!");


































    }
}
