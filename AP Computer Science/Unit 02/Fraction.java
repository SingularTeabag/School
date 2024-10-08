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

    //returns 
    public double getValue() {
        return (double) num / denom;
    }

    public void addition(Fraction other) {
        int newDenom = this.getDenom() * other.getDenom();
        int newNum = this.getNum() * other.getDenom() + this.getDenom() * other.getNum();
        num = newNum;
        denom = newDenom;
    }

    public void addition(int other) {
        int newDenom = this.getDenom();
        int newNum = this.getNum()  + this.getDenom() * other;
        num = newNum;
        denom = newDenom;
    }

    public void subtraction(Fraction other) {
        int newDenom = this.getDenom() * other.getDenom();
        int newNum = this.getNum() * other.getDenom() - this.getDenom() * other.getNum();
        num = newNum;
        denom = newDenom;
    }

    public void subtraction(int other) {
        int newDenom = this.getDenom();
        int newNum = this.getNum() - this.getDenom() * other;
        num = newNum;
        denom = newDenom;
    }

    public void multiplacation(Fraction other) {
        int newDenom = this.getDenom() * other.getDenom();
        int newNum = this.getNum() * other.getNum();
        num = newNum;
        denom = newDenom;
    }

    public void multiplacation(int other) {
        int newNum = this.getNum() * other;
        num = newNum;
    }

    public void devision(Fraction other) {
        int newDenom = this.getDenom() * other.getNum();
        int newNum = this.getNum() * other.getDenom();
        num = newNum;
        denom = newDenom;
    }

    public void devision(int other) {
        int newDenom = this.getDenom() * other;
        denom = newDenom;
    }

    public String toString() {
        return "" + num + " / " + denom;
    }
}
