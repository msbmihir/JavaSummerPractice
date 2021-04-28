package prepInsta;
import java.util.Scanner;

public class DIstinctEl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int b[] = new int[n];
		int count = 0; 
		b[0] = a[0];
		count = 1;
		System.out.println("Distint Elements are : ");
		for(int i=1; i<n; i++) {
			//check if it exists in B
			int flag = 0;
			for(int j=0; j<count; j++) {
				if(a[i] == a[j]) {
					// it exists
					flag = 1;
					break;
				}
			}
			//if not, add to B
			if(flag != 1) {
				b[count] = a[i];
				count++;
			}
		}
		for(int i=0; i<count; i++) {
			System.out.println(b[i]);
		}
	}
}
