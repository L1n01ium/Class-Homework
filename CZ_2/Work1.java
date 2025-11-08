import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner MySc = new Scanner(System.in);
		System.out.print("Введите кол-во строк: ");
		int n = MySc.nextInt();
		System.out.print("Введите кол-во столбцов: ");
		int m = MySc.nextInt();
		int[][] arr = new int[n][m];
		int[][] copyarr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = MySc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				copyarr[i][j] = arr[i][j] * 2;
			}
		}
		for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
		for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(copyarr[i][j] + " ");
            }
            System.out.println();
        }
	}
}