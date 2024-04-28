public class Myforloop2 {

    public static void main(String[] args) {


//        int count;
//            for (count = 0; count <=30; count = count+3) {
//
//                System.out.println(count);
//            }
//        System.out.println("all done!");
//        int NewCount;
//        for(NewCount = 40; NewCount> 0; NewCount = NewCount-2) {
//    //NewCount has to start at 40, be greater than 0 and the new iteration will decrease by 2
//            System.out.println(NewCount);
//        } //end of loop
//        System.out.println("Blast Off!!");

//        int NewCount;
//        for(NewCount = 30; NewCount> 0; NewCount = NewCount-5) {
//            //NewCount has to start at 30, be greater than 0 and the new iteration will decrease by 5
//            System.out.println(NewCount);
//        } //end of loop
//        System.out.println("Blast Off!!");

        int NewCount; //adding an if/else statement inside a for loop
        for(NewCount = 30; NewCount> 0; NewCount = NewCount-5) {
            //NewCount has to start at 30, be greater than 0 and the new iteration will decrease by 5
           if (NewCount <= 10){
               System.out.println("We are alomost at Blast off! Only "+NewCount+" seconds away!!");
           }else {
               System.out.println(NewCount);

           }
        } //end of loop
        System.out.println("Blast Off!!");















    }

}
