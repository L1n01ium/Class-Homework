public class RationalComplexVector2D {
	
	protected RationalComplexNumber x;
	protected RationalComplexNumber y;
	
	public RationalComplexVector2D() {
		this(new RationalComplexNumber(), new RationalComplexNumber());
	}
	
	public RationalComplexVector2D(RationalComplexNumber x, RationalComplexNumber y) {
		this.x = new RationalComplexNumber(new RationalFraction(x.getValid().getNum1(), x.getValid().getNum2()),
			new RationalFraction(x.getImaginary().getNum1(), x.getImaginary().getNum2()));
		this.y = new RationalComplexNumber(new RationalFraction(y.getValid().getNum1(), y.getValid().getNum2()),
			new RationalFraction(y.getImaginary().getNum1(), y.getImaginary().getNum2()));
	}
	
	public RationalComplexNumber getX() {
		return x;
	}
	
	public RationalComplexNumber getY() {
		return y;
	}
	
	public RationalComplexVector2D add(RationalComplexVector2D other) {
		RationalComplexNumber newX = getX().add(other.getX());
		RationalComplexNumber newY = getY().add(other.getY());
		return new RationalComplexVector2D(newX, newY);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public RationalComplexNumber scalarProduct(RationalComplexVector2D other) {
		return getX().mult(other.getX()).add(getY().mult(other.getY()));
	}
}