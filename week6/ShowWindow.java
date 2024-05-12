import javax.swing.*;

public class ShowWindow {

    public static void main(String[] args) {
    //declare our variables and we are going to make them constants
        //so that their values cannot change
        final int WINDOW_WIDTH =350;
        final int WINDOW_HEIGHT =250;

        //now to create a window
        JFrame window = new JFrame();
        //template to follow --Scanner input = new Scanner(System.in);

        //set the title of the window
        window.setTitle("My Simple Window");

        //setting the size of our window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        //we now want to close th window and exit the program
        //specifies what happens when the close button is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //let's display the window - if we do not display it won't display
        //we will display the window using a boolean display
        window.setVisible(true);






    }
}
