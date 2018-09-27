package RoniCorp.kirjoitin;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import RoniCorp.kirjoitin.model.Document;
import RoniCorp.kirjoitin.model.DocumentFactory;
import RoniCorp.kirjoitin.model.Element;
import RoniCorp.kirjoitin.model.ElementFactory;
import RoniCorp.kirjoitin.model.OriginalElementFactory;
import RoniCorp.kirjoitin.model.Page;
import RoniCorp.kirjoitin.model.Page_IF;

public class PageTest {
	
	@Test
	public void horizontalTest() {
		DocumentFactory factory = DocumentFactory.getInstance();
		Document doc = factory.createNewDocument();
		
		doc.addPage();
		Page_IF page = doc.getPages().get(0);
		System.out.println("X: "+page.getAxelX() +", Y: "+ page.getAxelY());
		int x = page.getAxelX();
		int y = page.getAxelY();
		page.flipToHorizontal();
		assertTrue(x == page.getAxelY() && y == page.getAxelX(), "The values of axels X and Y didn't swap");
		System.out.println("X: "+page.getAxelX() +", Y: "+ page.getAxelY());
	}
	
	@Test
	public void arrangeElementsTest() {
		// Create elements for a page, then rearrange their order on the list
		// List will be used for reading the file on a device, and the order of showing objects is based on the list.
		// Try to add from middle to first, second to last, switch the position of object with itself.
		
		//In order to recognize which Element in which, create proper constructors and give the elements some dummy data to play with.
		
		DocumentFactory docfactory = DocumentFactory.getInstance();
		ElementFactory efactory = OriginalElementFactory.getInstance();
		Document doc = docfactory.createNewDocument();
		doc.addPage();
		Page_IF page = doc.getPages().get(0);
		page.addElement(efactory.createTextElement());
		page.addElement(efactory.createImageElement());
		page.addElement(efactory.createTextElement());
		page.addElement(efactory.createImageElement());
		page.addElement(efactory.createImageElement());
		
		for(Element e : page.getElements()) {
			System.out.println(e.toString());
		}
		
	}

}
