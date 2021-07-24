package oops;

class cat{
	String color;
	
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is Walking");
	}
	public void eat() {
		System.out.println("Cat is Eating");
	}
	public void discription() {
		System.out.println("My cat has " + legs + " legs and " + eyes + " eyes");
	}
}
class dog{
	
	String breed, name;
	
	public void jump() {
		System.out.println("My dog " + name + " jumped");
	}
	public void discription() {
		System.out.println("My Dog name is " + name + " and his breed is " + breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
		
//		cat cat1 = new cat();
//		cat cat2 = new cat();
//		
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		cat2.legs = 4;
//		cat2.eyes = 1;
//		
//		cat1.walk();
//		cat2.eat();
//		cat1.discription();
//		cat2.discription();
		
		dog husky = new dog();
		dog poodle = new dog();
		
		husky.breed = "Husky";
		husky.name = "Terence";
		
		poodle.breed = "poodle";
		poodle.name = "Max";
		
		husky.discription();
		husky.jump();
		
		poodle.jump();
		poodle.discription();
	}

}
