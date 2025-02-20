import java.util.*;
public class ML3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input an integer: ");
		int num1 = kb.nextInt();
		
		System.out.println("Input an integer: ");
		int num2 = kb.nextInt();
		
		System.out.println(num1 + " & " + num2 + " == " + (num1 & num2));
		System.out.println(num1 + " | " + num2 + " == " + (num1 | num2));
		System.out.println(num1 + " ^ " + num2 + " == " + (num1 ^ num2));
		
		System.out.println("----");
		
		System.out.println(num1 + " << 2 " + " == " + (num1 << 2));
		System.out.println(num1 + " * 4 " + " == " + (num1*4));
		System.out.println(num1 + " << 2 == " + num1 + "*4  --> " + ((num1 << 2) == (num1*4)));
		
		System.out.println();
		
		System.out.println(num1 + " >> 2" + " == " + (num2 >> 1));
		System.out.println(num2 + " * 4 " + " == " + (num2*4));
		System.out.println(num2 + " >> 2 == " + num2 + "*4  --> " + ((num2 >> 2) == (num2*4)));
		
		
	}
}
