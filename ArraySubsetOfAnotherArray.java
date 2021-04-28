package prepInsta;

public class ArraySubsetOfAnotherArray {
	
	static boolean subSet(int a[], int b[]) {
		
		int i=0; 
		int	j=0;
		
		for(i=0; i<b.length; i++) {
			for(j=0; j<a.length; j++) {
				if(b[i] == a[i]) {
					break;
				}
			}
			if(j == a.length) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3};
		
		if(subSet(a, b)) {
			System.out.println("Array 2 is subset of array 1.");
		}else {
			System.out.println("Array 2 is not a subset of array 1.");
		}
	}
}
