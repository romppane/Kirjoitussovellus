package RoniCorp.kirjoitin.model;

public abstract class Element {
	protected boolean selected;
	protected int width;
	protected int length;
	protected int positionX;
	protected int positionY;
	
	public void movePosition(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public int getPositionX() {
		return positionX;
	}
	
	public int getPositionY() {
		return positionY;
	}
	
	public void changeSize(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	abstract void drawElement();
	
	public boolean getSelected() {
		return selected;
	}
	
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

}
