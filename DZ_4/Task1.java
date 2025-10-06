import java.util.Scanner;

public class Task1 {

	public static boolean polindrome(int num) {
		int orig = num;
		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		return orig == reverse;
	}
	
	public static boolean check(int[][] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			int cnt = 0;
			for (int j = 0; j < arr1[i].length; j++) {
				if (polindrome(arr1[i][j])) {
					cnt++;
				}
			}
			if (cnt != 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		System.out.print("Введите кол-во строк: ");
		int str = MySc.nextInt();
		System.out.print("Введите кол-во столбцов: ");
		int stl = MySc.nextInt();
		int[][] arr = new int[str][stl];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				System.out.print("Введите числа: ");
				arr[i][j] = MySc.nextInt();
			}
		}
		boolean res = check(arr);
		if (res == true) {
			System.out.println("All right");
		} else {
			System.out.print("All bad");
		}
	}
}