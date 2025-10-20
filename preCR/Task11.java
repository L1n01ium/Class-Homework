import java.util.Scanner;

public class Task11 {
	
	public static int summ(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		int n = mysc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите числа: ");
			arr[i] = mysc.nextInt();
		}
		boolean flag = false;
		if (summ(arr[0]) == summ(arr[arr.length - 1])) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
	}
}