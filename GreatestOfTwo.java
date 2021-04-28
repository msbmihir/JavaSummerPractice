package prepInsta;
import java.util.Scanner;

public class GreatestOfTwo {
	
	public static String greatest(int x, int y) {
		if(x>y)
			return x + " is greater";
		else if(y>x)
			return y + " is greater";
		else
			return "Both are same";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int x = sc.nextInt();
		System.out.println("Enter Number 2:");
		int y = sc.nextInt();
		
		System.out.println(greatest(x,y));
	}
}

