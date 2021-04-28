package prepInsta;
import java.util.Scanner;

public class DistinctElement {
	
public static int count(int a[], int n) {
	for(int i=0; i<n; i++) {
		int count = 0;
		for(int j=0; j<n; j++) {
			if(a[j] == a[i]) {
				count++;
			}
		}
		if(count == 1) {
			return a[i];
		}else {
			return -1;
		}
}
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Total distinct numbers are : " + count(a, n));
	}
}
