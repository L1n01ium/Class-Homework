import java.util.Scanner;

public class Task1 {
	
	public static int numb(int num) {
		int k = 0;
		while (num > 0) {
			k++;
			num /= 10;
		}
		return k;
	}
	
	public static int chec(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (numb(arr[i]) % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
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
		if (chec(arr) == (arr.length-chec(arr))) {
			System.out.println("All good");
		} else {
			System.out.println("All bad");
		}
	}
}