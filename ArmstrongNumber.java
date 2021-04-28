package prepInsta;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit: ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		
		while(n!=0) {
			int LD = n % 10;
			rev = rev + (LD * LD * LD);
			n = n / 10;
		}
		if(rev == temp) {
			System.out.println("ARMSTRONG NUMBER");
		}else {
			System.out.println("NOT ARMSTRONG");
		}
	}
}
