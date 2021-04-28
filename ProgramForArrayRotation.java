package prepInsta;

public class ProgramForArrayRotation {

	void leftRotate(int a[], int d, int n) {
		for(int i=0; i<d; i++) {
			leftRotateByOne(a, n);
		}
	}
	
	void leftRotateByOne(int a[], int n) {
		int temp,i;
		temp = a[0];
		for(i=0; i<n-1; i++) {
			a[i] = a[i+1];
			a[n-1] = temp;
		}
	}
	
	void printArray(int a[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(" " + a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		ProgramForArrayRotation rotate = new ProgramForArrayRotation();
		rotate.leftRotate(a, 2, 7);
		rotate.printArray(a, 7);
		
	}
}
