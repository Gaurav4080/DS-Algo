package conditionalStatements;

public class IfElseIfElse {

	public static void main(String[] args) {
		
		int x = 23;
		
		if (x <= 10) {
			System.out.println("The Number is less then 10");
		}
		
		else if (x > 10 && x <= 20) {
			System.out.println("The number is between 10 and 20");
		}
		
		else if (x > 20 && x <= 30) {
			System.out.println("The number is between 20 and 30");
		}
		
		else
			System.out.println("The Number is more than 20");

	}

}
