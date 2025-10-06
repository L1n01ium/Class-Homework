import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner MySc = new Scanner(System.in);
        int n = MySc.nextInt();
        int num = 0;
        int[][] array = new int[n][n];
        int flag = 0;
        
        for (int i = 0; i < n; i++) {
            array[i][n / 2] = 1;
            
            for (int j = 0; j <= num; j++) {
                array[i][n / 2 - j] = 1;
                array[i][n / 2 + j] = 1;
            }
            
            for (int z = 0; z < n; z++) {
               System.out.print(array[i][z]); 
            }
            System.out.println("");
            
            if (num >= (n / 2)) {
                flag = 1;
            }
            
            if (flag == 1) {
                num--;
            } else {
                num++;
            }
        }
    }
}
