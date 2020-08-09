package basics;

public class Strings {
	public static void main (String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The lord of rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Chorme";
		if (browser.equalsIgnoreCase("chorme")) {
			System.out.println("The browser is chorme");
		}
		
		String fisrtName = "Tim";
		
		System.out.println (fisrtName.substring(0,1));
	}

}
