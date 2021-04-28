package prepInsta;
import java.util.HashMap;
import java.util.Scanner;

public class SymmetricElements {
	
static void symmetric_pairs(int arr[][]) {
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	for(int i=0; i<arr.length; i++) {
		int first = arr[i][0];
		int second = arr[i][1];
		
		Integer val = map.get(second);
		
		if (val != null && val == first)
            System.out.print("(" + second + ", " + first + ")" + " ");
		else
			map.put(first, second);
		
	}
}

	public static void main(String[] args) {
		
		int arr[][] = new int[5][2];
		arr[0][0] = 1; arr[0][1] = 2;
	    arr[1][0] = 3; arr[1][1] = 4;
	    arr[2][0] = 5; arr[2][1] = 6;
	    arr[3][0] = 2; arr[3][1] = 1;
	    arr[4][0] = 4; arr[4][1] = 3;
	    
	    System.out.println("Symmetric Elements are : ");
	    symmetric_pairs(arr);
	}
}
