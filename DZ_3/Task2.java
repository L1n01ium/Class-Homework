import java.util.Scanner;
public class Task2 {
	public static boolean chetn(int num) {
		while (num > 0) {
			if ((num % 10) % 2 == 0) {
				return true;
			}
			num /= 10;
		}
		return true;
	}
	
	public static boolean check(int[][] arr_) {
		for (int i = 0; i < arr_.length; i++) {
			int k = 0;
			for (int j = 0; j < arr_[i].length; j++) {
				if (chetn(arr_[i][j])) {
					k++;
				}
			}
			if (k != 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		System.out.print("Введите кол-во строк");
		int str = MySc.nextInt();
		System.out.print("Введите кол-во столбцов");
		int stl = MySc.nextInt();
		int[][] arr = new int[str][stl];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				System.out.println("Введите числа");
				arr[i][j] = MySc.nextInt();
			}
		}
		boolean res = check(arr);
		if (res == true) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}