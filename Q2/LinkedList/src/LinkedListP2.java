
public class LinkedListP2 {
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
		System.out.println(nodeCount(list));
		System.out.println(searchValue(list, z));
		doubleFirst(list);
		printAllNodes(list);
		System.out.println();
		doubleLast(list);
		printAllNodes(list);
		System.out.println();
		list = deleteFirst(list);
		printAllNodes(list);
	}
	
	public static void printAllNodes(ListNode list) {
		while(list != null) {
			System.out.print(list.getValue() + " ");
			list = list.getNext();
		}
	}
	
	public static int nodeCount(ListNode list) {
		int count = 0;
		while(list!= null) {
			count++;
			list = list.getNext();
		}
		return count;
	}
	public static boolean searchValue(ListNode list, Comparable value) {
		boolean found = false;
		while( list != null) {
			if((list.getValue()).compareTo(value) == 0) {
				found = true;
				return found;
			}
			list = list.getNext();
		}
		
		return found;
	}
	
	public static void doubleFirst(ListNode list) {
		ListNode list1 = new ListNode(list.getValue(), list.getNext());
		list.setNext(list1);
	} 
	
	public static void doubleLast(ListNode list) {
		while(list.getNext() != null) {
			list = list.getNext();
		}
		ListNode list1 = new ListNode(list.getValue(), null);
		list.setNext(list1);
		
	}
	
	public static ListNode deleteFirst(ListNode list) {
		ListNode list1 = new ListNode(list.getNext().getValue(), list.getNext().getNext());
		
		return list1;
		
		
	}

}
