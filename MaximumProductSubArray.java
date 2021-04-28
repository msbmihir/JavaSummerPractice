package prepInsta;

public class MaximumProductSubArray {
	
	static int maxSubarrayProduct(int a[]) {
		int result = a[0];
		int n = a.length;
		for(int i=0; i<n; i++) {
			int mul = a[i];
			for(int j=i+1; j<n; j++) {
				result = Math.max(result, mul); //result variable is used store the linked multiplication value in the end it checks if current mul value is greater or result value is greater & hence we find MAXPRODUCT SUBARRAY 
				mul = mul * a[j];
			}
			result = Math.max(result, mul);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int a[] = { 1, -2, -3, 0, 7, -8, -2 };
		System.out.println("Max Product Subarray is : ");
		System.out.println(maxSubarrayProduct(a));

	}
}
