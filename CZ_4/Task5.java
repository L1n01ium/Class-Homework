import java.util.regex.*;

public class Task5 {
	public static void main(String[] args) {
		String post = "Сегодня был в #парке и #кино #отдых #выходные";
		Pattern pattern = Pattern.compile("#[А-яа-я0-9]*");
		Matcher matcher = pattern.matcher(post);
		while (matcher.find()) {
			String found = matcher.group();
			System.out.println("Хештэг " + found);
		}
	}
}