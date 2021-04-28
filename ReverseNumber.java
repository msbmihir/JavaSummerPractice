package prepInsta;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n = sc.nextInt();
		int rev = 0;
		
		while(n!=0) {
			int last_Dig = n % 10;
			rev = rev * 10 + last_Dig;
			n = n/10;
		}
		System.out.println(rev);
		sc.close();
	}
}
