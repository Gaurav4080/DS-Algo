package linkedList;

public class NewLinkList {

	public static void main(String[] args) {

		MyLinkedList mll = new MyLinkedList();
		
//		mll.add(12);
//		mll.add(10);
//		mll.add(5);
//		mll.add(19);
		
		for(int i =0; i<10; i++) {
			mll.add(i);
		}
		
		mll.print();

	}

}
