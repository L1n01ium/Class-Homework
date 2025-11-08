public class TextAnalyzer {

    public static void findEmails(String text) {
        System.out.println("Email-адреса:");
        String[] words = splitText(text);
        int count = 0;
        
        for (String word : words) {
            String cleanWord = removePunctuation(word);
            if (cleanWord.matches("[a-zA-Z0-9.%+_-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                count++;
                System.out.println("  " + count + ". " + cleanWord);
            }
        }
        
        if (count == 0) {
            System.out.println("  Не найдено");
        }
        System.out.println();
    }

    public static void findDates(String text) {
        System.out.println("Даты:");
        String[] words = splitText(text);
        int count = 0;
        
        for (String word : words) {
            String cleanWord = removePunctuation(word);
            if (cleanWord.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(19|20)[0-9]{2}")) {
                count++;
                System.out.println("  " + count + ". " + cleanWord);
            }
        }
        
        if (count == 0) {
            System.out.println("  Не найдено");
        }
        System.out.println();
    }

    public static void findCapitalizedWords(String text) {
        System.out.println("Слова с заглавной буквы:");
        String[] sentences = text.split("[.!?]");
        int count = 0;
        
        for (String sentence : sentences) {
            String[] words = splitText(sentence);
            boolean firstWord = true;
            
            for (String word : words) {
                String cleanWord = removePunctuation(word);
                if (!cleanWord.isEmpty()) {
                    if (!firstWord && cleanWord.matches("[А-ЯA-Z][а-яa-zА-ЯA-Z]*(?:-[А-ЯA-Z][а-яa-zА-ЯA-Z]*)*")) {
                        count++;
                        System.out.println("  " + count + ". " + cleanWord);
                    }
                    firstWord = false;
                }
            }
        }
        
        if (count == 0) {
            System.out.println("  Не найдено");
        }
        System.out.println();
    }

    public static void countDigits(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        System.out.println("Общее количество цифр: " + count + "\n");
    }

    private static String[] splitText(String text) {
        String[] temp = new String[text.length()];
        int wordCount = 0;
        int start = 0;
        boolean inWord = false;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
                if (inWord) {
                    temp[wordCount] = text.substring(start, i);
                    wordCount++;
                    inWord = false;
                }
            } else {
                if (!inWord) {
                    start = i;
                    inWord = true;
                }
            }
        }
        
        if (inWord) {
            temp[wordCount] = text.substring(start);
            wordCount++;
        }
        
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    private static String removePunctuation(String word) {
        int start = 0;
        int end = word.length();
        
        while (start < end && isPunctuation(word.charAt(start))) {
            start++;
        }
        while (end > start && isPunctuation(word.charAt(end - 1))) {
            end--;
        }
        
        return word.substring(start, end);
    }

    private static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == ';' || c == ':' || c == '!' || c == '?' || 
               c == '(' || c == ')' || c == '\"' || c == '\'' || c == '[' || c == ']';
    }

    public static void main(String[] args) {
        String testText1 = "Компания \"Рога и копыта\" основана 15.03.2005.\n" +
                "Контакты: director@roga.ru, support@roga-kopita.com.\n" +
                "Бюджет проекта: 1500000 рублей. Штаб-квартира в Москве.";

        String testText2 = "Некорректные данные: 45.13.2025, user@.com, 999.999.9999\n" +
                "Валидные: 01.01.2024, normal@email.com(";

        System.out.println("=== Тест 1 ===");
        findEmails(testText1);
        findDates(testText1);
        findCapitalizedWords(testText1);
        countDigits(testText1);

        System.out.println("=== Тест 2 ===");
        findEmails(testText2);
        findDates(testText2);
        findCapitalizedWords(testText2);
        countDigits(testText2);
    }
}