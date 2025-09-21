import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int n = MySc.nextInt();
		int c = 1;
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += 2*c;
			c *=2;
		}
		System.out.println(sum);
	}
}