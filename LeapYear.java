package prepInsta;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int y = sc.nextInt();
		
		if(y % 4 == 0 && y % 100 != 0 || y % 100 == 0)
			System.out.println("LEAP YEAR");
		else
			System.out.println("NOT A LEAP YEAR");
		sc.close();
	}
}
