/*ListNode class - implements Linkable Interface
 * This class represents a node in the linked list.
 * Each node stores a value and the reference to the 
 * next List Node in the Linked List.
 * 
 */
public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode;

	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
	}

	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue=value;
		nextListNode=next;
	}

	public Comparable getValue()
	{
		return listNodeValue;
	}

	public ListNode getNext()
	{
	   return nextListNode;
	}

	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

	public void setNext(Linkable next)
	{
		nextListNode = (ListNode)next;
	}
	
	public boolean hasNext() {
		if(nextListNode != null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}