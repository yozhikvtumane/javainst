package fraction;

import static org.junit.Assert.*;

import org.junit.Test;

import zlomky.Fraction;
public class TestFraction {

	@Test
	public void testMultiply() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(2, 3);
		Fraction f3 = f1.multiply(f2);
		assertEquals(2, f3.getNumerator());
		assertEquals(6, f3.getDenonimator());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroDenominatorViaSetter() {
		Fraction  f = new Fraction();
		f.setDenonimator(0); //tady ma nastat vyjimka
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroDenominatorViaConstructor() {
		Fraction  f = new Fraction(1, 0);
		//tady ma nastat vyjimka
	}
	
	
	@Test
	public void testNonZeroDenominatorViaDefaultConstructor() {
		Fraction f  = new Fraction();
		assertNotEquals(0, f.getDenonimator());
	}
	
	@Test
	public void testNormalize() {
		Fraction f = new Fraction(2, 4);
		f.normalize(); //zkratit zlomek (zmeni citatele a jmenovatele)
		assertEquals( 1, f.getNumerator() );
		assertEquals( 2, f.getDenonimator() );
	}
	
}

//throw, cath, illegalargumentexception
//konstruktory
//vyzov metody
//stack trace