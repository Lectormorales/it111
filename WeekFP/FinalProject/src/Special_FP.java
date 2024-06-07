import java.util.Scanner;

public class Special_FP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a new Scanner object for input

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only)."); // end user input
        String Specials = input.next(); // Input as  string

        boolean isWeekday = true; // Declare and initialize a boolean variable to check if the input day is a weekday

        // Switch statement to check the input day and set isWeekday to false if it's a weekend day
        switch (Specials.toLowerCase()) {
            case "saturday":
            case "sunday":
                isWeekday = false;
                break;
            default:
                isWeekday = true;
                break;
        }

        // Ensure day of week is a string
        while (!Specials.matches("[a-zA-Z]+") || !isWeekday) { // Ensure if input is not a string or not a weekday
            System.out.println("Invalid input. Please enter a weekday (Monday - Friday only)."); // Prompt user to try again
            Specials = input.next(); // Read the input again


            switch (Specials.toLowerCase()) {
                case "saturday":
                case "sunday":
                    isWeekday = false;
                    break;
                default:
                    isWeekday = true;
                    break;
            }
        }

        System.out.println("How many specials of the day would you like?"); // Quantity from end user
        int coffeeamount = input.nextInt(); // Read quantity as an integer

        String coffee = ""; // coffee variable
        double priceofcoffee = 0.0; // price variable

        switch (Specials.toLowerCase()) { // Switch statement to determine coffee type and price
            case "monday":
                coffee = "Latte"; // Set coffee type to Latte
                priceofcoffee = 3.49; // Set price to 3.49
                break;
            case "tuesday":
                coffee = "Cappuccino"; // Set coffee type
                priceofcoffee = 2.49; // Set price to 2.49
                break;
            case "wednesday":
                coffee = "Mocha Latte"; // Set coffee type
                priceofcoffee = 3.99; // Set price to 3.99
                break;
            case "thursday":
                coffee = "Double Espresso Shot"; // Set coffee type
                priceofcoffee = 3.49; // Set price to 3.49
                break;
            case "friday":
                coffee = "Americano w/ Danish"; // Set coffee type
                priceofcoffee = 5.49;
                break;
        }

        if (coffeeamount > 0) { // if quantity is greater than 0
            System.out.println("Thank you");
        } else {
            System.out.println("I am sad you won't be ordering our signature drink of the day."); //if not print sad message
        }
        double discount = 0.0;
        double total = priceofcoffee * coffeeamount; // Calculate total price

        // Apply discount if the number of items is between 5 and 10
        if (coffeeamount >= 5 && coffeeamount < 10) {
            discount = total * 0.1; // Calculate 10% discount
            total -= discount; // Subtract discount from total
            System.out.println("10% discount given");
        }
        else if(coffeeamount >= 10) {
            discount = total * 0.2;// Calculate 20% discount
            total -= discount; //Subtract discount from total
            System.out.println("20% discount given");

        }else {//Set message if no discount was given
            System.out.println("No discount has been given today.");
        }


        System.out.printf("Your total for %s (%s) is $%.2f.%n", Specials, coffee, total); // Print order summary






    }
}