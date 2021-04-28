package prepInsta;
import java.util.Scanner;

public class SumOfNumbersInStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				sum = sum + Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
