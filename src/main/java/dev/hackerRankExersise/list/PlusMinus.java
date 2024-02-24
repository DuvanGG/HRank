package dev.hackerRankExersise.list;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {

		// Crear un ArrayList de Integer
		List<Integer> arr = new ArrayList<>();

		// Agregar valores al ArrayList
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(0);
		arr.add(-1);
		arr.add(-3);

		plusMinus(arr);

	}

	public static void plusMinus(List<Integer> arr) {

		// Write your code here}
		double cantidadPositivos = 0;
		double cantidadNegativos = 0;
		double zero = 0;

		// Se recorre arrego y se identifican los valores.
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				cantidadPositivos++;
			} else if (arr.get(i) < 0) {
				cantidadNegativos++;
			} else {
				zero++;
			}
		}

		double totalElements = arr.size();
		double promedioPositivos = cantidadPositivos / totalElements;
		double promedioNegativos = cantidadNegativos / totalElements;
		double promedioCeros = zero / totalElements;

		System.out.printf("%.6f%n", promedioPositivos);
		System.out.printf("%.6f%n", promedioNegativos);
		System.out.printf("%.6f%n", promedioCeros);

//		System.out.println(cantidadPositivos / arr.size());
//		System.out.println(cantidadNegativos / arr.size());
//		System.out.println(zero / arr.size());

	}

}
