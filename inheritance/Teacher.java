package inheritance;

public class Teacher extends PersonClass{
	
	public void teach() {
		System.out.println(name + " is teaching");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Teacher " + name + " is teaching");
	}
	public static void laughing() {
		System.out.println("Teacher is Laughing");
	}

}
