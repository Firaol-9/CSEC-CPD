import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        scanner.close();

        int position = 0; 

        for (char instruction : t.toCharArray()) {
            if (position < s.length() && s.charAt(position) == instruction) {
                position++;
            }
        }


        System.out.println(position + 1);
    }
}
