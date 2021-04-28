package prepInsta;

import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        
        int num1 = sc.nextInt();
        int sum1 = 0;
       
        System.out.print("Input number 2 : ");
        int num2 = sc.nextInt();
        int sum2 = 0;
       
        for(int i = 1 ; i < num1 ; i++)
		{
			if(num1 % i == 0) {
				sum1 = sum1 + i;
			}
		}
        
        for(int i = 1 ; i < num2 ; i++)
		{
			if(num2 % i == 0) {
				sum2 = sum2 + i;
			}
		}
        
        if(num1==sum2 && num2==sum1) {
        	System.out.println("Friendly Pair");
        }else {
        	System.out.println("Not a Friendly Pair");
        }
	}

}
