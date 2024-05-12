import javax.swing.*;

public class KiloConverter extends JFrame {
    //lets add information
    //add fields
    JPanel panel;//a panel goes on your JFrame
    JLabel messagelabel;

    JTextField kilotextfield;

    JButton CalcButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 250;
    //ALWAYS BE AWARE OF THE COLOR THAT INTELLIJ IS USING
    //Create a constructor which is a special method to initialize our object

    public KiloConverter() {

        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);




    }
    public void buildPanel() {

        messagelabel = new JLabel("Enter the distance in Kilometers");//1
        //text, button
        kilotextfield = new JTextField(10);//2

        CalcButton = new JButton("calculate");//3

        panel = new JPanel();

        //now let's add three components onto the Jpanel as written below

        panel.add(messagelabel);//1
        panel.add(kilotextfield);//2
        panel.add(CalcButton);//3


    }//lets add our main method
    public static void main(String[] args) {
        new KiloConverter();

    }



}
