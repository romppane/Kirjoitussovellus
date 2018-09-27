package RoniCorp.kirjoitin.model;

public class TextboxElement extends Element {
	
	private String text;
	
	public TextboxElement () {
		
	}
	
	

	public TextboxElement(String text) {
		super();
		this.text = text;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}


	@Override
	void drawElement() {
		// TODO Auto-generated method stub

	}


}
