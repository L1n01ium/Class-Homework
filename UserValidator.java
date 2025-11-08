import java.util.Scanner;

public class UserValidator {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		String str = mysc.nextLine();
		String regex = "^[А-ЯЁ][а-яё]{1,14}$";
		if (str.matches(regex)) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}