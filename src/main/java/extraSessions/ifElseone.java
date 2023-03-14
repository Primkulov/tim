package extraSessions;

public class ifElseone {
    public static void main(String[] args) {
        String word = "coding";

        if (word.length() > 5){

            System.out.println("the word contains more than 5 letter");
        }else {
            System.out.println("inside else");
        }

        //================
        String name = "Arlington Heights";
        /*
        if name contains more than 10 chars , print "hello"
        if name contains less 3 chars , print "bye bye "
        if name starts with "A", print "how are you"
        if name ends with "n", print "good"
         */
        if (name.length() > 10) {
            System.out.println("Hello");

        } if (name.length() < 3) {
            System.out.println("bye bye");

        }  if (name.startsWith("A")) {
            System.out.println("how are you");

        }  if (name.endsWith("n")) {
            System.out.println("good");

        } else {
            System.out.println();
        }
        //===========================================
        int a = 10;
        int b = 5;
        if ((a+b)> 20){
            System.out.println("more than 20");

        }if ((a-b) <3){
            System.out.println("less than 3");

        }if ((a*b) ==50){
            System.out.println("equal to 50");

        }if ((a/b) ==2){
            System.out.println("two");

        }else {
            System.out.println();
        }




    }
}
