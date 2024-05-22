
package ShowWindow2.src;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class ShowWindow2 {

    public static void main(String[] args) {
        //declare our variables and we are going to make them constants
        //so that their values cannot change
        final int WINDOW_WIDTH =400;
        final int WINDOW_HEIGHT =500;

        //now to create a window
        JFrame window = new JFrame();
        //template to follow --Scanner input = new Scanner(System.in);
        JLabel Mylabel1, Mylabel2;
        JTextField Textfield1, Textfield2;

        //Creating the labels
        Mylabel1 = new JLabel("My First label");
        Mylabel2 = new JLabel("My Second label");

        //Creating the text fields
        Textfield1 = new JTextField(" ",20);
        Textfield2 = new JTextField(" ",20);

        //setting the boundaries for the fields
        Textfield1.setBounds(50,120,200,20);
        Textfield2.setBounds(50,220,200,20);

        Textfield1.setBackground(new Color(255, 255, 255));

        //setting the boundaries for the labels
        Mylabel1.setBounds(50,100,200,20);
        Mylabel2.setBounds(50,200,200,20);

        //Setting the different font sizes and styles
        Mylabel1.setFont(new Font("Sanserif", Font.PLAIN, 16));
        Mylabel2.setFont(new Font("Arial", Font.BOLD, 20));

        //Adding the labels to the window
        window.add(Mylabel1);
        window.add(Mylabel2);

        //Adding the text fields to the window
        window.add(Textfield1);
        window.add(Textfield2);

        String text1 = Textfield1.getText();
        String text2 = Textfield1.getText();


        //setting background color for window
        window.getContentPane().setBackground(Color.GREEN);
        //setting the location of the window to the center of the screen
        window.setLocation(500,300);
        window.setBounds(400,200, 400,600);

        //turns off the layout manager
        window.setLayout(null);

        //Setting the title of the window
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
