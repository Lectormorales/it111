import javax.swing.*;
public class Showwind2 {

    public static void main(String[] args) {
        //declare our variables and we are going to make them constants
        //so that their values cannot change
//        final int WINDOW_WIDTH = 800;
//        final int WINDOW_HEIGHT = 600;

        final int TWO_WNDW_WIDTH = 200;
        final int TWO_WNDW_HEIGHT = 100;

//        //now to create a window
//        JFrame window = new JFrame();
//        //template to follow --Scanner input = new Scanner(System.in);
//
//        //set the title of the window
//        window.setTitle("My 1st Window");
//
//
//        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//
//
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //let's display the window - if we do not display it won't display
//        //we will display the window using a boolean display
//        window.setVisible(true);
        //now to create a window
        JFrame windowtwo = new JFrame();
        //set the title of the window
        windowtwo.setTitle("My second window");
        //setting the size of our window
        windowtwo.setSize(TWO_WNDW_WIDTH,TWO_WNDW_HEIGHT);
        //we now want to close th window and exit the program
        windowtwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        windowtwo.setVisible(true);




    }


}



