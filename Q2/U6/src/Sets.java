import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Sets {
    public static <Integer> Set<Integer> union(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    public static <Integer> Set<Integer> intersection(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    public static <Integer> Set<Integer> difference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.removeAll(setB);
        return result;
    }

    public static <Integer> Set<Integer> symmetricDifference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> union = union(setA, setB);
        Set<Integer> intersection = intersection(setA, setB);
        union.removeAll(intersection);
        return union;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        boolean setswitcher = false;
        int counter = 0;
        
        Scanner filereader = new Scanner(new File("Q2/U6/src/testfile.dat"));
        
        while (filereader.hasNextLine()) {
            String[] numbs = filereader.nextLine().split(" ");
            if (setswitcher == false) {
                for (int i = 0; i < numbs.length; i++) {
                    setA.add(Integer.parseInt(numbs[i]));
                    setswitcher = true;
                }
                
            } else if (setswitcher == true) {
                for (int i = 0; i < numbs.length; i++) {
                    setB.add(Integer.parseInt(numbs[i]));
                    setswitcher = false;
                }
            }
            counter ++;
            if (counter % 2 == 0) {
                System.out.println("Set A: " + setA);
                System.out.println("Set B: " + setB);
                
                System.out.println("Union: " + union(setA, setB));
                System.out.println("Intersection: " + intersection(setA, setB));
                System.out.println("Difference A-B: " + difference(setA, setB));
                System.out.println("Difference B-A: " + difference(setB, setA));
                System.out.println("Symmetric Difference: " + symmetricDifference(setA, setB));

                setA.clear();
                setB.clear();
                System.out.println();
            }

        }
       
    }

}
