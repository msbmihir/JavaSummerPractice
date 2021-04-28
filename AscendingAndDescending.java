package prepInsta;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int a[] = {10,6,18,29,30,2,70};
		int n = a.length;
		int half = a.length/2;
		
		// ascending order
		for(int i=0; i<half; i++) {
			for(int j=i+1; j<half; j++) {
				if(a[i]>a[j]) {
					int temp  = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		// descending order
		for(int i=a.length/2; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]<a[j]) {
					int temp1  = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}
			}
		}
		// printing the array
		for(int i=0; i<n; i++) {
			System.out.print(" " + a[i] + " ");
			
		}
	}
}
