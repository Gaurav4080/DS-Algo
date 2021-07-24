//Creating a basic Calculator using Switch Case and Scanner Input.

package myJavaProjects;

// Importing Scanner class to the code in order to take the user input.
import java.util.Scanner;

// Creating a Java Class so as to use the Java Interface.
public class CalculatorUsingConditionalStatements {

// using the public static void main function and introducing it to the code
	public static void main(String[] args) {

// Declaring the Scanner Variable so as to use it further
		Scanner sc = new Scanner(System.in);
		
// The User will first provide the input for the First Number here
		
		System.out.println("Enter the First Number");
		int a = sc.nextInt();

// The User will first provide the input for the Second Number here		
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		
// The User will first provide the input for the operand that he/she wants to use here
		System.out.println("Enter the Operand");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
// Declaring a result variable in int data type so as to display the reult at the end of the program
		int result = 0;
		
// Using the Switch case to introduce the operands and their functions
		switch(operation) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
				break;
		case '/':
			result = a/b;
			break;
			
// As we are interested in makking a very simple application, we can still add as many operations as we want and add their functionality using switch case
		
// Providing a Default statemnet to provide a null statement for all the wrong input.
		default:
			System.out.println("Invalid Operation");
		}
		
// Printing the Result here 
		System.out.println("The Result is : " + result);
	}

}
// End of the Program