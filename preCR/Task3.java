import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		int n = mysc.nextInt();
		int max = 0;
		int[] maxarr = new int[n];
		for (int i = 0; i < n; i++) {
			int [] arr = new int[n];
			int summ = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = mysc.nextInt();
				summ += arr[j];
			}
			if (summ > max) {
				max = summ;
				maxarr = arr;
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.print(maxarr[k] + " ");
		}
	}
}