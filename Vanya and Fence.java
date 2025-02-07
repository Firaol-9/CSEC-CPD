import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String line1, heightOfStudents;
		String numAndHeight[], heights[];
		int numOfStudent, heightOfFence, heightOfRow = 0;
		
		Scanner in = new Scanner(System.in);
		
		line1 = in.nextLine();
		heightOfStudents = in.nextLine();
		heights = heightOfStudents.split("\\s+");
		
		numAndHeight= line1.split("\\s+");
		
		numOfStudent = Integer.valueOf(numAndHeight[0]);
		heightOfFence = Integer.valueOf(numAndHeight[1]);
		
		for( String height: heights) {
			int h = Integer.valueOf(height);
			
			if ( h > heightOfFence) {
				heightOfRow += 2;
			}else {
				
				heightOfRow +=1;
			}
		}
		System.out.println(heightOfRow);
		in.close();
	}

}
