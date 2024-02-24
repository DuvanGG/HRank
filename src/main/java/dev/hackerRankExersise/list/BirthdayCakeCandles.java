package dev.hackerRankExersise.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {
	
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(3, 2, 1, 3);
		birthdayCakeCandles(arr);
		
		
//		Map<Integer, Long> counts = countOccurrences(arr, 895);
//        System.out.printf("%s aparece %d veces%n", 895, counts.getOrDefault(895, 0L));

	}

	/**
	 * 
	 * @param candles una lista de enteros que representa una matriz unidimensional.
	 * @return Un entero que representa la suma de los elementos tallest del array.
	 */
	public static int birthdayCakeCandles(List<Integer> candles) {
		
		int numMayor = candles.get(0);
		int cantMayor = 0;
		
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i) >= numMayor ) {
				numMayor = candles.get(i);
			}
			
		}
		
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i) >= numMayor ) {
				cantMayor++;
			}
			
		}
		

		
		System.out.println(numMayor + " " + cantMayor);
		
		
		return cantMayor;
	

	}
	
	public static Map<Integer, Long> countOccurrences(List<Integer> numbers, int target) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("La lista de números no puede estar vacía.");
        }

        Map<Integer, Long> occurrenceCounts = new HashMap<>();

        for (int num : numbers) {
            if (num == target) {
                occurrenceCounts.merge(num, 1L, Long::sum);
            }
        }

        return occurrenceCounts;
    }

}
