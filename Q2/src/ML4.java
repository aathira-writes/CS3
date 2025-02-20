import java.util.*;
import java.io.*;
public class ML4 {
	public static void main(String[] args) throws FileNotFoundException {
		uncheckedExceptionWithTryCatch();
		checkedExceptionWithThrows();
	}
	private static void checkedExceptionWithThrows() throws FileNotFoundException {
		File file = new File("notexsisintfile.txt");
		FileInputStream stream = new FileInputStream(file);
	}
	private static void uncheckedExceptionWithTryCatch() {
		try {
			String str = null;
			System.out.print(str.length());
		} catch (NumberFormatException | NullPointerException e){
			
		}
	}
}
