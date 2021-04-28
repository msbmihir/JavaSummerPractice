package prepInsta;
import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = s.replaceAll("[aeiou]", "");
		System.out.println("String after removal of string is : " + s1);
	}
}
