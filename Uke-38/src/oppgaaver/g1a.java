package oppgaaver;

public class g1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabell = {1, 3, 4, 7, 9, 10};
		tabell[2] = 7;
		int tal = 1;
		skrivUt(tabell);
		System.out.println("Does " + tal + " exist in the array? = " + finnes(tabell, tal));

		skrivUt(skiftfortegn(tabell));
		
		
	}
		
	public static void skrivUt(int[] tab) {
			for ( int element : tab)
			System.out.println(element);
	}
	
	public static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		while (i < tabell.length) {
			if (tabell[i] == tall)  return true;
			i++;
		}
		return false;
	}
	
	public static int[] skiftfortegn (int[] tabell) {
		int[] negativ = new int[tabell.length];;
		
		
		for ( int i = 0; i < tabell.length; i++ ) {
			negativ[i] = tabell[i] * (-1);
		}
		return negativ;
	}

}
