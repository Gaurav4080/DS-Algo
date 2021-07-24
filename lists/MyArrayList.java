package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		ArrayList <String> fruits = new ArrayList();
		List<String> vegetables = new LinkedList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");

		
		System.out.println(fruits);
		System.out.println(vegetables);
		
		fruits.addAll(vegetables);
		System.out.println(fruits.set(1, "Banana"));
		System.out.println(fruits);
		
		String x[] = new String[fruits.size()];
		
		fruits.toArray(x);
		for(String e: x) {
			System.out.println(e);
		}
		
//		
////		Arraylist<Integer> marks = new Arrayalist();
//		
//		Pair<String, Integer> p1 = new Pair("String", 457);
//		Pair<Boolean, String> p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
//		p2.getDescription();

	}

}
