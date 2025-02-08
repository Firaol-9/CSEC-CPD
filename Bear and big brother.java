import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int bob, brother, year=0;
		String weights[];
		Scanner in = new Scanner( System.in);
		
		
		String str = in.nextLine();
		weights = str.split("\\s+");
		bob = Integer.valueOf(weights[0]);
		brother = Integer.valueOf(weights[1]);
		
		while ( true) {
			
			if (bob > brother) {
				break;
			}
			bob = 3*bob;
			brother = 2*brother;
			year +=1;
		}
		System.out.println(year);
		

	}

}
