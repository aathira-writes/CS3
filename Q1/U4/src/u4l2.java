import java.io.*;
import java.util.*;
public class u4l2 {
   public static void main(String[] args) throws FileNotFoundException{
       Stack<String> stack = new Stack<String>();
       Scanner key = new Scanner(new File("H:\\CS3\\U4\\src\\Postfixsolver.dat"));
       while(key.hasNext()) {
           String line = key.nextLine();
           System.out.print(line + " = ");
           String[] lineArray = line.split(" ");
           String numbers= "0123456789";
           for(int i = 0; i < lineArray.length; i++) {
        	  // System.out.println(lineArray[i]);
        	   if(numbers.contains(lineArray[i])) {
        		   stack.push(lineArray[i]);
        	   } else {
        		   int a = Integer.parseInt(stack.pop());
        		   int b = Integer.parseInt(stack.pop());
        		   switch(lineArray[i]) {
        		   case "+":
        			   stack.push(Integer.toString(a+b));
        			   break;
        		   case "-":
        			   stack.push(Integer.toString(a-b));
        			   break;
        		   case "/":
        			   stack.push(Integer.toString(a/b));
        			   break;
        		   case "*":
        			   stack.push(Integer.toString(a*b));
        			   break;
        		   }
        	   }
        	   System.out.println(stack);
        	   
        	   
           }
          
           System.out.println(stack.peek());
           stack.clear();
          
          
       }
             
          


      




   }
}



