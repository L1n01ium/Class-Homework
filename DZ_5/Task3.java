import java.util.Scanner;

public class Task3 {
	
	public static boolean glas(String[][] arr_) {
		String alf = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
		int cnt = 0;
		for (int j = 0; j < arr_[0].length; j++) {
			boolean flag = false;
			for (int i = 0; i < arr_.length; i++) {
				String word = arr_[i][j];
				char lastChar = word.charAt(word.length() - 1);
				for (int k = 0; k < alf.length(); k++) {
					if (lastChar == alf.charAt(k)) {
							flag = true;
							break;
					}
				}
				if (flag) {
					break;
				}
			}
			if (flag != true) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.print("Введите кол-во строк: ");
		int str = mysc.nextInt();
		System.out.print("Введите кол-во столбцов: ");
		int stl = mysc.nextInt();
		mysc.nextLine();
		String[][] arr = new String[str][stl];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				System.out.print("Введите слова: ");
				arr[i][j] = mysc.nextLine();
			}
		}
		if (glas(arr) == true) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}