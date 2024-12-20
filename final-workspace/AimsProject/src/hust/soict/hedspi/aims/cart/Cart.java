package hust.soict.hedspi.aims.cart;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static final int MAX_NUMBERS_ORDERED = 20;
	public float totalCost() {
	    float total = 0;
	    for (Media media : itemsOrdered) {
	        total += media.getCost();
	    }
	    return total;
	}

	
	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered Items: ");
		
		float totalCost = 0;
		for (Media a : itemsOrdered) {
			System.out.println(itemsOrdered.indexOf(a)+1 + ". " + a.toString());
			totalCost += a.getCost();
		}
		System.out.println("Total cost: " + totalCost);
	}
	
	public Media searchById(int id) {
		for (Media a : itemsOrdered) {
			if (a.getId() == id) {
				return a;
			}
		}
		System.out.println("No Media found with ID: " + id);
		return null;
	}
	
	public Media searchByTitle(String title) {
		for (Media a : itemsOrdered) {
			if (a.getTitle().equals(title)) {
				return a;
			}
		}
		System.out.println("No Media found with title: " + title);
		return null;
	}
	
	
	
	public void addMedia(Media media) {
	    if (!itemsOrdered.contains(media)) {
	        itemsOrdered.add(media);
	        System.out.println("The media \"" + media.getTitle() + "\" has been added.");
	    } else {
	        System.out.println("The media is already in the cart.");
	    }
	}
	
	public void removeMedia(Media media) {
	    if (itemsOrdered.contains(media)) {
	        itemsOrdered.remove(media);
	        System.out.println("The media \"" + media.getTitle() + "\" has been removed.");
	    } else {
	        System.out.println("The media is not in the cart.");
	    }
	}
	
	public List<Media> filterById(int id) {
		List<Media> filteredList = new ArrayList<>();
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				filteredList.add(media);
			}
		}
		return filteredList;
	}
	
	public List<Media> filterByTitle(String title) {
		List<Media> filteredList = new ArrayList<>();
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				filteredList.add(media);
			}
		}
		return filteredList; 
	}
	
	public void displayMediaList() {
		for (Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
	}
	
	public void sortByTitle() {
		itemsOrdered.sort(Comparator.comparing(Media::getTitle));
		displayMediaList();
	}
	
	public void sortByCost() {
		itemsOrdered.sort(Comparator.comparing(Media::getCost));
		displayMediaList();
	}
	
	public void emptyCart() {
		itemsOrdered.clear();
	}
}
