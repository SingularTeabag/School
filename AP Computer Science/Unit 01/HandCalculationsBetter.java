public class HandCalculationsBetter {

    static double w = 12.0, y = 3.5, s;
    static int a = 3, b = 2, c = 7;

    public static void main(String[] args) {
        System.out.println("\nTask 1:");
        printCalc();
        a *= 2;
        c /= 2;
        System.out.println("\nTask 3:");
        printCalc();
        printMy("Hi");
    }

    public static void printMy(String input) {
        System.out.println(input);
    }

    public static void printCalc() {
        System.out.println("a. " + a + " + " + b + " / " + c + " = " + (a + b * c));
        System.out.println("b. " + a + " - " + b + " - " + c + " = " + (a - b - c));
        System.out.println("c. " + a + " / " + b + " = " + (a / b));
        System.out.println("d. " + b + " / " + a + " = " + (b / a));
        System.out.println("e. " + a + " - " + b + " / " + c + " = " + (a - b / c));
        System.out.println("f. " + w + " / " + a + " = " + (w / a));
        System.out.println("g. " + a + " / " + w + " = " + (a / w));
        System.out.println("h. " + a + " + " + w + " / " + b + " = " + (a + w / b));
        System.out.println("i. " + "(" + a + " + " + b + ") / " + b + " = " + ((a + w) / b));
        System.out.println("j. " + c + " / " + y + " * " + a + " = " + (c / y * a));
        System.out.println("k. " + b + " % " + a + " = " + (b % a));
        System.out.println("l. " + b + " % " + a + " + 3 = " +(b % a + 3));
        System.out.println("m. " + "(" + a + " + 3) % " + b + " = " + ((a + 3) % b));
    }
}
