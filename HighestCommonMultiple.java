package prepInsta;
import java.util.Scanner;

public class HighestCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input a number 1 : ");
        int num1 = sc.nextInt();
        
        System.out.print("Input a number 2 : ");
        int num2 = sc.nextInt();
        
        int n = 1;
        
        if(num1 != num2) {
        	while(n!=0) {
        		n = num1 % num2;
        		if(n!=0) {
        			num1 = num2;
        			num2 = n;
        		}
        	}
        	System.out.println("HCF is " + num2);
        } 
        else {
        	System.out.println("Wrong I/p");
        }
        sc.close();
	}
}
