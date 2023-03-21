
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author elsa = new Author("Elsa", 67);
		Author hampus = new Author("Hampus", 99);
		Author anonym = new Author();

		Publisher bonnier = new Publisher("Bonnier", "www.bonnier.se", "Stråkvägen 7");

		ChildrenBook harryPotter = new ChildrenBook("Harry Potter och de vises sten", 1997, hampus, 100, false);
		AdultBook hungerGames = new AdultBook("Catching fire", 2008, elsa, 6787, 20);
		ChildrenBook pippi = new ChildrenBook("Pippi", 2010, anonym, 78, true);
		AdultBook dracula = new AdultBook("Dracula", 2008, elsa, 199, 15);

		harryPotter.setPublisher(bonnier);
		hungerGames.setPublisher(bonnier);
		pippi.setPublisher(bonnier);
		dracula.setPublisher(bonnier);

		harryPotter.printBookInfo();
		pippi.printBookInfo();
		Book.setCurrentYear(2024);
		harryPotter.printBookInfo();
		pippi.printBookInfo();
		dracula.printBookInfo();

		pippi.openBook(1, 71);

	}

}
