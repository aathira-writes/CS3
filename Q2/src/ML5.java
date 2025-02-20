import java.util.*;
public class ML5 {
	public static void main(String[] args) { 
		Scanner key = new Scanner(System.in);
		
		System.out.println("input your first number: ");
		int a = key.nextInt();
		System.out.println("input your second number: ");
		int b = key.nextInt();
		
		System.out.println((a>b)? "Number a is bigger" : "Number b is bigger" );
	}
}
