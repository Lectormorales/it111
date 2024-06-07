package package_person;

public class personDetails {
    //This file will hae a main method
    public static void main(String[] args) {

    //this where we create our objects
    //lets create a variable for first person
    Person firstPerson;

    //lets create a variable of second person
    Person secondPerson;

    //I am in the process of creating an object
        // from my person class
    firstPerson = new Person();//first object
    secondPerson = new Person();//second object

        //we will be entering info, but assigning values
        //to our fields(variables).

        //first person details from person.java file
        firstPerson.name ="Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car ="Volkswagen Bug";
        firstPerson.violations =false;
        firstPerson.creditScore = 690;
        //second person details from person.java file
        secondPerson.name ="Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = "Ford Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;
        double monthlyQuote = 0;
        double adjustedRate =0;


        firstPerson.display();
        System.out.println("Here is the preliminary quote for " +firstPerson.name+": $"+firstPerson.getQuote(monthlyQuote)+" dollars.");
        System.out.println("Adjustments: "+firstPerson.assumeGender(adjustedRate)+" dollars");
        System.out.print("Here is your total monthly premium: ");
        System.out.println();
        System.out.println(firstPerson.assumeGender(adjustedRate)+firstPerson.getQuote(monthlyQuote));

        secondPerson.display();
        System.out.println("Here is the preliminary quote for " +secondPerson.name+": $"+secondPerson.getQuote(monthlyQuote)+" dollars.");
        System.out.println("Adjustments: "+secondPerson.assumeGender(adjustedRate)+" dollars");
        System.out.println(secondPerson.assumeGender(adjustedRate)+secondPerson.getQuote(monthlyQuote));
        //last video 1:47/16:48


    }
}
