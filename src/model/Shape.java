package model;

public abstract class Shape {

	// Making this method abstract will remove the implementation of the draw method in this abstract class.
	public void draw(){
		System.out.println("Inside Shape::draw() method.");
	}
}
