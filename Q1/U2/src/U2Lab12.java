/*import java.util.Scanner;

public class U2Lab12 {
	public static void main(String[] args) {
		int[] array1 = new int[1000];
	    for (int i = 1; i < array1.length; i++){
	        array1[i- 1] = i;
	    }
	    Scanner key = new Scanner(System.in);
	    System.out.println("What is your target number (between 1 - 1000): ");
	    int target = key.nextInt();
	    
	    System.out.println("The number was found: " binsearch(array1, target, 0, array.length) + "")
	}
	
	public int binsearch(int[] arr, int target, int start, int end) {
		int mid = (start+end)/2;
    		if (arr[mid] == target) {
    			return arr[mid];
    		} else if(arr[mid] > target) {
    			 binsearch(arr, target, start, arr[mid]);
    		} else if (arr[mid] < target) {
    			binsearch(arr, target, arr[mid], end);
    		}	
    	return -1;
	}
}*/
