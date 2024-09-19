import java.util.Scanner;

public class GospersFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number for n: ");
        int n = input.nextInt();
        System.out.println("Gosper's " + n + "! = " + formula(n));
    }
    
    public static int formula(int n) {
        return (int)((Math.pow((double)n / Math.E, n) * Math.sqrt((2 * n + 1.0/3) * Math.PI)) + 0.5);
    }

    /*
    Enter a number for n: 9
    Gosper's 9! = 362851
    */
}
