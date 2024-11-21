package dev.hackerRankExersise.bucles;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();

		for (int i = 0; i < q; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();

			generarSeries(a, b, n);
		}

	}

	private static void generarSeries(int a, int b, int n) {
		int numeroActual = a;

		for (int i = 0; i < n; i++) {
			//double Math.pow(double base, double exponent)
			numeroActual += b * Math.pow(2, i);
			System.out.print(numeroActual + " ");
		}
		System.out.println();
	}

}
