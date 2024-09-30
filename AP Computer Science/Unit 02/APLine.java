public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine() {
        a = 1;
        b = 1; 
        c = 0;
    }

    public APLine(int userA, int userB, int userC) {
        a = userA;
        b = userB;
        c = userC;
    }

    public double getSlope() {
        return (double)-a/b;
    }

    public boolean isOnLine(int userX, int userY) {
        return (a * userX + b * userY + c) == 0;
    }

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

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public double findY(int x) {
        double output = ()(a * x + c) / 
    }
}
