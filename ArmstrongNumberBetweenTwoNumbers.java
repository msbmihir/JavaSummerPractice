package prepInsta;
import java.util.Scanner;

public class ArmstrongNumberBetweenTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Position: ");
		int start = sc.nextInt();
		System.out.println("Enter End Position: ");
		int end = sc.nextInt();
		int n,sum;
		
		for(int i=start; i<=end; i++) {
			n = i;
			sum = 0;
			while(n!=0) {
				int lD = n % 10;
				sum = sum + (lD*lD*lD);
				n = n/10;
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
