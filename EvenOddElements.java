package prepInsta;
import java.util.Scanner;

public class EvenOddElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int count_odd = 0;
		int count_even = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i]%2 == 0) {
				count_even++;
			}else {
				count_odd++;
			}
		}
		System.out.println("No. of Odd Elements are : " + count_odd);
		System.out.println("No of Even Elements are : " + count_even);
	}
}

//2020102792301