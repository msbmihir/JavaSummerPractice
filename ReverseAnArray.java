package prepInsta;

public class ReverseAnArray {

	public static void main(String[] args) {
		int a[] = {10,6,18,29,30};
		System.out.println("Reversed array is ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}
}
