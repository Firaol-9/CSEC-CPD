import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in);
		String row ;
		String indexOf1="";
		
		for( int i =0; i < 5; i++) {
			row = in.nextLine();
			if( !getIndexOf1(row,i).equals("0") ) {
				indexOf1 = getIndexOf1(row, i + 1);
			}
		}
		System.out.println(calculateStep(indexOf1));
		
	}
	public static String getIndexOf1(String row, int columnNum) {
		String splitted[] = row.split("\\s+"); 
		for (int i =0; i < splitted.length; i++) {
			if(splitted[i].equals("1")) {
				return ""  +  (i + 1)+ columnNum;
			}
		}
		return "0";
	}
	public static int calculateStep(String indexOf1) {
		char letters[] = indexOf1.toCharArray();
		int rowNum = Integer.valueOf(letters[0])-'0';
		int columnNum = Integer.valueOf(letters[1]) - '0';
		int step = getPositive(rowNum-3) + getPositive(columnNum-3);
		
		return step;
	}
	public static int getPositive(int num) {
		if ( num < 0) {
			return -num;
		}else {
			return num;
		}
	}
}
