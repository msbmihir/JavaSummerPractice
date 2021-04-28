package prepInsta;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("POSITIVE");
		}else if(n==0) {
			System.out.println("Niether POSITIVE nor NEGATIVE");
		}else {
			System.out.println("NEGATIVE");
		}
		sc.close();
	}
}
