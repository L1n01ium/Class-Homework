import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		float a = MySc.nextFloat();
		float b = MySc.nextFloat();
		if (a > b) {
			System.out.println("Число " + a + " больше числа " + b);
		} else if (a < b) {
			System.out.println("Число " + b + " больше числа " + a);
		} else {
			System.out.println("Числа равны");
		}
	}
}