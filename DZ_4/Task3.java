import java.util.Scanner;

public class Task3 {
	
	public static int sum(int num) {
		int s = 0;
		while(num > 0) {
			s += num % 10;
			num /= 10;
		}
		return s;
	}
	
	public static boolean prost(int num) {
		if (num < 2) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i*i <= num; i+=2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}	
	
	public static boolean check(int[][] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr1[i].length; j++) {
				int num1 = arr1[i][j];
				if (prost(num1) && prost(sum(num1))) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
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
		if (res) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}