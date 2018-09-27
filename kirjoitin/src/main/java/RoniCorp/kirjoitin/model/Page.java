package RoniCorp.kirjoitin.model;

import java.util.ArrayList;

public class Page implements Page_IF {
	
	private ArrayList<Element> page_elements;
	private int axelX;
	private int axelY;
	private boolean selected;
	
	public Page() {
		page_elements = new ArrayList();
		axelX = 71;
		axelY = 100;
		selected = true;
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
		page_elements.add(type);

	}

	public void removeElement(Element element) {
		page_elements.remove(element);

	}

	public void flipToHorizontal() {
		int temp = axelX;
		axelX = axelY;
		axelY = temp;

	}

	public void arrangeElements() {
		// TODO Auto-generated method stub

	}

}
