package package_person;

public class Person {

    //This file does not have a main method.
    //We will start typing fields or variables.

    String name;
    char gender;
    int age;
    String car;
    boolean violations;
    double creditScore;

    //we are going to create a public method here
    public void display() {

        System.out.println("Customer Name: "+name);
        System.out.println("Customer Gender: "+gender);
        System.out.println("Customer Age: "+age);
        System.out.println("Customer's Car Make and Model: "+car);
        System.out.println("Customer has traffic violations: "+violations);
        System.out.println("Customer has a Credit Score of: "+creditScore);
    }


    //working with our logic- using violations and credit score

    public double getQuote(double monthlyQuote) {

        if (violations == true && creditScore <= 700){
            monthlyQuote = 500;

        } else{
            monthlyQuote = 100;

        }
        return monthlyQuote;

    }
    public double assumeGender(double adjustedRate) {
        if (gender == 'M' && age <=25){
            adjustedRate =100;
        }else {
            adjustedRate =0;
        }
        return adjustedRate;
    }


}



