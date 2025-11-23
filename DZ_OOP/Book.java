public class Book {
	
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;

	public Book() {
		this("title", "author", 0, true, 0);
	}
	
	public Book(String title, String author, int year) {
		this(title, author, year, true, 0);
	}
	
	public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
		this.pageCount = pageCount;
	}
	
	public void displayInfo() {
		System.out.println(title + " " + author + " " + year + " " + isAvailable + " " + pageCount);
	}
	
	public void borrowBook() {
		if (isAvailable = false) {
			System.out.println("Книга уже выдана");
		} else {
			this.isAvailable = false;
			System.out.println("Книга была выдана");
		}
	}
	
	public void returnBook() {
		if (isAvailable) {
			System.out.println("Книга уже возвращена");
		} else {
			this.isAvailable = true;
			System.out.println("Книгу вернули");
		}
	}
	
	public void updateYear(int newYear) {
		this.year = newYear;
		System.out.println("Год издания обновили на: " + year);
	}
}
