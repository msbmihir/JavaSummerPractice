package prepInsta;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int a[] = {10,23,12,7,78,98,1,3};
		int n = a.length;
		int f[] = new int[n];
		int visited = -1;
		
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(a[i]==a[j]) {
					count++;
					f[j] = visited;
				}
			}
			if(f[i]!=visited) {
				f[i] = count;
			}
		}
		
        System.out.println(" E | F ");  

		for(int i=0; i<f.length; i++) {
			if(f[i]!=visited) {
				System.out.println(" " + a[i]   + " = " + f[i]);
			}
		}
	}
}
