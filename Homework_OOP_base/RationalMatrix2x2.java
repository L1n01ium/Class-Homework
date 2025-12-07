public class RationalMatrix2x2 {

	protected RationalFraction[][] matrix;
	
	public RationalMatrix2x2() {
		this(new RationalFraction(0, 1));
	}
	
	public RationalMatrix2x2(RationalFraction x) {
		this(x, x, x, x);
	}
	
	public RationalMatrix2x2(RationalFraction x1, RationalFraction x2, RationalFraction x3, RationalFraction x4) {
		matrix = new RationalFraction[2][2];
		matrix[0][0] = new RationalFraction(x1.getNum1(), x1.getNum2());
		matrix[0][1] = new RationalFraction(x2.getNum1(), x2.getNum2());
		matrix[1][0] = new RationalFraction(x3.getNum1(), x3.getNum2());
		matrix[1][1] = new RationalFraction(x4.getNum1(), x4.getNum2());
	}
	
	public RationalMatrix2x2 add(RationalMatrix2x2 other) {
		RationalMatrix2x2 res = new RationalMatrix2x2();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				res.matrix[i][j] = this.matrix[i][j].add(other.matrix[i][j]);
			}
		}
		return res;
	}
	
	public RationalMatrix2x2 mult(RationalMatrix2x2 other) {
		RationalMatrix2x2 res = new RationalMatrix2x2();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				RationalFraction sum = new RationalFraction(0, 1);
				for (int k = 0; k < 2; k++) {
					RationalFraction product = this.matrix[i][k].mult(other.matrix[k][j]);
					sum = sum.add(product);
				}
				res.matrix[i][j] = sum;
			}
		}
		return res;
	}
	
	public RationalFraction det() {
		return (matrix[0][0].mult(matrix[1][1]).sub(matrix[0][1].mult(matrix[1][0])));
	}
	
	public RationalVector2D multVector(RationalVector2D vector) {
		RationalFraction x = matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY()));
		RationalFraction y = matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY()));
		return new RationalVector2D(x, y);
	}
}