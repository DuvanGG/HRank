package dev.hackerRankExersise.functions;

public class Kangaroo {
	
	public static void main(String[] args) {
		
		
//		int x1 = 6644, v1 = 5868, x2 = 8349, v2 = 3477;
		int x1 = 28, v1 = 8, x2 = 96, v2 = 2;
		
//		int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
	
		
		System.out.println(kangaroo(x1, v1, x2, v2));
		
	}
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		
		String response = "";
		
		// t = x1 - x2 / v2 - v1
		
		int t = (x1 - x2) / (v2 - v1);
		
		System.err.println(t);
		
		/**
		 * 	la condicion (x2 - x1) % (v1 - v2) == 0
		 *  verifica si la diferencia entre las posiciones iniciales
		 *  de los canguros es divisible por la diferencia de sus 
		 *  velocidades. Si es divisible, entonces los canguros 
		 *  se encontrarán en el mismo lugar al mismo tiempo en algún punto.
		 */
		
		if (v1 <= v2) {
	        response = "NO";
	    } else {
	        if ((x2 - x1) % (v1 - v2) == 0) {
	            response = "YES";
	        } else {
	            response = "NO";
	        }
	    }
	    
	    return response;
	   
	}

}
