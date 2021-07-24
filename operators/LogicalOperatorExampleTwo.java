package operators;

public class LogicalOperatorExampleTwo {

	public static void main(String[] args) {
		
		int x = 20;
		
		if (!(x == 10 || x == 12)) {
			System.out.println("You can give board exams now");
		}
		else 
			System.out.println("You can not give board exams");
	}

}
