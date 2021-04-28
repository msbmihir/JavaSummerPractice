package prepInsta;
import java.util.Scanner;

public class RemovingDuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int temp[] = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[n-1];
		j++;
	
		System.out.println("Duplicate elements are removed : ");
		for(int i=0; i<j; i++) {
			System.out.println(temp[i]);
		}
	}
}
