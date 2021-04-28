package prepInsta;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		int factorial;
		int sum = 0;
		int n = number; 
		
		while(n != 0) {
			
			factorial = 1;
			int last_dig = n % 10;
			
			for(int i=last_dig; i>=1; i--) {
				factorial = factorial * i;
				sum = sum + factorial;
				n = n / 10;
			}
		}
		if(sum == number) {
			System.out.println("STRONG NUMBER");
		}else {
			System.out.println("NOT STRONG");
		}
		sc.close();
	}
}
