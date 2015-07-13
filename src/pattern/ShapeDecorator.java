package pattern;
import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;

public class ShapeDecorator implements Shape {

	private Shape shape;
	
	public ShapeDecorator(Shape shape){
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
	}
	
}
