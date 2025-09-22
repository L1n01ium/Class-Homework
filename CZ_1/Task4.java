import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int a = 0;
		System.out.print("Введите размер массива:");
		int n = MySc.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = MySc.nextInt();
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				a++;
			}
		}
		if (a >= 2) {
			System.out.println("в массиве целых чисел существует не менее двух отрицательных чисел");
		} else {
			System.out.println("в массиве меньше 2 отриц чисел");
		}
	}
}