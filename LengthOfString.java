package prepInsta;
import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {

		int length = 0;
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(char c: s.toCharArray()) {
			length++;
		}
		System.out.println("Length of String is : " + length);
	}
}
