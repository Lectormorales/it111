import java.util.Scanner;

public class TryCatchInt {

    public static void main(String[] args) {
        System.out.println("Please enter an integer.");
        try {
            int i;//integer datatype with name variable 'i'
            Scanner input =new Scanner(System.in);
            i = input.nextInt();//when someone inputs their integer it is going to be assigned i.
            System.out.println("Your integer is: "+ i);

        }catch(Exception e) {

//if there are problems with the code it will render in the catch block.
            System.out.println("We have an error: "+e);

        }

    }
}

