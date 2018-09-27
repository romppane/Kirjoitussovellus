package RoniCorp.kirjoitin.model;


public class ImageElement extends Element {
	
	//Create a Image to byte converter class!!
	//Tinker with the next - previous situation, next should always be the new image added to the queue, but for the last one it's the first one
	//Previous changes for the first image every time a new Image has been added so that the array goes around.
	//Deleting Image will be a pain in the ass, but very do able with the help of Internet.
	
	private byte[] image_data;
	private ImageElement next;
	private ImageElement previous;

	public ImageElement () {
		
	}
	
	
	public ImageElement(byte[] image_data) {
		super();
		this.image_data = image_data;
	}
	
	


	public ImageElement(byte[] image_data, ImageElement previous) {
		super();
		this.image_data = image_data;
		this.previous = previous;
	}


	public byte[] getImage_data() {
		return image_data;
	}


	public void setImage_data(byte[] image_data) {
		this.image_data = image_data;
	}


	public ImageElement getNext() {
		return next;
	}


	public void setNext(ImageElement next) {
		this.next = next;
	}


	public ImageElement getPrevious() {
		return previous;
	}


	public void setPrevious(ImageElement previous) {
		this.previous = previous;
	}

	@Override
	void drawElement() {
		// TODO Auto-generated method stub

	}

}
