import java.util.Scanner;

public class MyInput2 {
public static void main(String [] args) {

    String name;
    String message;

    int age;
    double salary;


    Scanner MyObj= new Scanner(System.in);

    System.out.println("enter your first name, please");
    name = MyObj.next();

    System.out.println(name+", please enter your age!");
    age = MyObj.nextInt();

    System.out.println(name+" , last, but not least, you annual salary!");
    salary = MyObj.nextDouble();

    System.out.println("First name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Salary: "+salary);


    if (salary< 50000){
       message = "I need another job or roommate.";

    }else if (salary >=50000 && salary<60000) {
        message = "Not bad but its not gonna be easy in Seattle.";

    }else if (salary >=60000 && salary<70000) {
        message = "This salary is ok.";

    }else if (salary >=70000 && salary<80000) {
        message = "This salary is almost livable in Seattle.";

    }else {
        message = "I am truly middle class.";

        System.out.println("message: "+message);
    }
}



}





