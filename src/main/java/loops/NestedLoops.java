package loops;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        Nested loop - loop inside loop
         */
        for (int x = 1; x <= 15; x++) {
            for (int y = 1; y <= 15; y++) {
                System.out.print((x * y) + "\t");

            }
            System.out.println();
            //=================================================
        }
        for (int age =1 ; age <100; age++){
            System.out.println("Baby is " + age +  "years old ");

        }
        //===============================================
        for (int c = 10; c<=16; c++){
            System.out.println("java is Fun");
        }




    }


}
