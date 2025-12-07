public class RationalVector2D {
	
	protected RationalFraction x;
	protected RationalFraction y;
	
	public RationalVector2D() {
		this(new RationalFraction(), new RationalFraction());
	}
	
	public RationalVector2D(RationalFraction x, RationalFraction y) {
		this.x = new RationalFraction(x.getNum1(), x.getNum2());
		this.y = new RationalFraction(y.getNum1(), y.getNum2());
	}
	
	public RationalFraction getX() {
		return x;
	}
	
	public RationalFraction getY() {
		return y;
	}
	
	public void setX(RationalFraction newX) {
		this.x = newX;
	}
	
	public void setY(RationalFraction newY) {
		this.y = newY;
	}
	
	public RationalVector2D add(RationalVector2D other) {
		RationalFraction newX = this.x.add(other.x);
		RationalFraction newY = this.y.add(other.y);
		return new RationalVector2D(newX, newY);
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double length() {
		RationalFraction xSqrt = x.mult(x);
		RationalFraction ySqrt = y.mult(y);
		RationalFraction sum = xSqrt.add(ySqrt);
		return square(sum.value());
	}
	
	public RationalFraction scalarProduct(RationalVector2D vector) {
		return getX().mult(vector.getX()).add(getY().mult(vector.getY()));
	}	
	
	public boolean equals(RationalVector2D vector) {
		return getX().equals(vector.getX()) && getY().equals(vector.getY());
	}
	
	public static double square(double number){
		double t;
		double squareroot = number / 2;
		do {
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		} while ((t - squareroot) != 0);
			return squareroot;
	}
}