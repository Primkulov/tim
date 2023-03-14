package loops;

public class PracticeLoops {
    public static void main(String[] args) {
        for (int c =10; c>=1; c--){
            System.out.println("The value of x is: " + c);
        }
        for (int i =0; i<=10; i=i +2){
            System.out.println(i);
        }
        for (int b=10; b>=0; b=b-2){
            System.out.println("The value of b is :" + b);
        }
        for (int n =1; n<=15; n +=2){
            System.out.println("The value of n is :" +n);
        }
        //===============================
        int sum =0;
        for (int vv= 1; vv<=10; vv++){
            System.out.println("The value of vv is :" +vv);
            sum = sum + vv;//== 1+2+3+4
        }
        System.out.println("the result is :" + sum);
        //==============================================
       int xx =0;
        for (int mm =0; mm<=10; mm+=2){
            System.out.println("even number" + mm);
            xx = xx +mm;
        }
        System.out.println("the result is :" + xx);


    }


}
