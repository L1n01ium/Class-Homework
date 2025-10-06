import java.util.Scanner;

public class Task2 {
	
	public static int sum(int num) {
		int s = 0;
		while (num > 0) {
			s += num % 10;
			num /= 10;
		}
		return s;
	}
	
	public static boolean check(int[][] arr1) {
		int str1 = arr1.length;
		int stl1 = arr1[0].length;
		for (int j = 0; j < stl1; j++) {
			boolean flag = true;
			int firsum = sum(arr1[0][j]);
			for (int i = 1; i < str1; i++) {
				int sum1 = sum(arr1[i][j]);
				if (sum1 != firsum) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return true;
			}
		}
		return false;
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
		if (res) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}