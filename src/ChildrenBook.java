
public class ChildrenBook extends Book {
	private Boolean pictures;

	ChildrenBook(String name, int releaseDate, Author author, int pages, Boolean pictures) {
		super(name, releaseDate, author, pages);
		this.pictures = pictures;
	}

	// polymorfi
	@Override
	public void printBookInfo() {
		super.printBookInfo();
		if (pictures) {
			System.out.println("Den här boken har bilder");
		} else {
			System.out.println("Den här boken har inga bidler");
		}

	}

	public Boolean getPictures() {
		return pictures;
	}

	// Överskuggning av abstrakt metod
	public void openBook(int page, int age) {
		this.checkpage(page);
		if (age >= 15) {
			System.out.println("Du är kanske lite för gammal för denna bok...");
		}

	}

}
