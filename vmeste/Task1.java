import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int stroka = scanner.nextInt();
		int stolbec = scanner.nextInt();
		int[][] array = new int[stroka][stolbec];
		for (int i = 0; i < stroka; i++){
			for (int j = 0; j < stolbec; j++){
				System.out.println("Введи число для индекса [" + stroka + "] [" + stolbec + "]");
				array[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < stroka; i++){
			for (int j = 0; j < stolbec; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < stroka; i++)
	}
}