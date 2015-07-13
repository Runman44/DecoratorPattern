package pattern;
import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;


public class Client {

	public static void main(String[] args) {

		Shape circle = new Circle();
		circle.draw();
		
		Shape square = new Square();
		square.draw();
		
		Shape rectangle = new RedShapeDecorator(new Rectangle());
		rectangle.draw();
	}

}
