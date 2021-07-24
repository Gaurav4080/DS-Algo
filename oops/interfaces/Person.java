package oops.interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();

	}
	
	public void study() {
		System.out.println("The Person is Studing");
	}
	
	public void makeVideo() {
		System.out.println("The Person is making a Youtube Video");
	}

}
