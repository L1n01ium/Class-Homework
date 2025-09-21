import java.util.Scanner;

public class Task7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        float r = x*x+y*y;
        System.out.println("r^2="+r);
        if (r <= 1)
        {
            System.out.println("кружок №1");
        } else if (r >1 && r <= 2*2) {
            System.out.println("кружок №2");
        } else if (r > 2*2 && r <= 3*3) {
            System.out.println("кружок №3");
        }else if (r > 3*3 && r <= 4*4) {
            System.out.println("кружок №4");
        }else if (r > 4*4 && r <= 5*5) {
            System.out.println("кружок №5");
        }else if (r > 5*5 && r <= 6*6) {
            System.out.println("кружок №6");
        }else if (r > 6*6 && r <= 7*7) {
            System.out.println("кружок №7");
        }else if (r > 7*7 && r <= 8*8) {
            System.out.println("кружок №8");
        }else if (r > 8*8 && r <= 9*9) {
            System.out.println("кружок №9");
        }else if (r > 9*9 && r <= 10*10) {
            System.out.println("кружок №102");
        }else  {
            System.out.println("missed");
        }
    }
}
