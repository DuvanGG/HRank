package dev.hackerRankExersise.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370);
		//miniMaxSum(arr);
		//miniMaxSumV2(arr);
		miniMaxSumV3(arr);

	}

	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		long resultMin = 0;
		long resultMax = 0;
		long resultAnterior = 0;
		long resultAnteriorMin = 0;
		for (int i = 0; i < arr.size(); i++) {

			if (i != 0) {
				resultMax = arr.get(i) + resultAnterior;
				resultAnterior = resultMax;
			}

			if (i != arr.size() - 1) {
				resultMin = arr.get(i) + resultAnteriorMin;
				resultAnteriorMin = resultMin;
			}
		}

		System.out.println(resultMin + " " + resultMax);

	}
	
	public static void miniMaxSumV2(List<Integer> arr) {
	    long resultMin = Integer.MAX_VALUE;
	    long resultMax = Integer.MIN_VALUE;
	    long sum = 0;
	    
	    // Calcular la suma de todos los elementos y encontrar el valor mínimo y máximo
	    for (int num : arr) {
	        sum += num;
	        resultMin = Math.min(resultMin, num);
	        resultMax = Math.max(resultMax, num);
	    }
	    
	    // Calcular la suma mínima y máxima
	    long sumMin = sum - resultMax;
	    long sumMax = sum - resultMin;
	    
	    System.out.println(sumMin + " " + sumMax);
	}
	
	 public static void miniMaxSumV3(List<Integer> arr) {
	        long sum = 0;
	        
	        
//			Integer.MAX_VALUE es una constante estática en Java que representa 
//			el valor máximo posible para un tipo de dato entero.
	        int resultMin = Integer.MAX_VALUE;
	        int resultMax = Integer.MIN_VALUE;

	        for (int num : arr) {
	            sum += num;
	            resultMin = Math.min(resultMin, num);
	            resultMax = Math.max(resultMax, num);
	        }

	        long sumMin = sum - resultMax;
	        long sumMax = sum - resultMin;

	        System.out.println(sumMin + " " + sumMax);
	    }

}
