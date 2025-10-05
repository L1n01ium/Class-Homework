import java.util.Scanner;

public class Task3 {
	
	public static boolean del5(int num) {
		int s = 0;
		while (num > 0) {
			s += (num % 10);
			num /= 10;
		}
		if (s % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean check(int[][] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			int cnt = 0;
			for (int j = 0; j < arr1[i].length; j++) {
				if (del5(arr1[i][j])) {
					cnt++;
				}
			}
			if (cnt < 2) {
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