package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Author is already in the list");
			return;
		}
		authors.add(authorName);
		System.out.println("Add author successfully");
	}
	
	public void removeAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			System.out.println("Author is absent in the list");
			return;
		}
		authors.remove(authorName);
		System.out.println("Remove author successfully");
	}
	
}
