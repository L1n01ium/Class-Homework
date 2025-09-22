import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		int a = -100;
		System.out.println("Введите размер массива");
		int n = MySc.nextInt();
		int[] mas = new int[n];
		System.out.println("Введите элементы массива");
		for (int i = 0; i < n; i++) {
			mas[i] = MySc.nextInt();
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > a) {
				a = mas[i];
			}
		}
	System.out.println("Максимальный элемент массива = " + a);
	}
}