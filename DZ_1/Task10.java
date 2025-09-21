import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int n = MySc.nextInt();
		int k = 1;
		System.out.print(n + " = ");
		while (n > 0) {
			if (n % 10 != 0) {
				System.out.print(n % 10 * k + " + ");
			}
			n /= 10;
			k *= 10;
			if (n % 10 == 0) {
				n /= 10;
				k *= 10;
			}
		}
	}
}