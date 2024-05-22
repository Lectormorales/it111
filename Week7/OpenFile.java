import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) {

        File file;//variable name is file
        Scanner InputFile; //scanner with input as the variable name
        String FileName;//string whose name is FileName
        FileName = JOptionPane.showInputDialog("Enter "+" the name of the file.");
        //remember that the showinput is being assigned to the FileName
        //this will attempt to open the file
        try {

            file =new File(FileName);//created object with the file name of FileName
            InputFile = new Scanner(file);//its not a system.in in the () but we are
            //actually referencing the file
            JOptionPane.showMessageDialog(null, "The file was found!  Displayed in TRY.");





        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The file was not found. Displayed in CATCH.");



        }JOptionPane.showMessageDialog(null, "Program has finished running - done - displayed after the catch");
















    }













}
