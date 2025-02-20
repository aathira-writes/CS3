import java.util.*;

public class lab10 {
	public static void main(String[] args) {
		Map<String, Integer> mOne = new TreeMap<String, Integer>();
		mOne.put("8", 1);
		mOne.put("5",  2);
		mOne.put("6",  7);
		System.out.println(mOne.get("8"));
		System.out.println(mOne.get("6"));
		System.out.println(mOne.get("3"));
		
		System.out.println();
		
		Map<String, Integer> mTwo = new TreeMap<String, Integer>();
		mTwo.put("8",  10);
		System.out.println(mTwo.put("8",  12));
		mTwo.put("8",  15);
		System.out.println(mTwo.put("5",  18));
		mTwo.put("5",  20);
		System.out.println(mTwo.put("5",  23));
		
		System.out.println();
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("8", 6);
		map.put("8", 3);
		map.put("8", 2);
		map.put("5",  9);
		map.put("6",  8);
		map.put("2",  12);
		System.out.println(map);
		
		System.out.println();
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		String[] list = {"4", "5", "8", "2", "8", "8", "6"};
		for(String s: list) {
			if(treeMap.get(s) == null) {
				treeMap.put(s,  1);
			} else {
				treeMap.put(s,  treeMap.get(s) + 1);
			}
			System.out.println(treeMap);
		}
		 
	}
}
