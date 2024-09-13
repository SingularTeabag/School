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

        //Output \/
        /*
            Task 1:
            a. 17  
            b. -6  
            c. 1   
            d. 0   
            e. 3   
            f. 4.0 
            g. 0.25
            h. 9.0
            i. 7.5
            j. 6.0
            k. 2
            l. 5
            m. 0

            Task 3:
            a. 12
            b. 1
            c. 3
            d. 0
            e. 6
            f. 2.0
            g. 0.5
            h. 12.0
            i. 9.0
            j. 5.142857142857142
            k. 2
            l. 5
            m. 1
         */
    }
}
