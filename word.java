import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(returnUpperOrLower(in.nextLine()));

	}
	public static String returnUpperOrLower(String word) {
		return decideUpperOrLower(word, numOfUpperAndLowerCase(word));
	
	}
	public static int[] numOfUpperAndLowerCase(String word) {
		char letters[] = word.toCharArray();
		int num[] = new int[2];
		int numOfLowerCase=0;
		int numOfUpperCase=0;
		
		for( char letter:letters) {
			if(Character.isLowerCase(letter)) {
				numOfLowerCase +=1;
				num[0] = numOfLowerCase;
			}else if(Character.isUpperCase(letter)) {
				numOfUpperCase +=1;
				num[1] = numOfUpperCase;
			}
		}
		return num;
	}
	
	public static String decideUpperOrLower(String word, int num[]) {
		
		if(num[0]>= num[1]) {
			return word.toLowerCase();
		}else {
			return word.toUpperCase();
		}
	
	}

}
