import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.close();

        int maxRoll = Math.max(Y, W);
        int favorableOutcomes = 6 - maxRoll + 1; 
        int gcd = gcd(favorableOutcomes, 6);

        int numerator = favorableOutcomes / gcd;
        int denominator = 6 / gcd;

        System.out.println(numerator + "/" + denominator);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
