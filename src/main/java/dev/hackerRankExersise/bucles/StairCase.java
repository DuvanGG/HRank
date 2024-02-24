package dev.hackerRankExersise.bucles;

public class StairCase {

	public static void main(String[] args) {

		staircase(7);

	}

	public static void staircase(int n) {
		// Write your code here

		// Bucle externo para imprimir cada fila
		for (int i = 1; i <= n; i++) {

			// Bucle interno para imprimir los espacios en blanco
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Bucle interno para imprimir los caracteres #
			for (int k = 1; k <= i; k++) {
				System.out.print("#");
			}

			// Imprimir un salto de línea al final de cada fila
			System.out.println();
			//System.out.println("\n");

		}
	}

}
