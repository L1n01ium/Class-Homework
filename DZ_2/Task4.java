import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int n = MySc.nextInt();
		int c = 1;
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			c *= i;
			sum += c;
		}
		System.out.println(sum);
	}
}