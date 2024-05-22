public class VariableScope {

    public static void main(String[] args) {

    //we are inside the main method
        String text = "This is the local variable in the MAIN method.";
        System.out.println(text);
        //In order for the sub method to run we need to call tha method in the MAIN method
        sub(); //enter the name of the sub method
    }

    public static void sub() {
        //we have created a sub method
        String text = "This is the local variable in the SUB method.";
        System.out.println(text);



    }
}
