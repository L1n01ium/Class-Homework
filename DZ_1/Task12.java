import java.util.Scanner;

public class Task12{
    public static void main(String[] args){
        Scanner MySc = new Scanner(System.in);
        int i = MySc.nextInt();
        String b = "";
        while (i>0){
            String ch = String.valueOf(i%2);
            b += ch;
            i /=2;
        }
        //  ПЕРЕВЕРТЫШ
        String p = "";
        int d = b.length() - 1;
        while(d >= 0)
        {
            char si = b.charAt(d);
            p += si;
            d--;
        }
        System.out.print(p);
    }
}
