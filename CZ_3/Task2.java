import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Введите слово");
        String str = mysc.nextLine();
        String alf = "aeiouAEIOU";
        int cnt = 0;

        for (int i = 0; i < str.length() ; i++){
            for (int j = 0; j < alf.length() ; j++){
                if (str.charAt(i) == alf.charAt(j)){
                    cnt++;
                }

            }

        }
        if (cnt == 3) {
            System.out.println("All right");
        } else {
            System.out.println("All bad");

        }
    }
}
