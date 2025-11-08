import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = 5;
        int z = 0;
        String arr[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "IString ";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < n; j++) {
            int y = 0;
            for (int i = 0; i < n; i++) {
                if (glas(arr[i][j])) {
                    y++;
                }
            }
            if (y >= 1) {
                z++;
            }
        }
        if (z == n) {
            System.out.println("All right");
        } else {
            System.out.println("All bad");
        }


    }

    public static boolean glas(String str) {
        int k = 0;
        String alf = "EYUIAO";
        for (int j = 0; j < alf.length(); j++) {
            if (str.charAt(0) == alf.charAt(j)) {
                k++;
            }
        }
        if (k == 1) {
            return true;
        } else {
            return false;
        }
    }
}