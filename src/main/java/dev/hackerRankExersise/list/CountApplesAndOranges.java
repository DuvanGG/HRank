package dev.hackerRankExersise.list;

import java.util.ArrayList;
import java.util.List;

public class CountApplesAndOranges {
	
	public static void main(String[] args) {
		
		List<Integer> apples = new ArrayList<Integer>();
		List<Integer> oranges = new ArrayList<Integer>();
		
		apples.add(2);
		apples.add(3);
		apples.add(-4);
		
		oranges.add(3);
		oranges.add(-2);
		oranges.add(-4);
		
		int a = 4;
		int b = 12;
		int s = 7;
		int t = 10;
		
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}
	
	/**
	 * 
	 * @param s punto de partida hogar
	 * @param t punto final hogar
	 * @param a punto fijo ubicacion manzano
	 * @param b	punto fijo ubicacion naranjo
	 * @param apples datos de tipo array de manzanas
	 * @param oranges datos de tipo array de naranjas
	 */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    	
    	List<Integer> appleSum = new ArrayList<Integer>();
    	List<Integer> orangeSum = new ArrayList<Integer>();
    	
    	for (int i = 0; i < apples.size(); i++) {
    		appleSum.add(apples.get(i) + a); 
			
		}
    	for (int i = 0; i < oranges.size(); i++) {
    		orangeSum.add(oranges.get(i) + b);
			
		}
    	int appleCant = 0;
    	int orangeCant = 0;
    	//se revisa si estan en el rango
    	for (int i = 0; i < apples.size(); i++) {
			if(appleSum.get(i) >= s && appleSum.get(i) <= t) {
				appleCant++;
			}
		}
    	
    	for (int i = 0; i < oranges.size(); i++) {
    		if(orangeSum.get(i) >= s && orangeSum.get(i) <= t) {
    			orangeCant++;
    		}
		}
    	
    	System.out.println(appleCant);
    	System.out.println(orangeCant);

    }

}
