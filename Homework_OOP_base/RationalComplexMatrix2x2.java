public class RationalComplexMatrix2x2 {
	
	protected RationalComplexNumber[][] matrix;
	
	public RationalComplexMatrix2x2() {
		this(new RationalComplexNumber());
	}
	
	public RationalComplexMatrix2x2(RationalComplexNumber x) {
		matrix = new RationalComplexNumber[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
					matrix[i][j] = new RationalComplexNumber(
						new RationalFraction(x.getValid().getNum1(), x.getValid().getNum2()),
						new RationalFraction(x.getImaginary().getNum1(), x.getImaginary().getNum2())
					);
			}
		}
	}
	
	public RationalComplexMatrix2x2(RationalComplexNumber a, RationalComplexNumber b, RationalComplexNumber c, RationalComplexNumber d) {
		matrix = new RationalComplexNumber[2][2];
		matrix[0][0] = new RationalComplexNumber(
			new RationalFraction(a.getValid().getNum1(), a.getValid().getNum2()),
			new RationalFraction(a.getImaginary().getNum1(), a.getImaginary().getNum2())
		);
		matrix[0][1] = new RationalComplexNumber(
			new RationalFraction(b.getValid().getNum1(), b.getValid().getNum2()),
			new RationalFraction(b.getImaginary().getNum1(), b.getImaginary().getNum2())
		);
		matrix[1][0] = new RationalComplexNumber(
			new RationalFraction(c.getValid().getNum1(), c.getValid().getNum2()),
			new RationalFraction(c.getImaginary().getNum1(), c.getImaginary().getNum2())
		);
		matrix[1][1] = new RationalComplexNumber(
			new RationalFraction(d.getValid().getNum1(), d.getValid().getNum2()),
			new RationalFraction(d.getImaginary().getNum1(), d.getImaginary().getNum2())
		);
	}
	
	public RationalComplexMatrix2x2 add(RationalComplexMatrix2x2 other) {
		RationalComplexMatrix2x2 res = new RationalComplexMatrix2x2();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				res.matrix[i][j] = this.matrix[i][j].add(other.matrix[i][j]);
			}
		}
		return res;
	}
	
	public RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2 other) {
		RationalComplexMatrix2x2 res = new RationalComplexMatrix2x2();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				RationalComplexNumber sum = new RationalComplexNumber();
				for (int k = 0; k < 2; k++) {
					RationalComplexNumber product = this.matrix[i][k].mult(other.matrix[k][j]);
					sum = sum.add(product);
				}
				res.matrix[i][j] = sum;
			}
		}
		return res;
	}
	
	public RationalComplexNumber det() {
		RationalComplexNumber ad = matrix[0][0].mult(matrix[1][1]);
		RationalComplexNumber bc = matrix[0][1].mult(matrix[1][0]);
		return ad.sub(bc);
	}
	
	public RationalComplexVector2D multVector(RationalComplexVector2D vector) {
		RationalComplexNumber x = matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY()));
		RationalComplexNumber y = matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY()));
		return new RationalComplexVector2D(x, y);
	}
}