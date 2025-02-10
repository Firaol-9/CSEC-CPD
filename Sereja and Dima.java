import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList< Integer> listOfCards = new ArrayList< Integer>();
		int numOfCards = Integer.valueOf(in.nextLine());
		String numStr[] = in.nextLine().split("\\s+");
		int sereja=0, dima=0;
		
		for(int i =0; i < numStr.length; i++) {
			listOfCards.add(Integer.valueOf(numStr[i]));
		}
		
		for (int i=0; i <numOfCards; i++) {
			
			if (i%2 == 0) {
				sereja += pickTheLargestSide(listOfCards);
			}else {
				dima += pickTheLargestSide(listOfCards);
			}
		}
		System.out.print(sereja);
		System.out.print(" ");
		System.out.print(dima);
		
		in.close();

	}
	
	public static int pickTheLargestSide( ArrayList <Integer> map) {
		int lastIndex =  map.get(map.size()-1);
		int firstIndex = map.get(0);
		
		if( firstIndex > lastIndex) {
			map.remove(0);
			return firstIndex;
		}else {
			map.remove(map.size()-1);
			return lastIndex;
		}
	}

}
