package methods;

public class PassByValue {
	
	class Dog{
		int legs;
	}

	public static void main(String[] args) {
//		int c = 34;
//		int d = 12;
//		
//		swap(c,d);
//		
//		System.out.println(c + " " + d);
		
//		Dog d = new Dog();
//		d.legs = 3;
//		Dog c = new Dog();
//		c.legs = 4;
//		
//		swap(c, d);
		Dog a = new Dog();
		a.legs = 4;
		
		changeDog(a);
		System.out.println(a.legs);

	}
	
//	static void swap(int a , int b) {
//	int temp = a;
//	a = b;
//	b = temp;
//	
//	}
	
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
		
	}
	
	static void changeDoge(Dog dog) {
		dog.legs = 6;
	}

}
