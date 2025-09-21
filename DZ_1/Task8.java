import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int k = MySc.nextInt();
		int n = 1;
		while (n < 10) {
			System.out.println(n + " * " + k + " = " + n*k);
			n++;
		}
	}
}