import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int k = MySc.nextInt();
		int s = 0;
		int ork = k;
		while (ork > 0) {
			s = s + ork % 10;
			ork /= 10;
		}
		System.out.println(s);
	}
}