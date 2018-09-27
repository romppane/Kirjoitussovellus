package RoniCorp.kirjoitin.model;

import java.util.ArrayList;

public class Page implements Page_IF {
	
	private ArrayList<Element> page_elements;
	private int axelX;
	private int axelY;
	private boolean selected;
	
	public Page() {
		
	}

	public Page(int axelX, int axelY) {
		page_elements = new ArrayList();
		this.axelX = axelX;
		this.axelY = axelY;
		selected = true;
	}
	
	

	public Page(ArrayList<Element> page_elements, int axelX, int axelY) {
		this.page_elements = page_elements;
		this.axelX = axelX;
		this.axelY = axelY;
		selected = false;
	}



	public int getAxelX() {
		return axelX;
	}

	public void setAxelX(int axelX) {
		this.axelX = axelX;
	}

	public int getAxelY() {
		return axelY;
	}

	public void setAxelY(int axelY) {
		this.axelY = axelY;
	}

	public ArrayList<Element> getPage_elements() {
		return page_elements;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public void addElement(Element type) {
		// TODO Auto-generated method stub

	}

	public void removeElement(Element element) {
		elements.remov

	}

	public void flipToHorizontal() {
		// TODO Auto-generated method stub

	}

	public void arrangeElements() {
		// TODO Auto-generated method stub

	}

}
