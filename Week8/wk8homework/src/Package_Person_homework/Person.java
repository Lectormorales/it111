package Package_Person_homework;

public class Person {

    //no main method here and creating our fields(variables)  here.


    String name;
    String zipCode;//how we can convert a string into a number
    char gender;
    int age;
    int cityCode;
    //our individual violations as well as the main violation
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;
    double creditScore;
    double baseLineRate = 300;
    int vehicleYear;
    int getVehicleYearRate;
    int vehicleYearRate = getVehicleYearRate(vehicleYear);



    //we are creating a method named display so that we can print our inputs

    public void display() {
        System.out.println("This is what you have provided!");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println(vehicleYear);
        System.out.println("Your baseline rate: "+baseLineRate+" dollars");
        System.out.println("Your baseline rate is calculated without taking into consideration the following: Age, Gender, Credit Score, Violations, Vehicle Age and Residence.");
        System.out.println("Violations: "+violations);
        System.out.println("DUI Violations: "+violationDUI);
        System.out.println("Red Light Violations: "+violationRedLight);
        System.out.println("Speeding  Violations: "+violationSpeeding);
        System.out.println("Credit Score: "+creditScore);
        System.out.println("Your rate based on age of vehicle: "+getVehicleYearRate);


    }
    //create a method- Violation and credit score
    //violations or credit score
    public double getRate(double monthlyRate) {
        if (violations == true || creditScore <=700) {
            monthlyRate =500.00;
        }
        return monthlyRate;
    }



    //new method for age
    //fi you are young or younger, you will be payin more money
    public double ageCategory(double adjustedRate) {
        if (age <= 25 || age >= 65) {
            adjustedRate = 300.00;


        } else {
            adjustedRate = 0;
        }
        return adjustedRate;

    }
    //created a method where a rate is given based on the year of the vehicle
    public int getVehicleYearRate(int vehicleYear) {
        int getVehicleYearRate;
        if (vehicleYear > 5) {
            getVehicleYearRate = 0;
        } else {
            getVehicleYearRate = 65;
        }
        return getVehicleYearRate;
    }

    public int identifyRegion(int states) {
        //90-96 CA, 97-OR, 98-99 SEATTLE
        String zip2;
        zip2 = zipCode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);


        if(cityCode >=90 && cityCode <97) {
            System.out.println("You entered "+cityCode+ " and you are from California");
        }

        else if (cityCode>=97 && cityCode <98) {
            System.out.println("You entered " +cityCode+ " and you are from Oregon");




        }else if (cityCode>97 && cityCode <99) {
            System.out.println("You entered" +cityCode+ " and you are from Washington:");


        }else  {
            System.out.println("You are not from the PNW, please contact our National office.");
        }return states;

    }


    //creating a method to charge a surcharge to people who live in California, because there are so many cars, pollution, and other challenges that can count against a motor vehicle operator. we will be creating a if statement.

    public double californiaRegion(double surcharge){
        if(cityCode >=90 && cityCode <97) {
            surcharge =200.00;
        }else {
            surcharge =0;
        }return surcharge;


    }
}
