import java.util.regex.*;

public class Task2 {
	public static void main(String[] args) {
		String text = """
		[ERROR] 2024-01-15: Connection failed
		[INFO] 2024-01-15: User logged in
		[DEBUG] 2024-01-15: Processing request
		[ERROR] 2024-01-15: Database timeout
		""";
		Pattern pattern = Pattern.compile("\\[ERROR]\\ (.+)");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			String found = matcher.group();
			System.out.println("Ошибки: " + found);
		}
	}
}