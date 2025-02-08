import java.util.HashMap;
import java.util.Scanner;

public class AntoAndDanik {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float numOfGames = in.nextInt();
		in.nextLine();
		String games = in.nextLine();
		HashMap<String, Integer> lettersAppearance = getLetterCount(games);
		
		for ( String Key: lettersAppearance.keySet()) {
			if ( lettersAppearance.get(Key) > numOfGames/2.0) {
				if(Key.equals("A")) {
					System.out.println("Anton");
				}else if ( Key.equals("D")) {
					System.out.println("Danik");
				}
				
			} else if (lettersAppearance.get(Key) == numOfGames/2.0) {
				System.out.println("Friendship");
				break;
			}
		}
		
		
	}
	
	public static HashMap<String, Integer> getLetterCount(String word){
		HashMap<String, Integer> letterAppearance = new HashMap<String, Integer>();
		
		for( char letter: word.toCharArray()) {
			String strLetter =String.valueOf(letter);
			if ( !letterAppearance.containsKey(strLetter)) {
				letterAppearance.put(strLetter, 1);
			}else {
				int appearance = letterAppearance.get(strLetter);
				
				letterAppearance.replace(strLetter, appearance += 1);
			}
		}
		return letterAppearance;
	}
}
