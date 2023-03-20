
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author elsa = new Author("Elsa", 67);
		Author hampus = new Author("Hampus", 99);
		Author anonym = new Author();

		Publisher bonnier = new Publisher("Bonnier", "www.bonnier.se", "Stråkvägen 7");

		Book harryPotter = new Book("Harry Potter och de vises sten", 1997, hampus, 100);
		Book hungerGames = new Book("Catching fire", 2008, elsa, 6787);
		Book pippi = new Book("Pippi", 2010, anonym, 78);
		AdultBook dracula= new AdultBook ("Dracula", 2008, elsa, 199, 15);
		
		
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
	
		
		pippi.openBook(1);
		
		
		
	}

}

