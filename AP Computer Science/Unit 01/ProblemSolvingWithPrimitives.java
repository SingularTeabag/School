public class ProblemSolvingWithPrimitives {
    public static void main(String[] args) {
        

        //Question 7: What is the output from the following statements?
        System.out.println ("Question 7");
        System.out.println ("(a) " + 5 / 10); // = 0
        System.out.println ("(b) " + 1 / 2 * 10); // = 0
        System.out.println ("(c) " + 1.0 / 2 * 10); // = 5.0
        System.out.println ("(d) " + 1 / 2.0 * 10); // = 5.0
        System.out.println ("(e) " + 13 % 5 + "\n"); // = 3


        //Question 8: Assuming
        System.out.println ("Question 8");
        double rate = 1.058;
        int balance0 = 100, balance = (int)(balance0 * rate);
        //What is the value of balance = 1058
        System.out.print ("(a) Balance is equal to " + balance + "\n(b) gasMileage is equal to ");
        int miles = 98, gallons = 5;
        double gasMileage = miles / gallons;
        //What is the value of gasMileage = 19.0
        System.out.println (gasMileage + "\n");


        //Question 9: Remove as many parentheses as possible from the following statement without changeing the result:
        int count = 1, total = 1, pages = 1, words = 1;
        count += (((total/pages) - 5) * words - 1);
        //can remove the innermost and outermost parentheses
        count += (total/pages - 5) * words - 1;
 
        //Question 10: Find and fix a bug in the following statements:
        /*
         * final double g =16.0;
         * double t = 35.5;
         * System.out.print ("The travel distance is ");
         * System.out.println (1 / 2 * (g * t * t));
         *                     ^^^^^ - Logical error
         * typecast 1 or 2 into a double
         */
        final double g =16.0;
        double t = 35.5;
        System.out.print ("Question 10\nThe travel distance is ");
        System.out.println ((double)1 / 2 * (g * t * t));

        /*Question 11: If 'double x' has a negative value. Write an expression that rounds 'x' to the
                       nearest integer. (There is no unique rule on how to round numbers that are in
                       the middle between two integers, such as -0.5, -1.5, -2.5, and so on. In this
                       exercise round these numbers down to -1, -2, -3, and so on.) */
        double x = -0.5;
        x = (int)(x - 0.5);
        
        /*Question 12: Fill in the blanks in a short class 'FeetToInches' with one static method
                       'toInches' and 'main'. 'main' prompts the user to enter her height in feet
                       and inches, calls 'toInches', and displays the returned height in inches. */
        System.out.println("\nQuestion 12");
        //import java.util.Scanner;
        //public class FeetToInches {
        //public static void main (String[] args) {
        //Scanner userInput = new Scanner(System.in);
        System.out.print("How many feet are in your height? ");
        int userFt = 5;
        System.err.println("5"); //replacing 'int userFt = userInput.nextLine();' to streamline the outputs, here we are assuming the user has 5 feet in their height
        System.out.print("How many inches are in your height? ");
        int userIn = 6;
        System.err.println("6"); //replacing 'int userIn = userInput.nextLine();' to streamline the outputs, here we are assuming the user is 5 inches in their height
        //toInches(userFt, userIn);
        //}
        //public static void toInches(int userFt, int userIn) {
        System.out.println("You are " + (userFt * 12 + userIn) + " inches tall!\n");
        //}
        //}
        
        /*Question 13: Given*/ int a, b, c; /*Write Java expressions that calculate the roots of the equation
                       ax^2 + bx + c = 0 (assuming that the two real roots exist) and assign them to
                       two 'double' variables 'x1' and 'x2'. Use a temporary variable to hold 
                       sqrt(b^2 - 4ac) in order not to compute it twice. */
        a = 1;
        b = -5;
        c = 6;
        double d, x1, x2;
        d = Math.sqrt(b * b - (4 * a * c));
        x1 = (-1 * b + d)/(2 * a);
        x2 = (-1 * b - d)/(2 * a);
        System.out.println("Question 13\nGiven " + a + "x^2 + " + b + "x + " + c +" the real root will be " + x1 + " and " + x2 + "");

        /*Question 14: Find a syntax error in the following code fragment: 
                       double a, b; 
                       int temp;

                       System.out.print("Enter two real numbers: ");

                       //swap the numbers
                       temp = a;
                       a = b;
                       b = temp;
                       //Change the 'double a, b;' into 'int a, b;' or change the 'int temp;' into 'double temp' the second option is the best*/

        /*Question 15: Write an expression that, given a positive integer 'n', computres a new integer 
                       in which the units and tens digits have swapped places. For example, if 
                       'n = 123', the result should be 132; if 'n = 3', the tens digit is zero and the result
                       should be 30.*/
        int n = 123;
        System.out.print("\nQuestion 15\nInput a number: 123\nThe changed number will be: "); //in this senario I would use 'int userNum = userInput.nextLine();'
        System.out.println(n/100*100+n%10*10+n/10%10);
    }
}