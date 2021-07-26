package recursion;

//import java.util.Scanner;

public class SumOfFirstNIntegers {

	public static void main(String[] args) {
		
		System.out.println(sum(15));
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 0; i <= n; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);

	}
	
	static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + sum(n-1);
	}

}
