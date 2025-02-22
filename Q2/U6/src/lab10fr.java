import java.util.*;
import java.io.*;
public class lab10fr {
public static void main(String[] args) throws FileNotFoundException{
	Scanner file1=new Scanner(new File(("Q2/U6/src/spantoeng")));


	Map<String, String> ENGLISH = new HashMap<String, String>();

	while(file1.hasNext()) {
	
	String liney =file1.nextLine();

	String[] lineArray = liney.split(" ");
	ENGLISH.put(lineArray[0], lineArray[1]);
	}


	Scanner file2=new Scanner(new File("Q2/U6/src/spantranslation"));
	while (file2.hasNext()) {
	String line=file2.nextLine();
	System.out.println(line);
	String[] lineArray=line.split(" ");
	for(int i=0; i<lineArray.length;i++) {
	System.out.print(ENGLISH.get(lineArray[i])+" ");
	}
		System.out.println();
		System.out.println("=");
		}
	file1.close();
	file2.close();
	}
}
