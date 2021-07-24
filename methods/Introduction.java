package methods;

public class Introduction {

	public static void main(String[] args) {

		int firstNumber = 34;
		int secondNumber = 23;

		int result = maxOf(firstNumber, secondNumber);
		
		int result2 = maxOf(100, 200);
		
		maxOf(2, 4);
		
		System.out.println(result + result2);
		System.out.println(result2);
		
		sayHi();
	}
	
	static int maxOf(int a, int b) {
//		return a > b? a:b;
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	static void maxOf(int c, double d) {
		
		
		
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}

}
