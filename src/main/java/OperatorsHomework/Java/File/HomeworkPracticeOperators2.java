package OperatorsHomework.Java.File;

public class HomeworkPracticeOperators2 {
    public static void main(String [] args ){

        int num1 = 100;  //1)
        int num2 = 200;
        int num3;
        num3 = num1 + num2;
        System.out.println( num1 + num2); //300
        System.out.println(num3);
         //===============================================

        int n1 = 5;  //2)
        int n2 = 9;
        int n3 = 10;
        System.out.println(n1 + n2 + n3);
         //==========================================
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 8;
        int f = 7;
        int j = 10;

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(c + " - " + a + " = " + (c-a));
        System.out.println(b + " * " + b + " = " + (b*b));
        System.out.println(d + " / " + b + " = " + (d/b));
        System.out.println(b + " + " + e + " = " + (b+e));
        System.out.println(j + " % " + f + " = " + (j%f));
        //================================================

        int length = 9;
        int width = 15;
        int area = length * width;
        System.out.println(area);
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
        //=====================================================


        int a1 = 8;
        int b2 = 2345;
        int c3 = 3;
        int d4 = (a1 +b2)/c3;
        System.out.println(d4);

        System.out.println((a1 + " + " + b2) + " / " + c3 + " = " + d4 );
        int e5 = 5;
        System.out.println(d4 + " % " + e5 + " = " +( d4  %  e5));
        //========================================================

        byte z = 23;
        byte x = 45;
        System.out.println(z < x); //true
        System.out.println(z > x);  //false
        System.out.println(z <= x); // true
        System.out.println(z >= x); // false
        System.out.println(z != x); //true
        //=====================================

        byte n = - 10;
        byte m = 10;
        System.out.println(n < m);
        System.out.println(n > m);
        System.out.println(n <= m);
        System.out.println(n >= m);
        System.out.println(n != m);
        //=======================================
















    }
}
