package vectorsAndStacks;

public class StackMainClass {

	public static void main(String[] args) throws Exception {

		MyStackusingLinkedlist<Integer> stack = new MyStackusingLinkedlist<>();
		
//		stack.push(12);
//		stack.push(24);
//		stack.push(36);
		
//		int popped = stack.pop();
//		
//		System.out.println(popped);
		
		int peeked = stack.peek();

		System.out.println(peeked);

	}

}
