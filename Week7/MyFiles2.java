
import java.io.File;

import static java.lang.System.out;//we created a shortcut

public class MyFiles2 {

    public static void main(String[] args){

//        out.println();//we created a short for the SOUT
        File dir = new File("NewFolder");
        //lets start with an if else statement
        if (dir.exists()) {
            //we will be ecstatic
            //tis is where the array will be called out
            String[] files = dir.list();//now gonna take the list inside the directory
            //and assigning it to the string array
            //will be using a new keyword named assert
            assert files != null;// means that the files are not empty

            out.println(files.length + " files found!");
            //we would like to see those files
            //we will look at those files with a for loop
            for (int i = 0;i < files.length; i++) {
                out.println(files[i]);

                     //we will need to pull out the datatype using 'I"
            }
        }else {
            //We ain't happy
            out.println("Directory does not exist!");
        }












    }

}
