package aula08Heranca.modelo;

public class Item {
	protected String title;
	protected int playingTime;
	protected boolean gotIt;
	protected String comment;
	
	public Item(String titulo, int time) {
		title = titulo;
		playingTime = time;
		this.gotIt = false;
		this.comment = " ";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

	public boolean isGotIt() {
		return gotIt;
	}

	public void setGotIt(boolean gotIt) {
		this.gotIt = gotIt;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void print() {
		System.out.println("Print Super Classe");
	}
}
