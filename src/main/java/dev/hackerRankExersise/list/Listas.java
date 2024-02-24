package dev.hackerRankExersise.list;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		a.add(17);
		a.add(28);
		a.add(30);
		
		b.add(99);
		b.add(16);
		b.add(8);
		
		//compareTriplets(a, b);
		System.out.println(compareTriplets(a, b));

	}
	
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> c = new ArrayList<Integer>();
		c.add(0);
		c.add(0);
		
		for (int i = 0; i <= 2; i++) {
				if (a.get(i) > b.get(i)) {
					c.set(0, c.get(0) + 1);
				}else if(a.get(i) < b.get(i)) {
					c.set(1, c.get(1) + 1);
				}else {
					
				}
		}
		
		return c;
		
    }

}
