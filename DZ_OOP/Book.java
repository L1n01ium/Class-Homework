public class Book {
	
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;
	private static int totalBooks = 0;
	private static final int MAX_YEAR = 2025;
	
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
		totalBooks++;
	}
	
	public static int getTotalBooks() {
		return totalBooks;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String newTitle) {
		if (newTitle != null && newTitle.length() != 0) {
			this.title = newTitle;
		} else {
			System.out.println("Введи нормальное название!");
		}
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String newAuthor) {
		if (newAuthor != null && newAuthor.length() != 0) {
			this.author = newAuthor;
		} else {
			System.out.println("Введи ФИО автора правильно!");
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		if (newYear >= 1 && newYear <= MAX_YEAR - 1) {
			this.year = newYear;
		} else { 
			System.out.println("Такой год не подходит!");
		}
	}
	
	public boolean getAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean newAvailable) {
		this.isAvailable = newAvailable;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int newPageCount) {
		if (newPageCount > 0) {
			this.pageCount = newPageCount;
		} else {
			System.out.println("Такой книги не существует");
		}
	}
	
	
	public void displayInfo() {
		System.out.println(title + " " + author + " " + year + " " + isAvailable + " " + pageCount);
	}
	
	public void borrowBook() {
		if (isAvailable) {
			this.isAvailable = false;
			System.out.println("Книга была выдана");
		} else {
			System.out.println("Книга уже выдана");
		}
	}
	
	public void returnBook() {
		this.isAvailable = true;
		System.out.println("Книгу вернули");
	}
	
	public void updateYear(int newYear) {
		setYear(newYear);
		System.out.println("Новый год: " + getYear());
	}
	
	public void displayInfo(boolean detailed) {
		if (detailed) {
			System.out.println(title + " " + author + " " + year + " " + isAvailable + " " + pageCount);
		} else {
			System.out.println(title + " " + author);
		}
	}
	
	public void borrowBook(String borrowerName) {
		if (isAvailable) {
			this.isAvailable = false;
			System.out.println("Книгу взял " + borrowerName);
		} else {
			System.out.println("Книга уже выдана");
		}
	}
}