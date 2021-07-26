package recursion;

public class CalculatingPowerWithPowerFactor {
	
	static int stepCount = 0;

	public static void main(String[] args) {
		
//		System.out.println(fastPow(3, 4));
		
//		System.out.println(stepCount);

	}
	
	static long fastPow(int a, int b) {
		System.out.println(b);
		stepCount++;
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0) {
			return fastPow(a*a,b/2);
		}
		return a*fastPow(a, b-1);
	}

}
