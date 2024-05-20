

import java.util.Scanner;

public class DailySpecials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a new Scanner object for input

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only)."); // end user input
        String Specials = input.next(); // Input as  string

        // Ensure day of week is a string
        while (!Specials.matches("[a-zA-Z]+")) { // Ensure if input is not a string
            System.out.println("Invalid input. Please enter a day of the week (Monday - Friday only)."); // Prompt user to try again
            Specials = input.next(); // Read the input again
        }

        while (Specials.equalsIgnoreCase("Saturday") || Specials.equalsIgnoreCase("Sunday")) { // Check if input is a weekend day
            System.out.println("Please enter a weekday (Monday - Friday only)."); // Prompt user to try again
            Specials = input.next(); // Read the input again
        }

        System.out.println("How many specials of the day would you like?"); // Quantity from end user
        int coffeeamount = input.nextInt(); // quantity as an integer

        String coffee = ""; // coffee variable
        double priceofcoffee = 0.0; // price variable

        switch (Specials) { // Switch statement to determine coffee type and price
            case "Monday","monday","MONDAY":
                coffee = "Latte"; // Set coffee type to Latte
                priceofcoffee = 3.49; // Set price to 3.49
                break;

            case "Tuesday","tuesday","TUESDAY":
                coffee = "Cappuccino"; // Set coffee type
                priceofcoffee = 2.49; // Set price to 2.49
                break;

            case "Wednesday","wednesday","WEDNESDAY":
                coffee = "Mocha Latte"; // Set coffee type
                priceofcoffee = 3.99; // Set price to 3.99
                break;

            case "Thursday","thursday","THURSDAY":
                coffee = "Double Espresso Shot"; // Set coffee type
                priceofcoffee = 3.49; // Set price to 3.49
                break;
            case "Friday","friday","FRIDAY":
                coffee = "Americano w/ Danish"; // Set coffee type
                priceofcoffee = 5.49; // Set price to 5.49
                break;
        }

        if (coffeeamount > 0) { // if quantity is greater than 0
            System.out.println("Thank you"); // Print thank you message
        } else {
            System.out.println("I am sad you won't be ordering our signature drink of the day."); //if not print sad message
        }

        double total = priceofcoffee * coffeeamount; // Calculate total price
        System.out.printf("Your total for %s (%s) is $%.2f.%n", Specials, coffee, total); // Print order summary
    }
}