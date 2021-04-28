package prepInsta;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        
        while(n!=0) {
        	int last_digit = n % 10;
        	sum = sum + last_digit;
        	n = n / 10;
        }
        if(num % sum == 0) {
        	System.out.println(num + " is a HARSHAD number.");
        }else {
        	System.out.println(num + " is a not a HARSHAD number.");
        }
        sc.close();
	}
}
