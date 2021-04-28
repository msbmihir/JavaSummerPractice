package prepInsta;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int digit = sc.nextInt();
		int sum = 0;
		
		while(digit!=0) {
			int last_digit = digit % 10;
			sum = sum + last_digit;
			digit = digit/10;
		}	
		System.out.println("Sum of Digits is: " + sum);
		sc.close();
	}
}
