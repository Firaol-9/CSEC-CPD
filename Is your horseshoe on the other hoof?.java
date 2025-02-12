import java.util.HashSet;
import java.util.Scanner;

public class HorseshoesOnOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            colors.add(scanner.nextInt());
        }

        int uniqueColors = colors.size();
        int horseshoesToBuy = 4 - uniqueColors;

        System.out.println(horseshoesToBuy);
        scanner.close();
    }
}
