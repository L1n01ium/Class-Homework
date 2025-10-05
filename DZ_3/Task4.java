import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		System.out.print("Введите кол-во строк");
		int str = MySc.nextInt();
		System.out.print("Введите кол-во столбцов");
		int stl = MySc.nextInt();
		int[][] arr = new int[str][stl];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				if (i == j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}