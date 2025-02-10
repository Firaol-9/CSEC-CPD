import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		int numOfStones = Integer.valueOf(in.nextLine());
		char stoneColors[] = in.nextLine().toCharArray();
		int numOfStoneRequired=0;
		
		for( int i = 1; i < stoneColors.length;i++) {
			if (stoneColors[i] == stoneColors[i-1]) {
				numOfStoneRequired +=1;
			}
		}
		System.out.println(numOfStoneRequired);
	}

}
