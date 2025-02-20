import java.util.*;
public class u4l1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter in as many lines as needed");
		
		Stack<String> stack;
		stack = new Stack<String>();
		String st = key.nextLine();
		stack = setStack(st);
		System.out.println(stack);
		popEmAll(stack);
	}
	
	public static Stack<String> setStack(String str) {
		Stack<String> stac;
		stac = new Stack<String>();
		for (int i = 0; i < str.length(); i++) {
			stac.push(str.substring(i, i+1));
		}
		return stac;
	}
	public static void popEmAll(Stack<String> str) {
		System.out.println("popping all items from the stack");
		for(int i = str.size(); i > 0; i--) {
			System.out.print(str.pop() + " ");
		}
	}
}
