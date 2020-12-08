package navigableset;

import java.util.TreeSet;

public class NavigableTreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s);
		//returns greater than or equal to 20
		System.out.println(s.ceiling(20));
		//lowest element that is greater than 40
		System.out.println(s.higher(40));
		//highest element less than or equal to 10
		System.out.println(s.floor(10));
		//highest element less than 30
		System.out.println(s.lower(30));
		//retrieves and removes first  element
		System.out.println(s.pollFirst());
		//retrieves and removes last element
		System.out.println(s.pollLast());
		//descending order
		System.out.println(s.descendingSet());
		System.out.println(s);
		
		
	}
}
