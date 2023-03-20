
public class Book {
	private String name;
	private int releaseDate;
	private Author author;
	private Publisher publisher;
	private int pages;
	private static int currentYear = 2023;

	public Book(String name, int releaseDate, Author author, int pages) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.author = author;
		this.pages = pages;

	}

	public String getName() {
		return name;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public Author getAuthor() {
		return author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void printBookInfo() {
		System.out.println(this.getName() + " Skriven av " + this.getAuthor().getName() + " Publicerad av "
				+ this.getPublisher().getName()+ " För " + this.calculateYear(this.getReleaseDate()) + " år sedan ");
		
	}

	public int getPages() {
		return pages;
	}
	public void openBook(int page) {
		if ((this.getPages() >= page) && page > 0) {
			System.out.println("Boken öppnades på sidan " + page);
		} else {
			System.out.println("Sidan finns inte");
		}
			
		
	}

	public static void setCurrentYear(int currentYear) {
		Book.currentYear = currentYear;
	}
	
	private int calculateYear(int releaseDate) {
	return  Book.currentYear - releaseDate;	
	}
	
	
}
