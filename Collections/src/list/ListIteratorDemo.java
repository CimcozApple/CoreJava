package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("def");
		list.add("xyz");
		
		ListIterator<String> listIterator = list.listIterator();
		
		//Forward direction
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		//Backward direction
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
	}
}
