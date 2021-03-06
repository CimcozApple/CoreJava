package sortingobjects;

import java.util.Set;
import java.util.TreeSet;
//Sorting objects
public class Test {
	public static void main(String[] args) {
		//sort based on their ids
		//Set<Employee> set = new TreeSet<>();
		//sort based on their names
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(100,"Obama"));
		set.add(new Employee(400,"Gil"));
		set.add(new Employee(300,"Concha"));
		set.add(new Employee(200,"Lol"));
		
		for(Employee e: set){
			System.out.println(e.id);
			System.out.println(e.name);
		}
	}
}
