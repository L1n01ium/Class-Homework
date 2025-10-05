import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		System.out.println("Введите кол-во строк");
		int str = MySc.nextInt();
		System.out.println("Введите кол-во столбцов");
		int stl = MySc.nextInt();
		int[][] arr = new int[str][stl];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				System.out.println("Введите числа");
				arr[i][j] = MySc.nextInt();
			}
		}
		int cnt = 0;
		for (int i = 0; i < str; i++) {
			int k = 0;
			for (int j = 0; j < stl; j++) {
				if (arr[i][j] % 3 == 0) {
					k++;
				}
			}
			if (k == stl) {
				cnt ++;
				k = 0;
			} else {
				k = 0;
			}
		}
		if (cnt > 0) {
			System.out.println("Есть");
		} else {
			System.out.println("Нет");
		}
	}
}