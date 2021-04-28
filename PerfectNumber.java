package prepInsta;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				sum = sum + i;
			}
		}
		if(sum == number) {
			System.out.println("PERFECT NUMBER");
		}else {
			System.out.println("NOT A PERFECT NUMBER");
		}
	}

}
