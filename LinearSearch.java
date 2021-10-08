
public class LinearSearch {
	/* returns the index of target
	 *  returns -1 if not found
	 */
	public static int find(int[] arr,int target) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==target)
				return i;
		
		return -1;
		
	}
	
	/* returns true if target is found
	 *  returns false if not found
	 */
	public static boolean contains(int[] arr,int target) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==target)
				return true;
		
		return false;
		
	}
	/* Search for a char in a string
	 * returns the index of target
	 *  returns -1 if not found
	 */
	
	public static int find(String str,char target) {
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==target)
				return i;
		return -1;
	}
	/* returns true if target is found
	 *  returns false if not found
	 */
	
	public static boolean contains(String str,char target) {
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==target)
				return true;
		return false;
	}
	/* Search 2d array
	 * returns the index of target in an int array [row,col]
	 *  returns [-1,-1] if not found
	 */
	
	public static int[] find(int[][] arr, int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target)
					return new int[] {row,col};
					
			}
		}
		
		return new int[] {-1,-1};
	}
}


/*
 * Assignment
 * 
 * Find max element
 * Find Min element
 * Count a character in a string  -  count(str,'r')
 * Count the 4 digit elements in an array   - {123,7845,124,78452,1429}
 * 
 * 
 */

