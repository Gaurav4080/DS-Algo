package comparablesAnsComparators;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
	
		List<StudentClass> students = new ArrayList<>();
		
		students.add(new StudentClass(23, "Ram"));
		students.add(new StudentClass(35, "Shyam"));
		students.add(new StudentClass(83, "Amit"));
		students.add(new StudentClass(13, "Rohit"));
		students.add(new StudentClass(13, "Anuj"));
		
		Collections.sort(students);
		
//		System.out.println(students);
		students.forEach(System.out::println);

}

}
