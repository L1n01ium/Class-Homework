import java.util.Scanner;

public class Task1 {
	public static void main(String[] arhs) {
		Scanner mysc = new Scanner(System.in);
		String str = mysc.nextLine();
		int cnt = 0;
		String alf = "aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < alf.length(); j++) {
				if (str.charAt(i) == alf.charAt(j)) {
					cnt++;
				}
			}
		}
		if (cnt == str.length()) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}