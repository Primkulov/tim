package Overloading;

public class ArithmeticOperations {

    public  int getSum2Int(int a, int b){
        return  a+b;

    }
    public int getSum3Int( int a, int b , int c){
        return a+b+ c;
    }
    public  int getAverage(int a, int b, int c , int v){
        return (a+ b + c+ v)/4;

    }
    public  int getAverage(int a, int b, int c, int n, int x , int z){
        return (a+ b + c +n + x + z )/6;
    }
    //========================================================
    public int getAreaOfTriangle( int base, int height){


        return (1/2*base *height);
    }
    public double getAreaOfTriangle(int a, int b , int c){
        int semiPerimeter = (a+b+c)/2;
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-a) * (semiPerimeter-b) * (semiPerimeter -c));
        return area;
    }
}
