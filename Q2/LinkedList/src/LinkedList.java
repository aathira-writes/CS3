
public class LinkedList {
	public static void main(String[] args) {
		ListNode list = new ListNode("on",
				new ListNode("at",
						new ListNode("up", 
								new ListNode("over", null))));
		
		System.out.println();
		while( list!= null ) {
			System.out.println(list.getValue());
			list = list.getNext();
			
		}
	}
}
