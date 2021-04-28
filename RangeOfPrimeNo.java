package prepInsta;
import java.util.Scanner;

public class RangeOfPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		for(int i=x; i<y; i++) {
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}	
				if(count == 2) {
					System.out.println(i);
				}
			}
		}
	}
}

