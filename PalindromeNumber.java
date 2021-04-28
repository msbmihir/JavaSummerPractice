package prepInsta;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(n!=0) {
			int LD = n % 10;
			rev = rev * 10 + LD;
			n = n / 10;
		}
		if(rev == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
