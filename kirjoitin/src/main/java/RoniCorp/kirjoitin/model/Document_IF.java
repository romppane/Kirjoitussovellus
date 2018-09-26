package RoniCorp.kirjoitin.model;

import java.util.ArrayList;
import java.util.Date;

public interface Document_IF {
	//stamp the log
	public void addModification();
	public void addMargin(Double percentage);
	public void addPage();
	public void removeMargin();
	public void removePage(Page page);
	public void movePage(Page toMove, Page toGive);
	
	//save as xml file
	public void saveDocument();
	//load from xml file
	public void loadDocument();
	
	public ArrayList<Date> getModified();
	public void setModified(ArrayList<Date> modified);
	public ArrayList<Page> getPages();
	public void setPages(ArrayList<Page> pages);
	public ArrayList<Double> getMargins();
	public void setMargins(ArrayList<Double> margins);

}
