//Innlevering av Simen Faugli

package innlevering;

public class RationalNumber {
	private int numerator, denominator;
	
	public RationalNumber() {
		this(0, 1);
	}

	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}	
	
	public int getNumerator() {		
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public RationalNumber add(RationalNumber r) {
		if (r.denominator != denominator) {
			int leftDivider = this.denominator;
			int rightDivider = r.denominator;
			//Gange tellere med minste felles multiplum
			return new RationalNumber(numerator * leftDivider + r.numerator * rightDivider, 
					denominator * rightDivider);
		}
		//Teller minus teller mens nevner var lik fra begynnelsen.
		return new RationalNumber(numerator + r.numerator, r.denominator);
	}
		
	public RationalNumber subtract(RationalNumber r) {
		if (r.denominator != denominator) {
			int leftDivider = r.denominator;
			int rightDivider = this.denominator;
			return new RationalNumber(r.numerator * leftDivider - numerator * rightDivider, 
					r.denominator * rightDivider);
		}
		return new RationalNumber(numerator - r.numerator, r.denominator);
	}
	
	public RationalNumber multiply(RationalNumber r) {
		return new RationalNumber(this.numerator * r.numerator,
				this.denominator * r.denominator);
	}
	
	public RationalNumber divide(RationalNumber r) {
		//Snur broekverdi foer multiplisering
		RationalNumber inverted = new RationalNumber(r.denominator, r.numerator);
		return multiply(inverted);
	}
	
	public String toString() {
		if (denominator == 1) {
			//Konverterer int til String
			return Integer.toString(numerator);
		} else {
			return numerator + "/" + denominator;
		}
	}
}