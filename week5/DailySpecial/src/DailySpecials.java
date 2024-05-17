
import java.util.Scanner;


//    public static void main(String[] args) {
//
//        Specials = input.next();
//        if (Specials.equals("Saturday") || Specials.equals("Sunday")) {
//            System.out.println("Please enter the correct weekday, not a weekend day.");
//            Specials = input.next();
//        } else {
//            System.out.println("How many lattes would you like? ");
//            int numberoflattes = input.nextInt();
//        //creating a switch in java
//        String Specials =""; //no value for the variable
//        Scanner input = new Scanner(System.in);//because we will be receiving user input
//        //ask end user to enter the day of the week
//        System.out.println("Please enter a day of the week excluding weekends( Monday - Friday only).");
//
//
//  //since the variable Special is a string the input.next is assigned to Specials
//
//        Scanner latte = new Scanner(System.in);
//        System.out.println("How many lattes would you like? ");//per the assignment
//
//         int numberoflattes = latte.nextInt();
//
//        if ( numberoflattes> 0) {
//            System.out.println("Thank you");
//
//        }else {
//            System.out.println("I am sad you won't be ordering our signature latte.");
//        }
//
//
//
//        Scanner frappuccino = new Scanner(System.in);
//        System.out.println("How many frappuccinos would you like? ");//per the assignment
//
//        int numberoffraps = frappuccino.nextInt();
//        double RegPriceofFrap = 3.99;
//
//            if ( numberoffraps> 0) {
//                System.out.println("Looks like you'll be ordering "+numberoffraps+" frappuccinos today.");
//                System.out.printf( "Your total for this order is $%.2f. ", RegPriceofFrap*numberoffraps);
//        }else {
//            System.out.println("I am sad you won't be ordering our masterful frappuccinos.");
//
//        }
//
//
//
//
//
//
//        //since we are no longer asking the end user for further info, so we can now close the input
////        input.close();
//
//        //we are going to create a boolean here
//        // in the world of coffee, I need a name of a coffee beverage, and a price.
//        String Coffee;
//        String CupSize;
//        double Price;
//
//        boolean Saturday = Specials.equals("Saturday");
//        boolean Sunday = Specials.equals("Sunday");
////if saturday or sunday is true
//        if (Saturday||Sunday) {//so if the end user inputs one of these two days, they will receive message below.
//            System.out.println("Please enter the correct weekday, not a weekend day.");
//            Specials = input.next();//this will allow the end user to input the correct day. also, make sure
//        }
//        switch (Specials) {
//
//            //cases will be the day of the week
//            case "Monday", "monday", "MONDAY" -> {
//                Coffee = "Latte";
//                CupSize = "Medium";
//                Price = 3.49;
////                System.out.println(CupSize);
////                System.out.println(Coffee);
////                System.out.println("$"+Price);
//                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
//                break;
//            }
//            case "Tuesday", "tuesday", "TUESDAY" -> {
//                Coffee = "Cappuccino";
//                CupSize = "Medium";
//                Price = 2.49;
//                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
//                break;
//            }
//            case "Wednesday", "wednesday","WEDNESDAY" -> {
//                Coffee = "Mocha Latte";
//                CupSize = "large";
//                Price = 3.99;
//                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
//                break;
//            }
//            case "Thursday", "thursday", "THURSDAY" -> {
//                Coffee = "Espresso";
//                CupSize = "Double Shot";
//                Price = 3.49;
//                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
//                break;
//            }
//            case "Friday", "friday", "FRIDAY" -> {
//                Coffee = "Americano with a Danish";
//                CupSize = "complimentary";
//                Price = 2.99;
//                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);//I added a lower case and UPPER CASE
//                break;
//                // spelling of monday because some people may skip capitalizing
//                // default:
////                System.out.println("Please use a valid weekday or check your spelling.");
//
//
//
//
//
//            }
//        }
//
//
//
//
//
//
//
//
//
//
//    }
//}
import java.util.Scanner;

public class DailySpecials {
    public static void main(String[] args) {
        // Create a Scanner object for te end user info
        Scanner input = new Scanner(System.in);
        //the end user will enter the day of the week
        System.out.println("Please enter a day of the week excluding weekends( Monday - Friday only).");
        String Specials = input.next();
        // Check if the end user entered Saturday or Sunday
        while (Specials.equalsIgnoreCase("Saturday") || Specials.equalsIgnoreCase("Sunday")) {
            System.out.println("Please enter the correct weekday, not a weekend day.");
            Specials = input.next();
        }
        //the end user will enter how many lattes they want
        System.out.println("How many lattes would you like? ");
        int numberoflattes = input.nextInt();
        // the end user ordered lattes if >0; if 0 then else will print
        if (numberoflattes > 0) {
            System.out.println("Thank you");
        } else {
            System.out.println("I am sad you won't be ordering our signature latte.");
        }
        //the end user is asked how many frappuccinos they want
        System.out.println("How many frappuccinos would you like? ");
        int numberoffraps = input.nextInt();
        double RegPriceofFrap = 3.99;
        //// Check if the user ordered frappuccinos and if not the else statement will kick in
        if (numberoffraps > 0) {
            System.out.println("Looks like you'll be ordering " + numberoffraps + " frappuccinos today.");
            System.out.printf("Your total for this order is $%.2f. ", RegPriceofFrap * numberoffraps);
        } else {
            System.out.println("I am sad you won't be ordering our masterful frappuccinos.");
        }
        // dily specials list using switch  and case
        switch (Specials) {
            case "Monday", "monday", "MONDAY":

                System.out.println(Specials + "'s coffee of the day is a Medium size, Latte that is just $3.49");
                break;
            case "Tuesday", "tuesday", "TUESDAY":

                System.out.println(Specials + "'s coffee of the day is a Medium size, Cappuccino that is just $2.49");
                break;
            case "Wednesday", "wednesday", "WEDNESDAY":

                System.out.println(Specials + "'s coffee of the day is a large size, Mocha Latte that is just $3.99");
                break;
            case "Thursday", "thursday", "THURSDAY":

                System.out.println(Specials + "'s coffee of the day is a Double Shot size, Espresso that is just $3.49");
                break;
            case "Friday", "friday", "FRIDAY":

                System.out.println(Specials + "'s coffee of the day is a complimentary size, Americano with a Danish that is just $2.99");
                break;
        }
    }
}