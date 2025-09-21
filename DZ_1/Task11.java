import java.util.Scanner;

public class Task11{
    public static void main(String[] args){
        Scanner MySc = new Scanner(System.in);
        int b = MySc.nextInt();
        int i = 0;
        int k = 1;
        while (b > 0) {
            i += b % 10 * k;
            k *= 2;
            b /= 10;
        }
        System.out.println(i);
    }
}
