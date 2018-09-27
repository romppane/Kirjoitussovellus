package RoniCorp.kirjoitin;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import RoniCorp.kirjoitin.model.Document;
import RoniCorp.kirjoitin.model.DocumentFactory;
import RoniCorp.kirjoitin.model.Page;

public class PageTest {
	
	@Test
	public void horizontalTest() {
		DocumentFactory factory = new DocumentFactory();
		Document doc = factory.createNewDocument();
		
		doc.addPage();
		Page page = doc.getPages().get(0);
		System.out.println("X: "+page.getAxelX() +", Y: "+ page.getAxelY());
		int x = page.getAxelX();
		int y = page.getAxelY();
		page.flipToHorizontal();
		assertTrue(x == page.getAxelY() && y == page.getAxelX(), "The values of axels X and Y didn't swap");
		System.out.println("X: "+page.getAxelX() +", Y: "+ page.getAxelY());
	}

}
