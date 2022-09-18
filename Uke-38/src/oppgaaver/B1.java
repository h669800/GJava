package oppgaaver;


import java.util.ArrayList;
import java.text.DecimalFormat;

public class B1 {
 // driver code
 public static void main(String args[])
 {
	 ArrayList<Double> deg = new ArrayList<Double>();
	 ArrayList<Double> radian = new ArrayList<Double>();
	 ArrayList<Double> sin = new ArrayList<Double>();
	 ArrayList<Double> cos = new ArrayList<Double>();
	 //lager 4 lister med verdier
	 
	 for (Double i = 0.0; i < 190.0; i = i + 15.0) deg.add(i);
	 for (Double i : deg)                         radian.add( Math.toRadians(i) );
	 for (Double i : radian)                      sin.add( Math.sin(i) );
	 for (Double i : radian)                      cos.add( Math.cos(i) );
	 // Legger til verdiene til listene


	 
	 System.out.println("x i grader    x i radianer    sin(x)       cos(x)");
	 System.out.println("--------------------------------------------------------------------------------------------");
	 liste(deg, radian, sin, cos);
	 System.out.println("--------------------------------------------------------------------------------------------");
	 // printer ut verdiene
 }
 
 public static void liste(ArrayList<Double> deg, ArrayList<Double> rad, ArrayList<Double> sin, ArrayList<Double> cos) {
	 
	for (int i = 0; i < deg.size(); i++) {
		// kjører ettersom hvor mange verdier er i arrayList "deg". (altså 13 ganger)
		
		System.out.print(deg.get(i));
		printer( rad.get(i) );
		printer( sin.get(i) );
		printer( cos.get(i) );
		System.out.println(); // ny linje
	}
 }
 
 public static void printer(Double x) {
	 DecimalFormat df = new DecimalFormat("#.###");
	 // Runder av verdier så de bruker bare 3 decimaler
	 String StringVerdi = Double.toString(x);
	 // Må konvertere til String for å bruke length() metoden
	 
		System.out.print(String.format("%-10s%s", "", df.format(x)));
		if (StringVerdi.length() < 6) System.out.print("      ");
	 
	 // Dette printer ut Verdien med mye mellomrom om lengden er mindre enn 4. f.eks 1.0 har lengden 2.
	 // Ellers så printer den ut som vanlig.

 }
 
}