import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String str = mysc.nextLine();
		boolean flag = false;
		for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                flag = true;
            }
        }
        System.out.println(flag);
	}
}