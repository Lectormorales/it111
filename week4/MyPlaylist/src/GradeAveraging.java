import java.util.Scanner;

public class GradeAveraging {

    public static void main(String [] args){
    int counter = 1;//this will allow the program to count 1,2,3,4,5
    int grades; //numeric data type
    double total =0;    //in order to get avg we will need a total. give 0 as the initial value. we can change if necessary
    double average;//if we want an average of the total
    Scanner input = new Scanner(System.in);   //we are going to ask the end user for input. creating object called input

        //our while loop will count how many times we are asking our end user to input a grade
        while(counter<=5){

            System.out.println("Please enter your "+counter+" numeric grade");//enter the concatenate counter to see each roll call
            //grammatics aside, it will give the info we need
            grades = input.nextInt();//this will assign an input to our grade or integer...number of grades
            total += grades;//gets tricky here with total everytime some adds there grade, it will add each other
            //whenever you get a red error underneath a variable and it says 'initialize variable total' it means you
            //you need to assign a value to the variable
            counter += 1;//we adding 1, adding 1, adding 1, adding 1, adding 1

        }//end of while loop - we will want to add two a new variables
        String message;
        char LetterGrade;

        counter -= 1;//we cannot add another counter so you need to do this - counter please take away one otherwise
                    //its counting 6 not five which means it will divide by 6 not 5. important to use -1 for the counter
                    //make sure to indent the counter -=1 to match up with the while, char, string, if and else statements
        average =total/counter;//to get the average we need total of grades / counter
        System.out.println("You have earned an average grade of "+average+" after providing us with " +counter+ " grades.");
        if (average>=90 && average < 100){
            LetterGrade = 'A';
            message = "Excellent work!";

        }else if (average>=80 && average < 90) {
            LetterGrade = 'B';
            message = "Solid work!";
        }else if (average>=70 && average < 80) {
            LetterGrade = 'C';
            message = "Study some more.";
        }else if (average>=65 && average < 70) {
            LetterGrade = 'D';
            message = "You are close to failing.";
        }else  {
            LetterGrade = 'F';
            message = "You did not pass.";

        }
        System.out.println("You have earned the following letter grade: " +LetterGrade+ ", and here is the message: " +message);



}

}
