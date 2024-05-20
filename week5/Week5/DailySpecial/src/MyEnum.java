import java.util.Scanner;

public class MyEnum {

    enum WhoWins {HOME, VISITING,NEITHER}//remember that the datatype you are creating is outside or above the
    //public main method
    public static void main(String[] args) {
    //going to declare a variable
        WhoWins who;// who is the variable for the WhoWins type
        int seahawks, broncos;
    //next, we are going to ask the end user to enter a score
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the final score for the Seahawks: ");
        seahawks = input.nextInt();
        System.out.println("Please enter the final score for the Broncos: ");
        broncos = input.nextInt();
        // the system,in is for gathering that info
        //when asking for score the first score is...
        //the INT is for numerical input fo the score
        //ask for the score in both prints for the seahawks and the broncos

        //now we will use and if/else statement to determine the who won or who
        //lost or was it a tie.
        //logic behind it.  If the Seahawks score is greater than the Broncos, we capture
        //our response here's how that looks like below.
        if(seahawks > broncos) {
            // remember that seahawks would the home team and broncos are the visitors

            who = WhoWins.HOME;//Whowins.home is an object of the whowins type
            System.out.println(who+" team won!");
//            System.out.println("Seahawks win");//removing the ln in println below
            System.out.print("Seahawks win by ");
            System.out.print(seahawks - broncos+" points!");

            //what happens if the seahawks tie versus win or lose, then an if-else state will be used
        } else if (broncos > seahawks ) {
            who = WhoWins.VISITING;//Whowins.visitor is an object of the whowins type
            System.out.println(who+" team won!");//removing the ln in println below
            System.out.print("Broncos win by ");
            System.out.print(broncos - seahawks+" points.");
        }
        else {
            who = WhoWins.NEITHER;//Whowins.neither is an object of the whowins type
            System.out.println(who+" team won");
            System.out.print(who+" It's a Draw.");
        }


    }











}
