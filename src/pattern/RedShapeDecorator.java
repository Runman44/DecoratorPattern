package pattern;

import model.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	private Shape shape;
	
	public RedShapeDecorator(Shape shape) {
		super(shape);
		this.shape = shape;
	}
	
	@Override
	public void draw(){
		shape.draw();
		setBorderRed(shape);
	}

	private void setBorderRed(Shape shape) {
		System.out.println("Border = Red.");
	}
}
