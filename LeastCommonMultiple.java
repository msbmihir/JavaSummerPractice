package prepInsta;
import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input a number 1 : ");
        int num1 = sc.nextInt();
        
        System.out.print("Input a number 2 : ");
        int num2 = sc.nextInt();
        
        int a = (num1 > num2) ? num1 : num2;
        int i;
        for(i=a; i<num1*num2; i++) {
        	if(i % num1 == 0 && i % num2 == 0) {
        		break;
        	}
        }
        System.out.println("LCM is " + i);
        sc.close();
	}
}
