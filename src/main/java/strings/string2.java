package strings;

public class string2 {
    public static void main(String []  args){

        String city = "London";
        System.out.println(city);

        String city2 = new String( ("new York"));
        System.out.println(city2);
        //=================

        System.out.println(city.length());// 6
        System.out.println(city2.length());//8

        //============
        String name = "Antananrivu";
        System.out.println("The length of Antanarivu is:" + name.length());

        //===============
        String school = "codewise";
        school =  "codewise academy";
        System.out.println(school);
        /*
        equals () method compares values of 2 strings
         */
        String fruits1 = "apple";
        String fruits2 = "apple";
        String fruits3 = "Apple";
        boolean isSame = fruits1.equals(fruits2);
        System.out.println(isSame);

        isSame = fruits1.equals(fruits3);
        System.out.println(isSame);// false

        fruits1 = "banana";
        fruits2 ="orange";
        System.out.println("Is banana same orange?" + fruits1.equals(fruits2)); // false

        boolean isSame2 = !fruits1.equals(fruits2);// not equals, TRUE   !- its showing

        int cucumber = 5;
        int tomato = 10;
        int empty = cucumber;//5 here we are changing value vice versa!!!!!
        cucumber =tomato; //10
        tomato = empty; //5

        System.out.println("cucumber: " + cucumber);// cucumber:10
        System.out.println("tomato: " + tomato);// tomato 5


        String state1 = "California";
        String state2 = "Illinis";
        String state3 = "Florida";
        String state4 = "Illinois";
        String state5 = "florida";

        boolean Ha = (!state1.equals(state2));
        System.out.println(Ha);
        boolean Ma = state2.equalsIgnoreCase(state4);
        System.out.println(Ma);
        boolean da = state3.equals(state5);
        System.out.println(da);
        boolean fa = state5.equals(state1);
        System.out.println(fa);
        boolean ga = !state4.equals(state3);
        System.out.println(ga);


    }
    }
