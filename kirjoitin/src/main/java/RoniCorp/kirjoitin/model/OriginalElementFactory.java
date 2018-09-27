package RoniCorp.kirjoitin.model;

public final class OriginalElementFactory implements ElementFactory {
	
	private static final OriginalElementFactory INSTANCE = new OriginalElementFactory();
	
	private OriginalElementFactory() {
		
	}
	
	public static OriginalElementFactory getInstance() {
		return INSTANCE;
	}
	

	public Element createTextElement() {
		// TODO Auto-generated method stub
		return new TextboxElement();
	}

	public Element createImageElement() {
		// TODO Auto-generated method stub
		return new ImageElement();
	}

}
