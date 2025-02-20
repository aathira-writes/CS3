import java.util.*;

public class U2Lab13 {
	
	public static int inscompnum = 0;
	public static int seleccompnum = 0;
	
	 public static long insstart = 0;
	 public static long insend = 0;
	 public static long selecstart = 0;
	 public static long selecend = 0;
   
    public static void main (String[] args) {
        //basic array (already sorted)
        int[] array1 = new int[250];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        print(array1);
        //arrays in reverse order
        int[] array2 = new int[250];
        for (int i = 1; i < array2.length; i++){
            array2[i- 1] = array2.length - i;
        }
        print(array2);
        //array with duplicate numbers
        int[] array3 = new int[250];
        int num = 0;
        for (int i = 1; i < array3.length; i++){
        	if (i == array3.length/2) {
        		num = 0;
        	}
            array3[i- 1] = num;
            num++;
        }
        print(array3);
        //random number array
        int[] array4 = new int[250];
        for (int i = 0; i < array4.length; i++){
            array4[i] = (int)(Math.random() * 100);
        }
        print(array4);
        System.out.println();
        
        
        
        //RUNNING INSERTION SORT
        System.out.println("Insertion Sort:");
        insertionSort(array4);
        print(array4);
        System.out.println("Insertion Sort took " + inscompnum + " comparisons");
        System.out.println("Insertion Sort took " + (insend - insstart) + " nanoseconds");
        System.out.println();
        //RUNNING SELECTION SORT
        System.out.println("Selection Sort:");
        selectionSort(array4);
        print(array4);
        System.out.println("Selection Sort took " + seleccompnum + " comparisons");
        System.out.println("Insertion Sort took " + (selecend - selecstart) + " nanoseconds");
        System.out.println();
        /*
        System.out.println("Binary search required " + binarySearch(array1, target ) + " checks");
        System.out.println("Binary Search took " + (binend - binstart) + " nanoseconds");
        System.out.println(); */
        
    }
    
    public static int[] insertionSort(int[] arr) {
    	insstart = System.nanoTime();
        
        for (int i = 0; i < arr.length; i++) {
        	int temp;
        	for (int x = i; x < arr.length; x ++) {
        		if (arr[i] > arr[x]) {
        			temp = arr[x];
        			arr[x] = arr[i];
        			arr[i] = temp;
        		}
        		inscompnum ++;
        	}
        }
        insend = System.nanoTime();
        return arr;
    }
    
    public static int[] selectionSort(int[] arr) {
    	selecstart = System.nanoTime();
    	int min = arr[0];
    	int temp = 0;
    	for (int i = 1; i < arr.length; i++) {
    		if (arr[i] < min) {
    			temp = min;
    			min = arr[i];
    			arr[i] = temp;
    		}
    		min = arr[0 + i];
    		seleccompnum ++;
    	}
    	selecend = System.nanoTime();
    	return arr;
    } 
    
    public static void print(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
      
    }
}
