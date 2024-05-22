import java.io.File;

public class MyFile {

    public static void main(String[] args) {
    //create a file object
//        File dir = new File("testfolder");//couldn't find folder
        File dir = new File("NewFolder");//changed file name

        //create an if statement if the directory exists.
        //else not a good
        if (dir.exists()) {
            System.out.println("Yes the directory exists!");
        }else {
            System.out.println("Darn don't know where its at");
        }//we have a directory inside our week7 folder

























    }
}
