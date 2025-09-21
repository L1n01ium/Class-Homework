import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		float a = MySc.nextFloat();
		float b = MySc.nextFloat();
		float c = MySc.nextFloat();
		if (a > b && a > c) {
			System.out.println(a + " Наибольший");
		} else if (b > a && b > c) {
			System.out.println(b + " Наибольший");
		} else if (c > a && c > b) {
			System.out.println(c + " Наибольший");
		}
	}
}