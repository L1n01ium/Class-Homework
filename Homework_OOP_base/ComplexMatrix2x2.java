public class ComplexMatrix2x2 {

	protected ComplexNumber[][] matrix;
	
	public ComplexMatrix2x2() {
		this(new ComplexNumber());
	}
	
	public ComplexMatrix2x2(ComplexNumber x) {
		matrix = new ComplexNumber[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrix[i][j] = new ComplexNumber(x.getValid(), x.getImaginary());
			}
		}
	}
	
	public ComplexMatrix2x2(ComplexNumber a, ComplexNumber b, ComplexNumber c, ComplexNumber d) {
		matrix = new ComplexNumber[2][2];
		matrix[0][0] = new ComplexNumber(a.getValid(), a.getImaginary());
		matrix[0][1] = new ComplexNumber(b.getValid(), b.getImaginary());
		matrix[1][0] = new ComplexNumber(c.getValid(), c.getImaginary());
		matrix[1][1] = new ComplexNumber(d.getValid(), d.getImaginary());
	}
	
	public ComplexMatrix2x2 add(ComplexMatrix2x2 other) {
		ComplexMatrix2x2 res = new ComplexMatrix2x2();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				res.matrix[i][j] = this.matrix[i][j].add(other.matrix[i][j]);
			}
		}
		return res;
	}
	
	public ComplexMatrix2x2 mult(ComplexMatrix2x2 other) {
		ComplexMatrix2x2 res = new ComplexMatrix2x2();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				ComplexNumber sum = new ComplexNumber();
				for (int k = 0; k < 2; k++) {
					ComplexNumber product = this.matrix[i][k].mult(other.matrix[k][j]);
					sum = sum.add(product);
				}
				res.matrix[i][j] = sum;
			}
		}
		return res;
	}
	
	public ComplexNumber det() {
		return (matrix[0][0].mult(matrix[1][1]).sub(matrix[0][1].mult(matrix[1][0])));
	}
	
	public ComplexVector2D multVetor(ComplexVector2D vector) {
		ComplexNumber x = matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY()));
		ComplexNumber y = matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY()));
		return new ComplexVector2D(x, y);
	}
}