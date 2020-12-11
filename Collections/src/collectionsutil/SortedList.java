package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//COLLECTIONS SORT
public class SortedList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");
		
		System.out.println("Before sorting: "+ l);
		
		Collections.sort(l);
		System.out.println("After sorting: "+ l);

		//Using custom comparator should sort values in reverse
		//Collections.sort(l, new MyComparator());
		
		//System.out.println("After custom sorting: "+ l);
		
		//Collection must be sorted before using binarysearch method
		int result = Collections.binarySearch(l, "X");
		System.out.println("Index of X: " +result);
		result = Collections.binarySearch(l, "C");
		//This will print -3 because C A is -1, B is -2 and since C can be inserted
		// next to B, the returned value will be -3
		System.out.println("Index of C: " +result);
	}
}
