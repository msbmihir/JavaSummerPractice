package prepInsta;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[] = {10,6,18,29,30};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of all array elements is " + sum);
	}
}
