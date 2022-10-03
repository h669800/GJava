package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i : matrise) {
			System.out.println();
			for (int k : i) {
				System.out.print(k + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String StrTab = "";
		
			for (int[] i : matrise) {
				for (int k : i) {
					StrTab += k + " ";
				}
				    StrTab += "\n";
			}
		return StrTab;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] scale = new int[matrise.length][matrise[0].length];

	     for (int i = 0; i < matrise.length; i++) {
	         
	         for (int j = 0; j < matrise[i].length; j++) {
	        	 scale[i][j] = matrise[i][j] * tall;
	         }
	         
	     }
	     return scale;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) return false;
		if (a == b) return true;
		
	    for (int i = 0; i < a.length; i++) {
	         
	         for (int j = 0; j < a[i].length; j++) {
	        	 if (a[i].length != b[i].length) return false;
	        	 if (a[i][j] != b[i][j]) return false;
	         }
	         
	    }
	     return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Multipliser ikke implementert");
	
	}
}
