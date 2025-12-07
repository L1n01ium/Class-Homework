public class RationalComplexNumber {
	
	protected RationalFraction valid;
	protected RationalFraction imaginary;
	
	public RationalComplexNumber() {
		this(new RationalFraction(), new RationalFraction());
	}
	
	public RationalComplexNumber(RationalFraction x, RationalFraction y) {
		this.valid = new RationalFraction(x.getNum1(), x.getNum2());
		this.imaginary = new RationalFraction(y.getNum1(), y.getNum2());
	}
	
	public RationalFraction getValid() {
		return valid;
	}
	
	public RationalFraction getImaginary() {
		return imaginary;
	}
	
	public RationalComplexNumber add(RationalComplexNumber other) {
		RationalFraction newValid = getValid().add(other.getValid());
		RationalFraction newImaginary = getImaginary().add(other.getImaginary());
		return new RationalComplexNumber(newValid, newImaginary);
	}
	
	public RationalComplexNumber sub(RationalComplexNumber other) {
		RationalFraction newValid = getValid().sub(other.getValid());
		RationalFraction newImaginary = getImaginary().sub(other.getImaginary());
		return new RationalComplexNumber(newValid, newImaginary);
	}
	
	public RationalComplexNumber mult(RationalComplexNumber other) {
		// (a+bi)*(c+di) = (ac - bd) + (ad + bc)i
		RationalFraction newValid = getValid().mult(other.getValid()).sub(getImaginary().mult(other.getImaginary()));
		RationalFraction newImaginary = getValid().mult(other.getImaginary()).add(getImaginary().mult(other.getValid()));
		return new RationalComplexNumber(newValid, newImaginary);
	}
	
	public String toString() {
        if (getValid().getNum1() == 0) {
            if (getImaginary().getNum1() != 0) {
                return getImaginary() + "i";} else return "0";
        }
        else {
            if (getImaginary().getNum1() != 0) {
                return getValid() + (getImaginary().getNum1	() > 0 ? " + " + getImaginary() + "i" : getImaginary() + "i");}
            else {return "0";}
        }
    }
}