import java.util.Scanner;
public class WhileLoopIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter i: ");
        int i = input.nextInt();
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("... Blast Off!");

        System.out.print("Enter j: ");
        int j = input.nextInt();
        int k = 1;
        while (k <= j) {
            System.out.println(k);
            k++;
        }


        int m = 5;
        int n = 22;
       
        int sum = 0;
       
        while(m <= n)
        {
            sum = sum + m;
            m = m + 3;
        }
       
        System.out.println(m + "\t" + sum);
    }
}