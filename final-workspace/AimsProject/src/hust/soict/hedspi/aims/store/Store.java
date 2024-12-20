package hust.soict.hedspi.aims.store;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    
    public void addMedia(Media media) {
	    if (!itemsInStore.contains(media)) {
	    	itemsInStore.add(media);
	        //System.out.println("The media \"" + media.getTitle() + "\" has been added.");
	    } else {
	        System.out.println("The media is already in the store.");
	    }
	}
    
    public void removeMedia(Media media) {
	    if (itemsInStore.contains(media)) {
	    	itemsInStore.remove(media);
	        System.out.println("The media \"" + media.getTitle() + "\" has been removed.");
	    } else {
	        System.out.println("The media is not in the store.");
	    }
	}
    
    public void print() {
        System.out.println("\n***********************STORE***********************");
        System.out.println("In Store Items: ");

        for (int i = 0; i < itemsInStore.size(); i++) {
            Media media = itemsInStore.get(i); // Lấy phương tiện tại chỉ số i
            System.out.println((i + 1) + ". " + media.toString()); // In chi tiết của phương tiện
        }
    }
    
    public Media searchByTitle(String title) {
		for (Media a : itemsInStore) {
			if (a.getTitle().equals(title)) {
				return a;
			}
		}
		System.out.println("No Media found with title: " + title);
		return null;
	}
}
