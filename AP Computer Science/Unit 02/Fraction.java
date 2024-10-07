public class Fraction {
    private int num;
    private int denom;

    //no args constructor
    public Fraction() {
        num = 0;
        denom = 1;
    }

    //one args constructor, only numerator
    public Fraction(int numerator) {
        num = numerator;
        denom = 1;
    }

    //two args constructor, full fraction
    public Fraction(int numerator, int denominator) {
        num = numerator;
        denom = denominator;
    }

    //returns numerator
    public int getNum() {
        return num;
    }

    //returns 
    public int getDenom() {
        return denom;
    }

    public double getValue() {
        return (double) num / denom;
    }

    public void addition(Fraction other) {

    }

    public void addition(int other) {
        
    }

    public void subtraction(Fraction other) {
        
    }

    public void subtraction(int other) {
        
    }

    public void multiplacation(Fraction other) {

    }

    public void multiplacation(int other) {
        
    }

    public String toString() {
        return "" + num + " / " + denom;
    }
}
