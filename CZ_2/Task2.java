import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner MySc = new Scanner(System.in);
        System.out.print("Введите длину");
        int n = MySc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = MySc.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            int n1 = arr[n-i-1];
            System.out.print(n1 + " ");
        }
    }
}
