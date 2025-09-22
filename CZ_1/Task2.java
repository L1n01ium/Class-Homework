import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		System.out.print("Введите размер массива mas:");
		int n = MySc.nextInt();
		int[] mas = new int[n];
		int[] arr = new int[n];
		int a = 0;
		System.out.println("Введите элементы массива mas");
		for (int i = 0; i < n; i++) {
			mas[i] = MySc.nextInt();
		}
		System.out.println("Введите элементы массива arr");
		for (int i = 0; i < n; i++) {
			arr[i] = MySc.nextInt();
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == arr[i]) {
				a++;
			}
		}
		if (a == n) {
			System.out.println("Массивы равны");
		} else {
			System.out.println("Массивы не равны");
		}
	}
}