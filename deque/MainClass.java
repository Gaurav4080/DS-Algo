package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(12);
		ad.addFirst(85);
		ad.addFirst(56);
		
		System.out.println(ad);
		
		ad.push(15);
		System.out.println(ad);
		
		ad.offerLast(19);
		System.out.println(ad);
		
		System.out.println(ad.pollLast());

	}

}
