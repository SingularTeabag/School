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
}
