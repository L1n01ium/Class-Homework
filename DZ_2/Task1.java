import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int n = MySc.nextInt();
		int m = MySc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
}