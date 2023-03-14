package Overloading;

public class methodOverloading {

    public class IntroToMethodOverloading {

        public int getAreaOfRectangle(int length, int width) {
            return length * width;
        }

        public int getAreaOfRectangle(long length, long width) {

        }

        public int getPerimeterOfSquare(int a) {
            return a * 4;

        }

        public int getPerimeterOfSquare(long b) {
            return (int) b * 4;

        }

        public int getPerimeterOfSquare(double c) {
            return (int) c * 4;

        }

    }
}