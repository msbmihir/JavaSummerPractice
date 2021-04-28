package prepInsta;
import java.util.Scanner;

public class LongestPalindrome {
	
	public static boolean isPalindrome(int n) {
		int remainder,number,reverse=0;
        number=n;
         //while loop for find the reverse of the number
        while(n!=0)
        {
             remainder=n%10;
             reverse=reverse*10+remainder;
             n=n/10;
        }
         //check whether number is palindrome or not
        if(number==reverse)
               return true;
        else
              return false;
	}
	
	public static int longest(int []a, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					int temp;
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = n - 1; i >= 0; --i) 
        { 
             if (isPalindrome(a[i])) 
               return  a[i]; 
        }
        return -1; 
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int larger=longest(a, n);
        if(larger==-1)
             System.out.println(  "There is no palindrome number in the array"); 
        else
             System.out.println(  "longest palindrome number in the array" + longest(a, larger));
        
	}
}
