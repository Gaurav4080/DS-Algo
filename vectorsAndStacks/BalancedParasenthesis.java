package vectorsAndStacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParasenthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-- !=0) {
			String s = sc.nextLine();
			
			Stack<Character> stack = new Stack<>();
			boolean isBalanced = true;
			
			for(t = 0; t<s.length(); t++) {
				char ch = s.charAt(t);
				if(ch == '(' || ch == '{' || ch == '[') {
					stack.push(ch);
					continue;
				}
				
				if(stack.isEmpty()) {
					isBalanced = false;
					break;
				}
				if(ch == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
				if(ch == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
				if(ch == '}') {
					if(stack.peek() == '{') {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) {
				isBalanced = false;
			}
			if(isBalanced) {
				System.out.println("Balanced");
			}else {
				System.out.println("not balanced");
			}
		}

	}

}
