import java.util.Scanner;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		HashSet<Character> characters = new HashSet<Character>();
		
		char [] chars = in.nextLine().toCharArray();
		
		for( char letter: chars) {
			
			characters.add(letter);
		}
		
		int numOfDistinctChars = characters.size();
		System.out.println(numOfDistinctChars%2 == 0? "CHAT WITH HER!":"IGNORE HIM!");
	}
}
