import java.util.*;

public class U2Lab11 {

    public static long linstart = 0;
    public static long linend = 0;
    public static long binstart = 0;
    public static long binend = 0;
    
    public static void main (String[] args) {
        
        int[] array1 = new int[10000];
        for (int i = 1; i < array1.length; i++){
            array1[i- 1] = i;
        }
        Scanner key = new Scanner(System.in);
        System.out.println("What is your target number (between 1 - 1000): ");
        int target = key.nextInt();
        System.out.println("This required " + linearSearch(array1, target) + " checks using Linear Search");
        System.out.println("Linear Search took " + (linend - linstart) + " nanoseconds");
        System.out.println();
        System.out.println("Binary search required " + binarySearch(array1, target ) + " checks");
        System.out.println("Binary Search took " + (binend - binstart) + " nanoseconds");
        System.out.println();
        
    }
    
    public static int linearSearch(int[] arr, int target) {
        linstart = System.nanoTime();
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            times++;
            if (arr[i] == target) {
                linend = System.nanoTime();
                return times;
            }
        }
        linend = System.nanoTime();
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
    	binstart = System.nanoTime();
    	int start = 0;
    	int end = arr.length;
    	int mid = 0;
    	int times = 0;
    	for (int i = start; i < end ; i++) {
    		times++;
    		mid = (start + end)/2;
    		if (arr[mid] == target) {
    			binend = System.nanoTime();
    			return times;
    		} else if(arr[mid] > target) {
    			end = mid;
    		} else if (arr[mid] < target) {
    			start = mid;
    		}	
    	}
    	binend = System.nanoTime();
    	return -1;
    }
}
