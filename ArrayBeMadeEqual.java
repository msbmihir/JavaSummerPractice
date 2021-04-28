package prepInsta;

public class ArrayBeMadeEqual {

	public static boolean equal(int a[]) {
		for(int i=0; i<a.length; i++) {
			while(a[i]%2==0) {
				a[i] = a[i]/2;
			}
			while(a[i]%3==0) {
				a[i] = a[i]/3;
			}
			if (a[i] != a[0])
            {
                return false;
            }
		}
		return true;
	}
	
	public static void main(String[] args) {
		int a[] = {50, 75, 100};
		 if(equal(a)) {
			System.out.println("YES"); 
		 }else {
			 System.out.println("NO");
		 }
	}
}
