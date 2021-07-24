package vectorsAndStacks;

import linkedList.MyLinkedList;

public class MyStackusingLinkedlist<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList();
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from a empty stack is not allowed");
		}
		
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking in an empty stack is not allowed");
		}
		return ll.getLast();
		
	}

}
