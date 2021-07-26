package comparablesAnsComparators;

public class StudentClass {
	
	int marks;
	String Name;
	
	
	public StudentClass(int marks, String name) {
		super();
		this.marks = marks;
		Name = name;
	}


	@Override
	public String toString() {
		return "StudentClass [marks=" + marks + ", Name=" + Name + "]";
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	@Override
	public int compareTo(StudentClass obj) {
		return this.marks - obj.marks;
	}
	
	

}
