package strings;

public class StringSubstring {
    public static void main(String[] args) {
        String message = "Hello Chicago, why are cold and windy";

        String city = message.substring(6, 13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);
        //===================================
        String phrase = "Just one positive thought in the morning can change your whole day";
        /*
        1 using substring method, print ====> Just a thout
        2 using substring method , print ====> positive morning
        3 using substring                ====>whole morning
                                         ====> change one day
                                         =====> change your day


           */
        System.out.println(phrase.substring(0, 4) + " a " + phrase.substring(18, 25));
        System.out.println(phrase.substring(9, 17) + phrase.substring(32, 39));
        System.out.println(phrase.substring(57, 63) + phrase.substring(32, 39));
        System.out.println(phrase.substring(44, 50) + phrase.substring(4, 7) + phrase.substring(52, 57));


        // NOT FINISHED
        String str1 = "hi";
        String str2 = "bye";
        /*
        hibyehibye
         */
        System.out.println(str1 + str2 + str1 + str2);
        //vhi bye HI HI BYE BYE bye hi
        System.out.println(str1+ " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " " + str2.toUpperCase() + "  " + str2 + " " + str1);
        //print ===>bi
        System.out.println(str2.substring(0,1)+ str2.substring(1));
        System.out.println(str1.replace('h', 'b'));
        System.out.println(str2.charAt(0) +"" + str1.charAt(1));
        //==============================================
        /*
        print ===> sear
        1 substring
        2replace
        3 charAt and substring
         */
        String see = " see";
        String hear = "hear";
        System.out.println();




    }


}
