import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        String str = "Быстрая рыжая собака перепрыгнула через ленивого Аскара";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                k++;
            }
        }
        String spis[] = new String[k + 1];
        String word = "";
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (curChar != ' ') {
                word += curChar;
            }
            if ((curChar == ' ' || i == str.length() - 1)) {
                spis[cnt] = word;
                cnt++;
                word = "";
            }
        }
        int maxlen = -10000;
        String maxword = "";
        String alf = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (int i = 0; i < k + 1; i++) {
            String curword = spis[i];
            int sc = 0;
            for (int j = 0; j < spis[i].length(); j++) {
                char curChar = spis[i].charAt(j);
                for (int c = 0; c < alf.length(); c++) {
                    if (curChar == alf.charAt(c)) {
                        sc++;
                        break;
                    }
                }
            }
            if (maxlen < sc) {
                maxlen = sc;
                maxword = cursword;
            }
        }
        System.out.println(maxword);
    }

}
