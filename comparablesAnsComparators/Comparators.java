package comparablesAnsComparators;

import java.util.*;

public class Comparators {
	
	public static void main(String[] args) {
	
		List<StudentClass> students = new ArrayList<>();
		
		students.add(new StudentClass(23, "Ram"));
		students.add(new StudentClass(35, "Shyam"));
		students.add(new StudentClass(83, "Amit"));
		students.add(new StudentClass(13, "Ram"));
		students.add(new StudentClass(13, "Anuj"));
		
		Collections.sort(students, new Comparator<StudentClass>(){

			@Override
			public int compare(StudentClass o1, StudentClass o2) {
				return 0;
			}
			
			});
		
		students.forEach(System.out::print);
		
//		System.out.println(students);
		students.forEach(System.out::println);


	
}

	class SortByNameThenMarks implements Comparator<StudentClass>{

		@Override
		public int compare(StudentClass o1, StudentClass o2) {
			if(o1.Name.equals(o2.Name)) {
				return o1.marks - o2.marks;
			}else {
				return o1.Name.compareTo(o2.Name);
			}
		}
		
	}
	
}

