public class ComplexVector2D {

	protected ComplexNumber x;
	protected ComplexNumber y;
	
	public ComplexVector2D() {
		this(new ComplexNumber(), new ComplexNumber());
	}
	
	public ComplexVector2D(ComplexNumber x, ComplexNumber y) {
		this.x = new ComplexNumber(x.getValid(), x.getImaginary());
		this.y = new ComplexNumber(y.getValid(), y.getImaginary());
	}
	
	public ComplexNumber getX() {
		return x;
	}
	
	public ComplexNumber getY() {
		return y;
	}
	
	public ComplexVector2D add(ComplexVector2D vector) {
		ComplexNumber newX = this.x.add(vector.x);
		ComplexNumber newY = this.y.add(vector.y);
		return new ComplexVector2D(newX, newY);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public ComplexNumber scalarProduct(ComplexVector2D vector) {
		return getX().mult(vector.getX()).add(getY().mult(vector.getY()));
	}
	
	public boolean equals(ComplexVector2D vector) {
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