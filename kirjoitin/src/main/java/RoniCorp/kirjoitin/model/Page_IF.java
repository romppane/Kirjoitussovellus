package RoniCorp.kirjoitin.model;

import java.util.ArrayList;

public interface Page_IF {
	public void addElement(Element type);
	public void removeElement(Element element);
	public void setSelected(boolean selected);
	public void flipToHorizontal();
	public void arrangeElements(Element toMove, Element toGive);
	public int getAxelX();
	public void setAxelX(int axelX);
	public int getAxelY();
	public void setAxelY(int axelY);
	public ArrayList<Element> getElements();
	
	

}
