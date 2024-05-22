public class VariableScopeGlobal {

    final static String text = "This is a GLOBAL variable of the VariableScopeGlobal class";

    public static void main(String[] args) {

String text = "This is the LOCAL variable in the main method!";
    //Let us print out the global variable and take a look at how you are calling it.
        System.out.println(text);
        System.out.println(VariableScopeGlobal.text);

        sub();
    }

    public static void sub (){
        String text ="This is our LOCAL variable inside our sub method";
        System.out.println(text);
    }
}
