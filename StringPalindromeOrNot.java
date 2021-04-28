package prepInsta;
import java.util.Scanner;

public class StringPalindromeOrNot {

	public static String rev(String s) {
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--) 
			rev = rev + s.charAt(i);
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		String s1 = s;
		
		if(s1.equals(rev(s))) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Pallindrome String");
		}
	}
}
