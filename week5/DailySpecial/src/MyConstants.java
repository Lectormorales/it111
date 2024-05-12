import java.util.Scanner;

public class MyConstants {

    public static void main (String[] args) {

final int TOUCHDOWN = 6;
final int CONVERSION =1;
final int FIELDGOAL = 3;

int td, con, fg;

//we will be asking the end user to enter the touchdowns, conv, and fg
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of touchdowns: ");
        td = input.nextInt() * TOUCHDOWN; //whatevver the enduser enters it is assigned to td.
        //We are calculating our info into the variable

        System.out.println("Please enter the number of conversions: ");
        con = input.nextInt() * CONVERSION; //whatevver the enduser enters it is assigned to td.

        System.out.println("Please enter the number of field goals: ");
        fg = input.nextInt() * FIELDGOAL; //whatevver the enduser enters it is assigned to td.

        System.out.println(td);
        System.out.println(con);
        System.out.println(fg);

//        System.out.println(td+con+fg+" is the total score for my team.");
            System.out.print("Our total score is ");
            System.out.println(td+con+fg);
    }
}
