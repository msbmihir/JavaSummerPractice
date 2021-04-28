package prepInsta;

public class ArraysAreDisjointOrNot {

	static int disJoint(int a[], int b[]) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i]==a[j]) {
					return -1;
				}
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		
		int res = disJoint(a, b);
		
		if(res == -1)
			System.out.println("NOT DISJOINT");
		else
			System.out.println("DISJOINT");
	}
}
