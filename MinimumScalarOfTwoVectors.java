package prepInsta;

import java.util.Scanner;

public class MinimumScalarOfTwoVectors {
	
public static int scalerVector(int a[], int b[], int n) {
	int sum = 0;
	for(int i=0;i<n;i++)

    {

        sum=sum+a[i]*b[i];

    }  

    return sum;  
}
	
public static void sort(int a[], int b[], int n) {
	int temp = 0;
	// Sorting array 1 in ascending order
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;		
			}
		}
	}
	// Sorting array 2 in descending order
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(a[i] < a[j]) {
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			}
		}
	}
}

	public static void main(String[] args) {
		// array 1 i/p
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array 1 elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		// array 2 i/p
		
		int b[] = new int[n];
		
		System.out.println("Enter the array 2 elements : ");
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		sort(a, b, n);
		System.out.println("The Minimum Scalar Vector of two array is " + scalerVector(a, b, n));
	}

}
