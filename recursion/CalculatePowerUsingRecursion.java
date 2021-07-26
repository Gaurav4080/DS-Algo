package recursion;

public class CalculatePowerUsingRecursion {
	
	static int stepCount = 0;

	public static void main(String[] args) {
		
		System.out.println(pow(3, 10000));
		
		System.out.println(stepCount);

	}
	
	static long pow(int a, int b) {
		stepCount++;
		if(b == 0) {
			return 1;
		}
		
		return a * pow(a, b-1);
	}

}
