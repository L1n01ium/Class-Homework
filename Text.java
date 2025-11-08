import java.util.Scanner;

public class Text {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String word = "";
    String digits = "0123456789";
    System.out.println();
    System.out.println("Email адреса: ");
    int k = 1;
    for(int i = 0; i < str.length() - 1; i++) {
      if (((str.charAt(i) != ' ') && (str.charAt(i) != ',')) && !((str.charAt(i) == '.') && (str.charAt(i + 1) == ' '))) {
        word += str.charAt(i);
      } else if (findEmails(word)) {
        System.out.println(k + ". " + word);
        k++;
        word = "";
      } else {
        word = "";
      }
    }


    System.out.println();
    System.out.println("Даты: ");
    int m = 1;
    for(int i = 0; i < str.length() - 1; i++) {
      if (((str.charAt(i) != ' ') && (str.charAt(i) != ',')) && !((str.charAt(i) == '.') && (str.charAt(i + 1) == ' '))) {
        word += str.charAt(i);
      } else if (findDates(word)) {
        System.out.println(m + ". " + word);
        m++;
        word = "";
      } else {
        word = "";
      }
    }

    System.out.println();
    System.out.println("Слова с заглавной буквы: ");
    int d = 1;
    for(int i = 0; i < str.length() - 1; i++) {
      if (((str.charAt(i) != ' ') && (str.charAt(i) != ',')) && (str.charAt(i) != ':') && (str.charAt(i) != '"')
        && !((str.charAt(i) == '.') && (str.charAt(i + 1) == ' ')) && (i > 2 && str.charAt(i - 2) != '.')) {
        word += str.charAt(i);
      } else if (findCapitalizedwords(word)) {
        System.out.println(d + ". " + word);
        d++;
        word = "";
      } else {
        word = "";
      }
    }

    System.out.println();
    int cnt = 0;
    for(int i = 0; i < str.length(); i++) {
      for(int j = 0; j < digits.length(); j++) {
        if (str.charAt(i) == digits.charAt(j)) {
          cnt++;
        }
      }
    }
    System.out.println("Общее количество цифр: " + cnt);
  }



  public static boolean findEmails(String text) {
    return text.matches("[a-zA-Z0-9_%+-.]+@[a-zA-Z0-9.,-]{2,}");
  }

  public static boolean findDates(String text) {
    return text.matches("([0-2][0-9]|3[0-1])\\.(0[1-9]|1[1-2])\\.(19[0-9][0-9]|20[0-9][0-9])");

  }

  public static boolean findCapitalizedwords(String text) {
    return text.matches("[А-ЯA-Z][а-яa-z-]*");

  }
}
