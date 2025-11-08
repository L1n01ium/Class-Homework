import java.util.regex.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		String text = String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\", потом: \"Отлично!\"";
		Pattern pattern = Pattern.compile("\"(.+?)\"");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			String foundcit = matcher.group();
			System.out.println("Цитата: " + foundcit);
		}
	}
}