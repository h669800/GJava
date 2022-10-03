package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void skrivUt (int[] tabell) {
		for (int i = 0; i <= tabell.length-1; i++) {
			System.out.print(tabell[i]);
		}
	}
	
	public static int forAdd(int[] tabell) {
		int sum = 0;
		for (int i = 0; i <= tabell.length-1; i++) {
			sum += tabell[i];
		}
		return sum;
	}
	
	public static int whileAdd(int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i <= tabell.length-1) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	
	public static int utvidetAdd(int[] tabell) {
		int sum = 0;
		for (int i : tabell) {
			sum += tabell[i];
		}
		return sum;
	}
	public static String tilStreng(int[] tabell) {
		String StrTab = "[";
		for (int i = 0; i < tabell.length; i++) {
			StrTab += tabell[i];
			if (i < tabell.length-1) StrTab += ",";
		}
		StrTab += "]";
		return StrTab;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		for (int i = 0; i <= tabell.length-1; i++) {
			if (tabell[i] == tall) return true;
		}
		
		return false;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		for (int i = 0; i <= tabell.length-1; i++) {
			if (tabell[i] == tall) return i;
		}
		return -1;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] a = new int[tabell.length];
		int j = 0;
		for (int i = tabell.length - 1; i >= 0; i--) {
			a[j] = tabell[i];
			j++;
		}
		return a;
	}
	
	public static boolean erSortert (int[] tabell) {
		for (int i = tabell.length-1; i > 0; i--) {
			if (tabell[i] < tabell[i-1]) return false;
		}
		return true;
	}

	public static int summer (int[] tabell) {
		int sum = 0;
		for(int i : tabell) {
			sum += i;
		}
		return sum;
	}
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] settSammen = new int[tabell1.length + tabell2.length];
		int i = 0;

		for (int k = 0; i < settSammen.length; k++) {
			if (k < tabell1.length) {
		    settSammen[i] += tabell1[k];
			i++;	
			}
			if (k < tabell2.length) {
			settSammen[i] += tabell2[k];
			i++;
			}
	}
		
		return settSammen;
	}
}
