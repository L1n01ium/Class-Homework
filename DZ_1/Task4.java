import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		float a = MySc.nextFloat();
		float b = MySc.nextFloat();
		if (a == b) {
			System.out.println("Эти числа равны");
		} else {
			System.out.println("Эти числа не равны");
		}
	}
}