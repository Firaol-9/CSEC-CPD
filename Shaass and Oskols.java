import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] birds = new int[n];

        for (int i = 0; i < n; i++) {
            birds[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x--;

            if (x > 0) {
                birds[x - 1] += y - 1; 
            }

            if (x < n - 1) {
                birds[x + 1] += birds[x] - y;
            }

            birds[x] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(birds[i]);
        }

        scanner.close();
    }
}
