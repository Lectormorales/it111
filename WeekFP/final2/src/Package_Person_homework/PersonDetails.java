package Package_Person_homework;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {
        //we will create our object - customer
        Person customer;
        customer = new Person();
        //need to enter additional variables
        int states = 0;

        System.out.println("Please enter your NAME.");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();


        System.out.println("Please enter your AGE.");
        customer.age = input.nextInt();


        System.out.println("Please enter your GENDER by entering F, M, or N.");
        customer.gender = input.next().charAt(0);


        System.out.println("Please enter your 5 character ZIP CODE .");
        customer.zipCode = input.next();

        System.out.println("Do you have any traffic violation? please enter true for yes and false for no.");
        customer.violations = input.nextBoolean();




        if (customer.violations) {

            System.out.println("Please type true if you had a DUI or false if not");
            customer.violationDUI = input.nextBoolean();


            System.out.println("Please type true if you had a red light violation or false, if not.");
            customer.violationRedLight = input.nextBoolean();


            System.out.println("Please type true if you have received a speeding ticket or false if not.");
            customer.violationSpeeding = input.nextBoolean();




        }else {
            System.out.println("No violations recorded");
        }

        System.out.println("Please type your credit score.");
        customer.creditScore = input.nextDouble();

        System.out.println("Please indicate how old your car is by years");
        customer.vehicleYear = input.nextInt();


        customer.display();
        //let's Identify the region ...


        System.out.println(customer.identifyRegion(states));
        double surcharge = 0;
        System.out.println("Your California surcharge is "+customer.californiaRegion(surcharge));


        double adjustedRate = 0;
        System.out.println("Age Category Adjustments " +customer.ageCategory(adjustedRate));


        double monthlyRate = 0;
        System.out.println("Violation and credit score adjustments " +customer.getRate(monthlyRate));

        double getVehicleYearRate = customer.getVehicleYearRate(customer.vehicleYear);
        System.out.println("Your rate charge for age of vehicle is: " + getVehicleYearRate);

        System.out.print("Your new monthly rate is: ");
        System.out.println(customer.baseLineRate
                +customer.ageCategory(adjustedRate)
                +customer.californiaRegion(surcharge)
                +customer.getRate(monthlyRate)+ customer.getVehicleYearRate(customer.getVehicleYearRate));

    }




    }
