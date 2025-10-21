import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.print("Введите кол-во строк: ");
		int str = mysc.nextInt();
		System.out.print("Введите кол-во столбцов: ");
		int stl = mysc.nextInt();
		mysc.nextLine();
		String[][] arr = new String[str][stl];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				System.out.print("Введите слова: ");
				arr[i][j] = mysc.nextLine();
			}
		}
		String[][] newarr = new String[stl][str];
		for (int i = 0; i < str; i++) {
			for (int j = 0; j < stl; j++) {
				newarr[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < stl; i++){
            for (int j = 0; j < str; j++){
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
	}
}
		