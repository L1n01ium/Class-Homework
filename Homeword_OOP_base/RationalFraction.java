public class RationalFraction {

	protected int num1;
	protected int num2;
	
	public RationalFraction() {
		this(0, 1);
	}
	
	public RationalFraction(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum1(int newNum1) {
		this.num1 = newNum1;
	}
	
	public void setNum2(int newNum2) {
		this.num2 = newNum2;
	}
	
	public void reduce() {
		while (true) {
            boolean flag = false;
            for (int i = 1; i < (a < b ? a : b); i++) {
                 if (a % i == 0 && b % i == 0) {
                     a = a / i;
                     b = b / i;
                     flag = true;
                     break;
                 }
            }
            if (!flag) {break;}
        }
	}
	
	public RationalFraction add(RationalFraction other) {
		return new RationalFraction(getNum1() * other.getNum2() + other.getNum1() * getNum2(), getNum2() * other.getNum2());
	}
	
	public void add2(RationalFraction other) {
		setNum1(getNum1() * other.getNum2() + other.getNum1() * getNum2());
		setNum2(getNum2() * other.getNum2());
		reduce();
	}
	
	public RationalFraction sub(RationalFraction other) {
		return new RationalFraction(getNum1() * other.getNum2() - other.getNum1() * getNum2(), getNum2() * other.getNum2());
	}
	
	public void sub2(RationalFraction other) {
		setNum1(getNum1() * other.getNum2() - other.getNum1() * getNum2());
		setNum2(getNum2() * other.getNum2());
		reduce();
	}
	
	public RationalFraction mult(RationalFraction other) {
		return new RationalFraction(getNum1() * other.getNum1(), getNum2() * other.getNum2());
	}
	
	public void mult2(RationalFraction other) {
		setNum1(getNum1() * other.getNum1());
		setNum2(getNum2() * other.getNum2());
		reduce();
	}
	
	public RationalFraction div(RationalFraction other) {
		return new RationalFraction(getNum1() * other.getNum2(), getNum2() * other.getNum1());
	}
	
	public void div2(RationalFraction other) {
		setNum1(getNum1() * other.getNum2());
		setNum2(getNum2() * other.getNum1());
		reduce();
	}
	
	public String toString() {
		return getNum1() + "/" + getNum2();
	}
	
	public double value() {
		return ((double) getNum1()) / ((double) getNum2());
	}
	
	public boolean equals(RationalFraction other) {
		return getNum1() == other.getNum1() && getNum2() == other.getNum2();
	}
	
	public int numberPart() {
		reduce getNum1() / getNum2();
	}
}