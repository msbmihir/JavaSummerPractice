package prepInsta;
import java.util.Scanner;

public class SumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int l = sc.nextInt();
		System.out.println("Enter Number 2:");
		int r = sc.nextInt();
		int sum = 0;
		for(int i=l; i<=r; i++) {
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
