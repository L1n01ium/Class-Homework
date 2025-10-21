import java.util.Scanner;

public class TextEditor {

	public static int findSubstring(String str_, String substr_) {
    for (int i = 0; i <= str_.length() - substr_.length(); i++) {
        boolean found = true;
        for (int j = 0; j < substr_.length(); j++) {
            if (str_.charAt(i + j) != substr_.charAt(j)) {
                found = false;
                break; 
            }
        }
        if (found) {
			return i;
		}
		}
    return -1;
	}
			
			
	public static String replaceSubstring(String str_,String substr_,String newsubstr_) {
		int lenSubstr = substr_.length();
		int index = findSubstring(str_, substr_);
		if (index == -1) {
			return "Такой подстроки не существует!";
		} 
		String strdo = "";
		String strafter = "";
		for (int i = 0; i < index; i++) {
			strdo += str_.charAt(i);
		}
		for (int i = index + lenSubstr; i < str_.length(); i++) {
			strafter += str_.charAt(i);
		}
		return strdo + newsubstr_ + strafter;
	}

	public static String splitWords(String str_) {
		int count = 1;
		for (int i = 0; i < str_.length(); i++) {
			if (str_.charAt(i) == ' ') {
				count++;
			}
		}
		String[] array = new String[count];
		for (int i = 0; i < count; i++) {
			array[i] = "";
		}
		int count2 = 0;
		for (int i = 0; i < str_.length(); i++) {
			if (str_.charAt(i) == ' ') {
				count2++;
			} else {
				array[count2] += str_.charAt(i);
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}
		return "";
	}
		
	public static String joinWords(String words_) {
		String result = "";
		for (int i = 0; i < words_.length(); i++) {
			if (words_.charAt(i) == ',') {
				result += ' ';
			} else {
				result += words_.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.println("Введите текст:");
		String str = mysc.nextLine();
		System.out.println("Выберите действие:");
		System.out.println("1. Найти подстроку");
		System.out.println("2. Заменить подстроку");
		System.out.println("3. Разбить строку на слова");
		System.out.println("4. Объединить слова в строку");
		System.out.println("0. Выход");
		String vb = mysc.nextLine();
		switch (vb) {
			case "1" -> {
				System.out.println("Введите подстроку:");
				String substr = mysc.nextLine();
				if (findSubstring(str, substr) != -1) {
					System.out.println("Результат: " + findSubstring(str, substr));
				} else {
					System.out.println("(");
				}
				break;
			}
			case "2" -> {
				System.out.println("Введите подстроку для замены:");
				String substr = mysc.nextLine();
				System.out.println("Введите новую подстроку:");
				String newsubstr = mysc.nextLine();
				System.out.println("Результат: " + replaceSubstring(str, substr, newsubstr));
				break;
			}
			case "3" -> System.out.println(splitWords(str));
			case "4" -> {
				System.out.println("Введите слова через запятую:");
				String words = mysc.nextLine();
				System.out.println("Результат: " + joinWords(words));
			}
			case "0" -> System.out.println("Пока");
		}
	}
}