package prepInsta;
import java.util.Scanner;

public class NonRepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Non-Repeating elements are : ");
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=0; j<n; j++) {
				if(a[i]==a[j] & i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}
	}
}
