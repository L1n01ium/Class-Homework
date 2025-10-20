import java.util.Scanner;

public class Task2 {

	public static double power(int num, int exp) {
		if (exp == 0) {
			return 1;
		}
		if (exp == 1) {
			return num;
		}
		double result = 1;
		for (int i = 0; i < exp; i++) {
			result *= num;
		}
		return exp > 0 ? result : 1 / result;
	}
	
	public static long fact(double num) {
		long res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.print("Введите число n: ");
		int n = mysc.nextInt();
		System.out.print("Введите число x: ");
		int x = mysc.nextInt();
		double sum = 0;
		for (int k = 1; k <= n; k++) {
			sum += power(-1,k) * ((k * power(x,k+2)) / fact(k+1));
		}
	System.out.println("результат: " + sum);
	}
}