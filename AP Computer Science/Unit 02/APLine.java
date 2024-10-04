public class APLine {
    //declare object variables
    private int a;
    private int b;
    private int c;

    //no args constructor
    public APLine() {
        a = 1;
        b = 1; 
        c = 0;
    }

    //APLine constructor
    public APLine(int userA, int userB, int userC) {
        a = userA;
        b = userB;
        c = userC;
    }

    //returns the slope of the line
    public double getSlope() {
        return (double)-a/b;
    }

    //returns true or false if the point is on the line
    public boolean isOnLine(int userX, int userY) {
        return (a * userX + b * userY + c) == 0;
    }

    //turns the variables of the object into an equation
    public String toString() {
        String output = a + "x " ;
        if (b < 0) {
            output += "- " + Math.abs(b) + "y ";
        }
        else 
            output += "+ " + b + "y ";

        if (c < 0) {
            output += "- " + Math.abs(c) + " = 0";
        }
        else 
            output += "+ " + c + " = 0";
        return output;
    }

    //returns variable "a"
    public int getA() {
        return a;
    }

    //returns variable "b"
    public int getB() {
        return b;
    }

    //returns variable "c"
    public int getC() {
        return c;
    }
    
    //returns the y value given the x value of the equation
    public double findY(int x) {
        double output = (int)(a * x + c) / (-1 * b);
        return output;
    }
}