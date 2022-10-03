package Innlevering;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int mat[][] = { { 1, 2, 3, 4 },
                   { 5, 6, 7, 8 },
                   { 9, 10, 11, 12 } };
	       skrivUt(mat);


	}
		public static void skrivUt(int[][] matrise) {
        // Loop through all rows
        for (int i = 0; i < matrise.length; i++) {
 
            // Loop through all elements of current row
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();
        }
	}

}

