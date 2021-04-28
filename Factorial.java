package prepInsta;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int factorial = 1;
		if(n>=0) {
			for(int i=n; i>=1; i--) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + n + " is " + factorial);
		}
		else {
			System.out.println("Invalid Number");
		}
	}
}
