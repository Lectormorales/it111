import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class MyTimesDates {
    public static void main(String[] args) {

    //keep it simple - display the current date
        LocalDate CurrentDate = LocalDate.now();
        LocalTime CurrentTime = LocalTime.now();

        System.out.println("The current date is "+CurrentDate);
        System.out.println("The current time is "+CurrentTime);

     //I would like to see the month, date and year.

        Month CurrentMonth = LocalDate.now().getMonth();
        System.out.println("The current month is "+CurrentMonth);

        DayOfWeek CurrentDay = LocalDate.now().getDayOfWeek();
        System.out.println("Today is "+CurrentDay);
    //the year would have to be an integer or int.  We would have to declare
        //the datatype.

        int CurrentYear = LocalDate.now().getYear();
        System.out.println("The current year is "+CurrentYear+" A.D.");

    //we would like to know the number of the day
    //if we want to display the 8th of the month
        int CurrentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println("The current day of the month is "+CurrentDayNumber);

        System.out.println("Today is "+CurrentDay+", "+CurrentMonth+" "+CurrentDayNumber+"th, "+CurrentYear+" A.D. The time is "+CurrentTime);

    }

}
