public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("Metro 2033", "Glukhovsky", 2005);
		Book book2 = new Book("Metro 2033", "Glukhovsky", 2005, true, 384);
		book2.displayInfo();
		book2.setPageCount(390);
		System.out.println("Новое кол-во страниц: " + book2.getPageCount());
		book2.borrowBook();
		book2.returnBook();
		book2.updateYear(2024);
		book2.displayInfo(false);
		book2.borrowBook("Pashka");
		System.out.println("Всего книг: " + book2.getTotalBooks());
	}
}