import java.util.*;
public class U2Project {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Type in the number: ");
		int num = key.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		do {
			array.add(num%10);
			num = num/10;
		} while(num > 0 ) ;
		
		insertionSort(array);
		
		for (int i = 0; i < array.size(); i++)   { 
			System.out.print(array.get(i) + " ");
		}
	}
	 public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
	        for (int i = 0; i < arr.size(); i++) {
	        	int temp;
	        	for (int x = i; x < arr.size(); x ++) {
	        		if (arr.get(i) > arr.get(x)) {
	        			temp = arr.get(x);
	        			arr.set(x, arr.get(i));
	        			arr.set(i, temp);
	        		}
	        	}
	        }
	        return arr;
	    }
}
