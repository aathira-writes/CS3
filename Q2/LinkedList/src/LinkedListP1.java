
public class LinkedListP1 {
	public static void main(String[] args) {
		ListNode list = new ListNode(3, 
				new ListNode(1, 
						new ListNode(4, 
								new ListNode(1, 
										new ListNode(5, null)))));
		Comparable z = 1;
		Comparable t = 9;
		
		printAllNodes(list);
		System.out.println();
		sumOfAllNodes(list);
		System.out.println();
		list = addToFront(list, t);
		printAllNodes(list);
	}
	
	public static void printAllNodes(ListNode list) {
		while(list != null) {
			System.out.print(list.getValue() + " ");
			list = list.getNext();
		}
	}
	
	public static void sumOfAllNodes(ListNode list) {
		int addemup = 0;
		while(list!= null) {
			addemup += (int)list.getValue();
			list = list.getNext();
		}
		System.out.print(addemup);
	}
	
	public static int nodeCount(ListNode list) {
		int count = 0;
		while(list!= null) {
			count++;
			list = list.getNext();
		}
		return count;
	}
	
	public static void printEveryOther(ListNode list) {
		while( list != null) {
			System.out.print(list.getValue() + " ");
			if(list.getNext() == null) {
				break;
			} else {
				list = list.getNext().getNext();
			}
		}	
	}
	
	public static ListNode addToFront(ListNode z, Comparable value) {
		ListNode list = new ListNode (value, z);
		return list;
	}
}
