package aula08Heranca.modelo;

public class CD extends Item{
	
	private String artist;
	private int numberOfTracks;

	public CD(String titulo, int time, int numberOfTracks, String artist) {
		super(titulo, time);
		this.artist = "Default";
		this.numberOfTracks = 0;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public void print() {
		System.out.println("Print da classe CD");
	}
}
