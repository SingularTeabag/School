import java.util.Scanner;

public class Question21 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter height (inches): "); 
        int height = input.nextInt();
        
        System.out.print("Enter weight (lbs): ");
        int weight = input.nextInt();
        
        double bmi = calculateBMI(height, weight);
        System.out.println("BMI: " + bmi);
    }
    
    public static double calculateBMI(int height, int weight)
    {
        return weight * 0.454 / Math.pow(height * 0.0254,2);
    }
}