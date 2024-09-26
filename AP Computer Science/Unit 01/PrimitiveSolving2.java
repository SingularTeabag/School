import java.util.Scanner;

public class PrimitiveSolving2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Question 16: An integer constant 'dayOfWeek1' has a value from 0 to 6 and represents the 
                       day of the week for January 1st (0=Sunday, 1=Monday, etc.). A variable
                       'day' has a value from 1 to 31 and represents a day in January. Write an 
                       expression that calculates the day of the week for any given value of 'day'.
                       For example, if 'dayOfWeek1 = 0'(January 1st is a Sunday) and 'day = 13'.
                       (January 13th), then 'dayOfWeek', the day of the week for January 13th,
                       should get a value of 5 (Friday).*/
        int dayOfWeek1 = 14;
        int dayOfWeek;
        int day = 1;

        System.out.println((dayOfWeek1 / 7) - 1); 


        /*Question 18: Rewrite the Gas Mileage to prompt the user to enter the gas mileage and the 
                       number of miles and display the amount of gas spent in that trip.*/

        System.out.print("What is the gas mileage of the vehicule? ");
        int milage = input.nextInt();
        System.out.print("How many miles did you drive? ");
        int miles = input.nextInt();


        /*Question 19: Write a short class 'LunchTime' with no fields, no constructors, and just one 
                       static method 'minutesUntilLunch'. The method should take two 'int' 
                       parameters, current hours and minutes (before 1 p.m.). and return (not print!)
                       the number of minutes left until lunch, scheduled for 1 p.m. Add a 'main'
                       method that prompts the user for the current time (in the format hh:mm),
                       calls'minutesUntilLaunch', and prints the value returned by the call. Make
                       sure your program displays the correct result when the user enters 9:00,
                       10:10, 12:00, 12:50.*/
        //lunchtime


        
        /*Question 20: 'curHour' and 'curMin' represent the current time, and 'depHour', 'debMin'
                       represent the departure time of a bus. Suppose all these variables are
                       initialized with some values; both times are between 1 p.m. and 11 p.m. of
                       the same day. Fill in the blanks in the following statements that display the 
                       remaining waiting time in hours and minutes: */
        int depHour = 2, depMin = 12;
        int totalMin = depHour * 12 + depMin;

        /*Question 21: The BMI program computes a person's body mass index (BMI). BMI is
                       defined as the weight, expressed in kilograms, devided by the square of the 
                       height expressed in meters. (one inch is 0.0254 meters)*/
                       //Already solved
        /*Question 22: */
        int nJars = 13;
        int nCartons = (nJars + 11) / 12;
        

        /*Question 23:
        */
        /*Question 24:
        */
        /*Question 25:
        */

        //Question 26 (extra) calculate volume of a ball
        int r = 3; // radius in inches
        double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.println(volume);

    }
}