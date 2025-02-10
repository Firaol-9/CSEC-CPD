import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = new String[2];
		Scanner in = new Scanner (System.in);
		
		String firstString = in.nextLine().toLowerCase();
		String secondString = in.nextLine().toLowerCase();;
		words[0] = firstString;
		words[1] = secondString;
		
		Arrays.sort(words);
		
		int indexOf1stString = Arrays.asList(words).indexOf(firstString);
		int indexOf2ndString = Arrays.asList(words).indexOf(secondString);
		if ( indexOf1stString < indexOf2ndString) {
			System.out.println("-1");
		}else if(indexOf1stString > indexOf2ndString) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		in.close();
	}
	
}
