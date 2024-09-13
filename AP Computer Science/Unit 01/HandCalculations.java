public class HandCalculations {
    public static void main(String[] args) {
        double w, y, s;
        int a, b, c;

        w = 12.0;
        y = 3.5;
        a = 3;
        b = 2;
        c = 7;

        System.out.println("\nTask 1:");
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
        
        a *= 2;
        c /= 2;
        
        System.out.println("\nTask 3:");

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
