import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int n = MySc.nextInt();
		int c = 1;
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (long) n*c;
			c *= n;
		}
	System.out.println(sum);
	}
}