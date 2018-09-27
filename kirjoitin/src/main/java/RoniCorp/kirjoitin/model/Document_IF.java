package RoniCorp.kirjoitin.model;

import java.util.ArrayList;
import java.util.Date;

public interface Document_IF {
	//stamp the log
	public void addModification();
	public void addMargin(Double percentage);
	public void addPage();
	public void removeMargin();
	public void removePage(Page_IF page);
	public void movePage(Page_IF toMove, Page_IF toGive);
	
	//save as xml file
	public void saveDocument();
	//load from xml file
	public void loadDocument();
	
	public ArrayList<Date> getModified();
	public void setModified(ArrayList<Date> modified);
	public ArrayList<Page_IF> getPages();
	public void setPages(ArrayList<Page_IF> pages);
	public ArrayList<Double> getMargins();
	public void setMargins(ArrayList<Double> margins);

}
