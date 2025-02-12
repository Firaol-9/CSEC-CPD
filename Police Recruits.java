import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfEvents = in.nextInt();
        int availablePolice = 0, untreatedCrimes = 0;

        for (int i = 0; i < numOfEvents; i++) {
            int event = in.nextInt();
            
            if (event > 0) {
                availablePolice += event;
            } else {
                if (availablePolice > 0) {
                    availablePolice--;
                } else {
                    untreatedCrimes++;
                }
            }
        }

        System.out.println(untreatedCrimes);
        in.close();
    }
}
