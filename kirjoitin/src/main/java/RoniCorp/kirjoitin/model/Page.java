package RoniCorp.kirjoitin.model;

import java.util.ArrayList;

public class Page implements Page_IF {
	
	private ArrayList<Element> elements;
	private int axelX;
	private int axelY;
	private boolean selected;
	
	public Page() {
		elements = new ArrayList();
		axelX = 71;
		axelY = 100;
		selected = true;
	}

	public Page(int axelX, int axelY) {
		elements = new ArrayList();
		this.axelX = axelX;
		this.axelY = axelY;
		selected = true;
	}
	
	

	public Page(ArrayList<Element> elements, int axelX, int axelY) {
		this.elements = elements;
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

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public void addElement(Element type) {
		elements.add(type);

	}

	public void removeElement(Element element) {
		elements.remove(element);

	}

	public void flipToHorizontal() {
		int temp = axelX;
		axelX = axelY;
		axelY = temp;

	}

	public void arrangeElements(Element toMove, Element toGive) {
		// TODO Auto-generated method stub
		if(toMove != toGive) {
			if(toGive == null) {
				elements.remove(toMove);
				elements.add(toMove);
			}
			else {
				elements.remove(toMove);
				int newPos = elements.indexOf(toGive);
				elements.add(newPos, toMove);
			}
			
		}

	}

}
