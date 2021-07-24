package linkedList;
public class MyLinkedList<E> {
	Node<E> head;
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	 void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	public E removeLast() throws Exception {
		Node<E> temp = head;
		
		if(head == null) {
			throw new Exception("Can not remove last element from a empty stack");
		}
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public E getLast() throws Exception{
		Node<E> temp = head;
		
		if(head == null) {
			throw new Exception("Can not Peek last element from a empty stack");
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return temp.data;
	}		

	public class Node<E> {
	E data;
	public Node<E> next;
	public Node(E data) {
		this.data = data;
		next = null;
	}	
}
}