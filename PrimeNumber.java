package prepInsta;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n % i == 0)				
				count++;
		}
		if(count == 2)
			System.out.println("PRIME");
		else
			System.out.println("NOT PRIME");
	}
}
