import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        in.nextLine();


        String s = in.nextLine();

        int[] calories = {0, a1, a2, a3, a4};

        int totalCalories = 0;
        for (char ch : s.toCharArray()) {
            totalCalories += calories[ch - '0'];
        }

        System.out.println(totalCalories);

        in.close();
    }
}
