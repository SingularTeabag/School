public class BinomialExpansion {
    public static void main(String[] args) {
        BiExpansion(3, 2, 16);
    }

    public static int factorial(int input) {
        int output = input;
        int num = input;
        if (input == 0) {
            return 1;
        }
        else {
            for (int n = 1; n < input; n++) {
                num -= 1;
                output *= num;
                }
        }
        return output;
    }

    public static void BiExpansion(int firstTerm, int secondTerm, int power) {
        int sigma = power;
        int i = 0;
        sigma = factorial(power);
        System.out.println("(" + firstTerm + "x" + " + " + secondTerm + ")" + "^" + power + "\n" + sigma);
        
        
    }
}