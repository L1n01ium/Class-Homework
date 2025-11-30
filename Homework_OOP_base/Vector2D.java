import java.lang.Math;

public class Vector2D {
	
	protected double coord1;
	protected double coord2;
	
	public Vector2D() {
		this(0.0, 0.0);
	}
	
	public Vector2D(double coord1, double coord2) {
		this.coord1 = coord1;
		this.coord2 = coord2;
	}
	
	public Vector2D add(Vector2D new1) {
		return new Vector2D(this.getCoord1() + new1.getCoord1(), this.getCoord2() + new1.getCoord2());
	}
	
	public void add2(Vector2D new1) {
		this.coord1 += new1.getCoord1();
		this.coord2 += new1.getCoord2();
	}
	
	public Vector2D sub(Vector2D new1) {
		return new Vector2D(this.getCoord1() - new1.getCoord1(), this.getCoord2() - new1.getCoord2());
	}
	
	public void sub2(Vector2D new1) {
		this.coord1 -= new1.getCoord1();
		this.coord2 -= new1.getCoord2();
	}
	
	public Vector2D mult(double num) {
		return new Vector2D(this.getCoord1() * num, this.getCoord2() * num);
	}
	
	public void mult2(double num) {
		this.coord1 *= num;
		this.coord2 *= num;
	}
	
	public String toString() {
		return coord1 + ", " + coord2;
	}
	
	public double length() {
		return Math.sqrt(coord1 * coord1 + coord2 * coord2);
	}
	
	public double scalarProduct(Vector2D new1) {
		return getCoord1() * new1.getCoord1() + getCoord2() * new1.getCoord2();
	}
	
	public double cos(Vector2D new1) {
		double product = scalarProduct(new1);
        double lengthProduct = length() * new1.length();
        return product / lengthProduct;
	}
	
	public boolean equals(Vector2D new1) {
		return (coord1 == new1.getCoord1()) && (coord2 == new1.getCoord2());
	}
	
	public double getCoord1() {
		return coord1;
	}
	
	public double getCoord2() {
		return coord2;
	}
	
	public void setCoord1(double newCoord1) {
		this.coord1 = newCoord1;
	}
	
	public void setCoord2(double newCoord2) {
		this.coord2 = newCoord2;
	}
}