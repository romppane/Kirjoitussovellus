package RoniCorp.kirjoitin;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import RoniCorp.kirjoitin.model.Document;
import RoniCorp.kirjoitin.model.DocumentFactory;
import RoniCorp.kirjoitin.model.Page;
import RoniCorp.kirjoitin.model.Page_IF;

public class DocumentTest {
	
	@Test
	public void testSortingPages() {
		//Give bunch of pages and rotate around, see if the order stays as wanted.
		//Try different methods like: moving to the middle, bottom and top.
		//Try doing the change without changing the position in reality.
		//Try changing the position with the pages own position.
		//moving to null = moving to bottom, otherwise there should be 2 methods to use, for putting the selected page to the bottom.
		//after every switch make a verification string from the positions.

		
		DocumentFactory factory = DocumentFactory.getInstance();
		Document doc = factory.createNewDocument();
				
		Page_IF p1 = new Page(1,1);
		Page_IF p2 = new Page(2,2);
		Page_IF p3 = new Page(3,3);
		Page_IF p4 = new Page(4,4);
		Page_IF p5 = new Page(5,5);
		String order = "";
		
		doc.getPages().add(p1); doc.getPages().add(p2);doc.getPages().add(p3);doc.getPages().add(p4);doc.getPages().add(p5);
		
		for (Page_IF p : doc.getPages()) {
			order += p.getAxelX()+ " ";
		}
		
		System.out.println(order);
		assertTrue(order.equals("1 2 3 4 5 "), "The pages do not initialize in right order");
		order = "";
		
		
		doc.movePage(p5, p1);
		for (Page_IF p : doc.getPages()) {
			order += p.getAxelX()+ " ";
		}
		System.out.println(order);
		assertTrue(order.equals("5 1 2 3 4 "), "Switching last page to first doesn't function properly");
		order = "";
		
		
		doc.movePage(p5, null);
		for (Page_IF p : doc.getPages()) {
			order += p.getAxelX()+ " ";
		}
		System.out.println(order);
		assertTrue(order.equals("1 2 3 4 5 "), "Does the page go as the last page?");
		order = "";
		
		
		doc.movePage(p3, p3);
		for (Page_IF p : doc.getPages()) {
			order += p.getAxelX()+ " ";
		}
		System.out.println(order);
		assertTrue(order.equals("1 2 3 4 5 "), "Switching the page with it's own position shouldn't do anything");
		order = "";
		
		
		doc.movePage(p5, p3);
		for (Page_IF p : doc.getPages()) {
			order += p.getAxelX()+ " ";
		}
		System.out.println(order);
		assertTrue(order.equals("1 2 5 3 4 "), "Swithching page to the middle isn't functioning correctly");
	}

}
