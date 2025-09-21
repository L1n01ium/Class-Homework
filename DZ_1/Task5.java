import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		float x = MySc.nextFloat();
		float y = MySc.nextFloat();
		int n = MySc.nextInt();
		if ((x <= n/2 && x >= -n/2) && (y<= n/2 && y >= -n/2)) {
			System.out.println("Точка попадает в квадрат");
		} else {
			System.out.println("Точка не попадает");
		}
	}
}