import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

//        String car = " Volvo";

        String[] cars = new String[4];
        //in many computer programs we start the counts at 0 not 1.
        //four car variables or four car items

        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Renault";
        // we cannot print all of the lines in an array, only one of them.

        System.out.println(cars[3].toUpperCase());
        System.out.println(Arrays.toString(cars));

        //String[]games = {"Skyrim","Witcher","Fallout","Elden Ring","God of War"};
//        String[] games = new String[5];
//
//        games[0] = "Skyrim";
//        games[1] = "Witcher";
//        games[2] = "Fallout";
//        games[3] = "Elden Ring";
//        games[4] = "God of War";
//
//        System.out.println(Arrays.toString(games));

        //for each loop with a String array

//        for(String game : games) {
//            System.out.println(game);
        //for each loop with an int array
       int[] numbers = new int[4];

        numbers[0] = 20;
        numbers[1] = 40;
        numbers[2] = 60;
        numbers[3] = 80;
            System.out.println(Arrays.toString(numbers));

            for (int number:numbers) {

                System.out.println(number);
            }
        String[] drinks = new String[5];

        drinks[0] = "Manhattan";
        drinks[1] = "Long Island";
        drinks[2] = "Blue Hawaiian";
        drinks[3] = "Screw Driver";
        drinks[4] = "Madori Sour";

        for (String drink : drinks) {

            System.out.println(drink);
            System.out.println(drink.length());

        }

//to stop a loop after blue hawaiian from appearing
        for (String drink : drinks) {

            if(drink.equals("Screw Driver")) {

                break;
            }
            System.out.println(drink);

        }
        }
    }

