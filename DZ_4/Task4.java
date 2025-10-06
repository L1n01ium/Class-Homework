import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner MySc = new Scanner(System.in);
		System.out.print("Введите кол-во строк: ");
        int str = MySc.nextInt();
		System.out.print("Введите кол-во столбцов: ");
        int stl = MySc.nextInt();
        int kk = 0;
        int arr[][] = new int[str][stl];

        for (int i = 0 ; i < str; i++) {
            for (int j = 0 ; j < stl; j++) {
                arr[i][j] = MySc.nextInt();
            }
        }

        for (int i = 0 ; i < str; i++) {
            int k = 0;
            for (int j = 0 ; j < stl; j++) {
                if (vozr(arr[i][j])) {
                    k++;
                }
            }
            if (k==2) kk++;
        }

        if (kk == str) {
			System.out.println("All right");
		} else {
			System.out.println("All bad");
		}
        for (int i = 0 ; i < str; i++) {
            for (int j = 0 ; j < stl; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
	public static boolean vozr(int x){
        int pr = 10;
        while (x > 0) {
            if (x % 10 < pr) {
                pr = x % 10;
            } else {
				return false;
			}
			x/=10;
        }
        return true;
	}
}