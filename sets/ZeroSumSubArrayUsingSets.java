package sets;

import java.util.*;

public class ZeroSumSubArrayUsingSets {
	
	public static void main(String[] args) {
	
	int[] a = {2, 1, 3, -4, -2};
	int k = 6;
	boolean found = false;
	
	Set<Integer> set = new HashSet<>();
	int sum = 0;
	for(int element : a) {
		set.add(sum);
		sum += element;
		if(set.contains(sum-k)) {
			found = true;
			break;
		}
		
		}
	System.out.println("SubArray Found = " + found);
	}	
}
