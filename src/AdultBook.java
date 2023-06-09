
public class AdultBook extends Book {
	private int ageRestrection;

	AdultBook(String name, int releaseDate, Author author, int pages, int ageRestrection) {
		super(name, releaseDate, author, pages);
		this.ageRestrection = ageRestrection;
	}

	public int getAgeRestrection() {
		return ageRestrection;

	}

	// polymorfi
	@Override
	public void printBookInfo() {
		super.printBookInfo();
		System.out.println("Den här boken har en åldergräns på " + this.getAgeRestrection() + " år.");

	}

	// Överskuggning av abstrakt metod
	@Override
	public void openBook(int page, int age) {

		if (age >= ageRestrection) {
			this.checkpage(page);
		} else {
			System.out.println("Du är inte tillräkligt gammal");
		}

	}

}
