import java.util.*;
import java.util.LinkedList;
public class LinkedListLibraryInJava {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		list.add(4);
		System.out.println(list);
		list.add(1, 5);
		System.out.println(list);
		LinkedList<Integer> coll = new LinkedList<Integer>();
		coll.add(2);
		coll.add(3);
		list.addAll(2, coll);
		System.out.println(list);
		list.addAll(coll);
		System.out.println(list);
		list.addFirst(10);
		System.out.println(list);
		list.addLast(15);	
		System.out.println(list);
	}
}
