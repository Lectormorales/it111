import java.util.Scanner;

public class GradeAveraging {

    public static void main(String []args){

    //ask the end user to enter their numerical grades.
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        //System.in is an argument because
        Scanner input = new Scanner(System.in);
        //you are receiving info
        //Our while loop will be counting how many times we are asking our end user
        //to input their grades
        while(counter <= 5) {

            System.out.println("Please enter your " +counter+ " numerical grade");

            grade = input.nextInt();
            total += grade;
            counter += 1;

        }// the word counter initially showed up red
        //it means we did not assign a value before using the word counter

            //this adds each grade from the input










    }
}
