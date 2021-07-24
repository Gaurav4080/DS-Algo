package operators;

public class BitWiseOperator {

	public static void main(String[] args) {
		
//		10 -> 1010
//		13 -> 1101
//		1101  ->  0110  ->  0011  ->  0001  ->  0000       Rightwise Shift, everytime divide by 2
		
		int a = 10;
		int b = 13;
		
		int c = a | b;
		
		int d = b << 1;
		
		System.out.println(c);
		System.out.println(d);

	}

}
