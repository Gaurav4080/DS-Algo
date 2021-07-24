package whileLoops;

import java.util.Scanner;

public class DoWhileLoopExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
				do {
					n = sc.nextInt();	
					System.out.println("number is not 0");
				} while ( n != 0);
	}

}
