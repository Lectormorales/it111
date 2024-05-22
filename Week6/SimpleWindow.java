import javax.swing.*;
import java.util.Set;

public class SimpleWindow extends JFrame {
    //no main  method in the file.
    //will need a constructor.
    //a cosntructor is a special method that displays our attributes
    public SimpleWindow() {

        //creating constants
        final int WINDOW_WIDTH =400;
        final int WINDOW_HEIGHT =400;

        setTitle("My Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//we want to close operation

        //display it
        setVisible(true);

    }


}
