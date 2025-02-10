import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int numOfMagnets = in.nextInt();
		in.nextLine();
		String magnets[] = new String[numOfMagnets];
		int groups = 1;
		
		for (int i=0; i< numOfMagnets; i++ ) {
			magnets[i] = in.nextLine();
		}
		
		for ( int i =1; i<magnets.length; i++) {
			if (!magnets[i-1].equals(magnets[i])) {
				groups +=1;
			}
		}
		System.out.println(groups);

	}

}
