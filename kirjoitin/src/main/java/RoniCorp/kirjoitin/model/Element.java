package RoniCorp.kirjoitin.model;

import java.util.ArrayList;

public abstract class Element {
	private boolean selected;
	private ArrayList<Double> borders;
	
	abstract void movePosition();
	abstract void changeSize(ArrayList<Double> borders);
	abstract void drawElement();

}
