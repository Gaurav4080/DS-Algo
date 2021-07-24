package loops;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i*i<x; i++) {
			if(x%i<=0) {
				isPrime = false;
				break;
			}
		}
		if(x<2) {
			isPrime = false;
		}
		
		System.out.println("isPrime " +isPrime);
	}

}
