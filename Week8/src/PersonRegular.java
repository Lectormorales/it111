public class PersonRegular {
public static void main(String[] args) {


    //lets create our variables
    String FirstPersonName = "Cathy";
    String SecondPersonName ="Kendall";
    //gender identity
    char firstPersonGender ='F';
    char secondPersonGender ='M';
    //int for age (number)
    int ageFirstPerson = 33;
    int ageSecondPerson = 22;
    //string for vehicle variables
    String firstPersonCar = "Volkswagen Bug";
    String SecondPersonCar = "Mustang";
    //boolean setup for true or false statements
    boolean firstPersonViolation = false;
    boolean secondPersonViolation = true;
    int firstPersonCreditScore = 690;
    int secondPersonCreditScore = 670;

    //also known as the preliminary rate before adjustments
    double monthlyrate1;
    double monthlyrate2;

    double adjustedRate1;
    double adjustedRate2;





    //logic statements for car insurance and the industry
    //traffic tickets, DUIs, other violations you gonna pay a lot for car insurance
    //poor credit will also pay
    //will gender and age amke a difference?


    if (ageFirstPerson <=25 && firstPersonGender =='F'){
        adjustedRate1 = 100;

    }else { adjustedRate1 = 0;

    }


    if(ageSecondPerson <=25 && secondPersonGender =='M') {
        adjustedRate2 =100;


    }else { adjustedRate2 =0;

    }


    if(firstPersonViolation == true && firstPersonCreditScore <=700) {
        monthlyrate1 =500;


    }else {monthlyrate1 = 100;

    }



    if (secondPersonViolation==true && secondPersonCreditScore<=700){
        monthlyrate2=500;
    }else {monthlyrate2=100;

    }

    double total1 = monthlyrate1+adjustedRate1;
    double total2 = monthlyrate2+adjustedRate2;



    System.out.println("First Name: "+FirstPersonName);
    System.out.println("First Person Gender: "+firstPersonGender);
    System.out.println("Age of First Person: "+ageFirstPerson);
    System.out.println("First Person Car: "+firstPersonCar);
    System.out.println("First Person Violation: "+firstPersonViolation);
    System.out.println("First Person Credit Score: "+firstPersonCreditScore);
    System.out.println("First person preliminary rate: "+monthlyrate1);
    System.out.println("Final Monthly Rate for first Person (including gender and age): "+total1);
    System.out.println();
    System.out.println();
    //second person information
    System.out.println("Second Name: "+SecondPersonName);
    System.out.println("Second Person Gender: "+secondPersonGender);
    System.out.println("Age of Second Person: "+ageSecondPerson);
    System.out.println("Second Person Car: "+SecondPersonCar);
    System.out.println("Second Person Violation: "+secondPersonViolation);
    System.out.println("Second Person Credit Score: "+secondPersonCreditScore);
    System.out.println("Second person preliminary rate: "+monthlyrate2);
    System.out.println("Final Monthly Rate for second Person (including gender and age): "+total2);




}

}
