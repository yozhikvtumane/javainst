package zlomky;

public class Fraction {

	private int numerator; //citatel
	private int denonimator = 1; //jmenovatel
	
	public Fraction() {
		
	}
	
	public Fraction( int numerator, int denonimator) {
		this.numerator = numerator;
		//this.denonimator = denonimator;
		this.setDenonimator(denonimator);
	}
	
	public int getNumerator (){
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenonimator (){
		return denonimator;
	}

	public void setDenonimator(int denonimator) {
		if (denonimator == 0) {
			//chyba
			throw new IllegalArgumentException("Denominater must be non-zero");
			//utece z metody  pryc
		}
		
		this.denonimator = denonimator;
	}

	public Fraction multiply(Fraction f2) {
		return new Fraction(numerator * f2.numerator, denonimator * f2.denonimator);
	}
	
	public void normalize() {
		// find greatest common devider
		//int devider = gcd();
		//numerator = numerator/devider;
		//denonimator = denonimator/devider;
		//vydelime citatele delitele
		//vydelime jmenovatele delitelem
		
	}

	//public int gcd() {   // 2/4, 3/6, 2/8
		
		//int a = numerator;
		//int b = denonimator;
		
//		while (a != b) {
//			if (a > b) {
//				a = a-b;
//			} else {
//				b = b - a; 
//			}
//		}
//		return a;
		
//		if ( (b % a) !=0 ) {
//			return a;
//		}
		//while ( a != b ) {
			
		//}
	//}
	
	public String toString() {
		return numerator + "/" + denonimator;
	}
}

