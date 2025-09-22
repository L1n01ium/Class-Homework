import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int a = 0;
		System.out.println("Введите размер массива");
		int n = MySc.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = MySc.nextInt();
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				continue;
			} if (mas[i] % 2 == 0) {
				a++;
			}
		}
		if (a >= 1) {
			System.out.println("Массив содержит хотя бы 1 четную цифру, их кол-во = " + a);
		} else {
			System.out.println("В массиве нет четных цифр");
		}
	}
}