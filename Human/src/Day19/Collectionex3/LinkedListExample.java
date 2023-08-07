package Day19.Collectionex3;


import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
			
		}
		
		endTime = System.nanoTime();
		System.out.println("A");
	}

}
