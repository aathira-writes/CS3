
import java.io.FileWriter;
import java.io.IOException;

public class ML_1 { 
	public static void main(String[] args)  throws IOException {
		FileWriter fileOut = new FileWriter("mlone.dat");
		fileOut.write("Aathira");
		fileOut.write("Computer Science 3");
		fileOut.write("Period 8");
		fileOut.write("I am a junior.");
		
		fileOut.close();
	}
	
} 
