import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		float x = MySc.nextFloat();
		float y = MySc.nextFloat();
		int r = MySc.nextInt();
		if (x*x + y*y < r*r) {
			System.out.println("Попадает");
		} else if (x*x + y*y == r*r) {
			System.out.println("Лежит на круге");
		} else {
			System.out.println("Не попадает");
		}
	}
}