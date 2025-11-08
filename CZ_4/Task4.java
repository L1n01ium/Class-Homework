import java.util.regex.*;

public class Task4 {
	public static void main(String[] args) {
		String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
		Pattern pattern = Pattern.compile("[А-яа-я0-9,]+");
		Matcher matcher = pattern.matcher(csv);
		while (matcher.find()) {
			String found = matcher.group();
			System.out.println("Запись: " + found);
		}
	}
}