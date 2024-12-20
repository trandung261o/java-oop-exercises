package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	
	
	
	@Override
	public String toString() {
		return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - "
				+ getLength() + ": " + getCost() + " $";
	}
	
	public boolean isMatch(String title) {
		return this.getTitle().equalsIgnoreCase(title);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
