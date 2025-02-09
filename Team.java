import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in);
		String row;
		int numOfQuestionsDone=0;
		int numOfProblems = in.nextInt();
		in.nextLine();
		
		for ( int i = 0; i < numOfProblems; i++) {
			row = in.nextLine();
			if(check(row) >=2) {
				numOfQuestionsDone+=1;
			}
			
		}
		System.out.println(numOfQuestionsDone);

	}
	
	public static int check(String row) {
		String splitted[] = row.split("\\s+");
		int teamMembersCertainity = 0;
		for ( String num: splitted) {
			if(num.equals("1")) {
				teamMembersCertainity +=1;
			}
		}
		return teamMembersCertainity;
	}

}
