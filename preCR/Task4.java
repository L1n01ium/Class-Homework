import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		String str = mysc.nextLine();
		String alfgl = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
		String alfsogl = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
		boolean flag = true;
		for (int i = 0; i < str.length() - 1; i++) {
			if (alfgl.indexOf(str.charAt(i)) != -1) {
				if (alfsogl.indexOf(str.charAt(i+1)) != -1) {
				} else {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}