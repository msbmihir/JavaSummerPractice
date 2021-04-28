package prepInsta;
import java.util.Scanner;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int a[] = {10,6,18,29,30};
		
		for(int i=0; i<a.length; i++) {
			for(int j=1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[0]);
			break;
		}
	}

}
