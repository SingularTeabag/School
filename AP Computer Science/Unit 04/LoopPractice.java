import java.util.Scanner;
public class LoopPractice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double sum;
        double approx = (Math.PI * Math.PI)/6.0;
        int n;
        int count;


        System.out.print("\ninput n: ");
        n = input.nextInt();
        count = 1;
        sum = 0;
        while(count < n) {
            sum += 1.0 / (count * count);
            count ++;
        }

        System.out.println("the sum is " + sum + " and pi^2/6 is " + approx + "\nThat is a " + (approx - sum) + " difference ");
    }
}