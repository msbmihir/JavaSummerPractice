package prepInsta;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a the base value: ");
		int x = sc.nextInt();
		System.out.println("Enter the exponential value: ");
		int y = sc.nextInt();
		int result = 1;
		
		for(int i=1; i<=y; i++) {
			result = result * x;
		}
		System.out.println(result);
	}
}
