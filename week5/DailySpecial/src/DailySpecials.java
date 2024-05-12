
import java.util.Scanner;

public class DailySpecials {
    public static void main(String[] args) {



        //creating a switch in java
        String Specials =""; //no value for the variable
        Scanner input = new Scanner(System.in);//because we will be receiving user input
        //ask end user to enter the day of the week
        System.out.println("Please enter a day of the week excluding weekends( Monday - Friday only).");


        Specials = input.next();//since the variable Special is a string the input.next is assigned to Specials

        Scanner latte = new Scanner(System.in);
        System.out.println("How many lattes would you like? ");//per the assignment

         int numberoflattes = latte.nextInt();

        if ( numberoflattes> 0) {
            System.out.println("Thank you");

        }else {
            System.out.println("I am sad you won't be ordering our signature latte.");
        }



        Scanner frappucino = new Scanner(System.in);
        System.out.println("How many frappucinos would you like? ");//per the assignment

        int numberoffraps = frappucino.nextInt();
        double RegPriceofFrap = 3.99;

            if ( numberoffraps> 0) {
                System.out.println("Looks like you'll be ordering "+numberoffraps+" frappucinos today.");
                System.out.printf( "Your total for this order is $%.2f. ", RegPriceofFrap*numberoffraps);
        }else {
            System.out.println("I am sad you won't be ordering our masterful frappucinos.");
        }






        //since we are no longer asking the end user for further info, so we can now close the input
//        input.close();

        //we are going to create a boolean here
        // in the world of coffee, I need a name of a coffee beverage, and a price.
        String Coffee;
        String CupSize;
        double Price;

        boolean Saturday = Specials.equals("Saturday");
        boolean Sunday = Specials.equals("Sunday");
//if saturday or sunday is true
        if (Saturday||Sunday) {//so if the end user inputs one of these two days, they will receive message below.
            System.out.println("Please enter the correct weekday, not a weekend day.");
            Specials = input.next();//this will allow the end user to input the correct day. also, make sure
        }
        switch (Specials) {

            //cases will be the day of the week
            case "Monday", "monday", "MONDAY" -> {
                Coffee = "Latte";
                CupSize = "Medium";
                Price = 3.49;
//                System.out.println(CupSize);
//                System.out.println(Coffee);
//                System.out.println("$"+Price);
                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
            }
            case "Tuesday", "tuesday", "TUESDAY" -> {
                Coffee = "Capucino";
                CupSize = "Medium";
                Price = 2.49;
                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
            }
            case "Wednesday", "wednesday","WEDNESDAY" -> {
                Coffee = "Mocha Latte";
                CupSize = "large";
                Price = 3.99;
                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
            }
            case "Thursday", "thursday", "THURSDAY" -> {
                Coffee = "Espresso";
                CupSize = "Double Shot";
                Price = 3.49;
                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);
            }
            case "Friday", "friday", "FRIDAY" -> {
                Coffee = "Americano with a Danish";
                CupSize = "complimentary";
                Price = 2.99;
                System.out.println(Specials + "'s coffee of the day is a " + CupSize + " size, " + Coffee + " that is just $" + Price);//I added a lower case and UPPER CASE
                // spelling of monday because some people may skip capitalizing
                //            default:
                //System.out.println("Please use a valid weekday or check your spelling.");





            }
        }










    }
}
