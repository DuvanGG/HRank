package dev.hackerRankExersise.list;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	
	public static void main(String[] args) {
		
		List<List<Integer>> myMatrix = Arrays.asList(
				
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(4, 5, 6, 4),
                Arrays.asList(7, 8, 9, 4),
                Arrays.asList(7, 8, 9, 4)
                
        );
		
		diagonalDifference(myMatrix);
		
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		 int primaryDiagonalSum = calculatePrimaryDiagonalSum(arr);
		 int secondaryDiagonalSum = calculateSecondaryDiagonalSum(arr);
		 
		 System.out.println(primaryDiagonalSum);
		 System.out.println(secondaryDiagonalSum);
		 
		 System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
		 
		 return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
		
	}
	
	/**
	 * Calcula la suma de los elementos en la diagonal principal de una matriz.
	 * Supone que 'matrix' es una lista de listas de enteros.
	 * @param matrix Una lista de listas de enteros que representa una matriz bidimensional.
	 * @return Un entero que representa la suma de los elementos en la diagonal principal.
	 */
	private static int calculatePrimaryDiagonalSum(List<List<Integer>> matrix) {
	    int primaryDiagonalSum = 0;

	    for (int i = 0; i < matrix.size(); ++i) {
	        primaryDiagonalSum += matrix.get(i).get(i);
	    }

	    return primaryDiagonalSum;
	}

	/**
	 * Calcula la suma de los elementos en la diagonal secundaria de una matriz.
	 * Supone que 'matrix' es una lista de listas de enteros.
	 * @param matrix Una lista de listas de enteros que representa una matriz bidimensional.
	 * @return Un entero que representa la suma de los elementos en la diagonal secundaria.
	 */
	private static int calculateSecondaryDiagonalSum(List<List<Integer>> matrix) {
	    int secondaryDiagonalSum = 0;
	    int size = matrix.size() - 1;

	    for (int i = 0; i < matrix.size(); ++i) {
	    	System.out.println(matrix.get(size));
	    	System.out.println(i);
	    	System.out.println(size);
	        secondaryDiagonalSum += matrix.get(size--).get(i);
	    }

	    return secondaryDiagonalSum;
	}
	
}
