package RomanIntegers;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int numr = 3;
	        int M = numr/1000;
	        numr -= (M*1000);
	        int CM = numr/900;
	        numr-=(CM*900);
	        int D = numr/500;
	        numr-=(D*500);
	        int CD = numr/400;
	        numr-=(CD*400);
	        int C = numr/100;
	        numr-=(C*100);
	        int XC = numr/90;
	        numr-=(XC*90);
	        int L = numr/50;
	        numr-=(L*50);
	        int XL = numr/40;
	        numr-=(XL*40);
	        int X = numr/10;
	        numr-=(X*10);
	        int IX = numr/9;
	        numr-=(IX*9);
	        int V = numr/5;
	        numr-=(V*5);
	        int IV = numr/4;
	        numr-=(IV*4);
	        int I = numr/1;
	        numr-=(I*1);
	        
	        
	        String original = "";
	        original = original + new String(new char[M]).replace("\0", "M");
	        original = original + new String(new char[CM]).replace("\0", "CM");
	        original = original + new String(new char[D]).replace("\0", "D");
	        original = original + new String(new char[CD]).replace("\0", "CD");
	        original = original + new String(new char[C]).replace("\0", "C");
	        original = original + new String(new char[XC]).replace("\0", "XC");
	        original = original + new String(new char[L]).replace("\0", "L");
	        original = original + new String(new char[XL]).replace("\0", "XL");
	        original = original + new String(new char[X]).replace("\0", "X");
	        original = original + new String(new char[IX]).replace("\0", "IX");
	        original = original + new String(new char[V]).replace("\0", "V");
	        original = original + new String(new char[IV]).replace("\0", "IV");
	        original = original + new String(new char[I]).replace("\0", "I");
			System.out.println("String: " + original);
	}

}
