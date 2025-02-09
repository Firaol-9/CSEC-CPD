import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int numOfColumns = in.nextInt();
		int cubes[] = new int [numOfColumns];
		
		for ( int i = 0; i < numOfColumns; i++) {
			cubes[i] = in.nextInt();
		}
		Arrays.sort(cubes);
		
		for ( int i = 0; i < cubes.length; i++) {
			System.out.print(cubes[i] + ( i < cubes.length -1 ? " ":"") );
		}
	}

}
