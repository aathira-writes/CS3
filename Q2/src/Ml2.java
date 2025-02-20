
public class Ml2 {
	public static void main(String[] args) {
		int base10 = Integer.parseInt("324", 6);
		System.out.println("324 base 6 == ");
		System.out.println(base10 + " base 10");
		
		System.out.print("124 base10 == ");;
		System.out.println(Integer.toString(base10, 16) + " base16\n\n");
		
		System.out.println(Integer.toBinaryString(90));
		System.out.println(Integer.toOctalString(90));
		System.out.println(Integer.toHexString(90).toUpperCase());
		
	}
}
