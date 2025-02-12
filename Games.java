import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] uniforms = new int[n][2];

        for (int i = 0; i < n; i++) {
            uniforms[i][0] = scanner.nextInt();
            uniforms[i][1] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && uniforms[i][0] == uniforms[j][1]) {
                    count++;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
