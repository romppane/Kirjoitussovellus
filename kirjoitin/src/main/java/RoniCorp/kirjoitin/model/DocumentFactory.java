package RoniCorp.kirjoitin.model;

public final class DocumentFactory {
	private static final DocumentFactory INSTANCE = new DocumentFactory();
	
	private DocumentFactory() {
		
	}
	
	public static DocumentFactory getInstance() {
		return INSTANCE;
	}
	
	public Document createNewDocument() {
		return new Document();
	}
}
