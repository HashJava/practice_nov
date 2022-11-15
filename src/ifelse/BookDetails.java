package ifelse;

import java.util.HashSet;
import java.util.LinkedList;

public class BookDetails {

	public static void main(String[] args) {


		Book book1 = new Book("Java EE","John", "787", "7878", 55);
		Book book2 = new Book("Java EE","Mike", "20033", "2001", 232);
		Book book3 = new Book("Polictis","Ram", "34343", "20343", 443);
		
		LinkedList<Book> booklist = new LinkedList<Book>();
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);

		
		HashSet<Book> newroster = new HashSet<Book>();
		newroster.add(book3);
		newroster.addAll(newroster);
		
		newroster.addAll(booklist);
		
		for (Book m: newroster) {
			System.out.println(m);
		}
		

		
		
		
		
	}

}
