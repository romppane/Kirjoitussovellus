package RoniCorp.kirjoitin.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Document implements Document_IF {
	
	private ArrayList<Date> modified;
	private ArrayList<Page> pages;
	//References are likely to get implemented later
	//private ArrayList<String> references;
	//Margins as the percentage compared to the box
	private ArrayList<Double> margins;

	public Document() {
		modified = new ArrayList<Date>();
		pages = new ArrayList<Page>();
		margins = new ArrayList<Double>();
	}
	
	public ArrayList<Date> getModified() {
		return modified;
	}

	public void setModified(ArrayList<Date> modified) {
		this.modified = modified;
	}

	public ArrayList<Page> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}

	public ArrayList<Double> getMargins() {
		return margins;
	}

	public void setMargins(ArrayList<Double> margins) {
		this.margins = margins;
	}

	public Document(ArrayList<Date> modified, ArrayList<Page> pages, ArrayList<Double> margins) {
		this.modified = modified;
		this.pages = pages;
		this.margins = margins;
	}

	public void addModification() {
		// TODO Auto-generated method stub
		modified.add(new Date());

	}

	public void addMargin(Double percentage) {
		// TODO Auto-generated method stub
		margins.add(percentage);
	}

	public void addPage() {
		// TODO Auto-generated method stub
		pages.add(new Page());
	}

	public void removeMargin() {
		// TODO Auto-generated method stub
	}

	public void removePage(Page page) {
		pages.remove(page);
	}

	public void movePage(Page toMove, Page toGive) {
		// Select 2 pages, the one you want to move and the one which will give it's old position to the new page!
		// Pages begind will move 1 back.
		if(toMove != toGive) {
			if(toGive == null) {
				pages.remove(toMove);
				pages.add(toMove);
			}
			else {
				pages.remove(toMove);
				int newPos = pages.indexOf(toGive);
				pages.add(newPos, toMove);
			}
			
		}
		
	}


	public void saveDocument() {
		// TODO Auto-generated method stub
		//Save document as XML
	}

	public void loadDocument() {
		// TODO Auto-generated method stub
		//read a saved XML file and restore the workspace as it should be
	}


}
