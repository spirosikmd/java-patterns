package AbstractFactory;

import AbstractFactory.FactoryProducer.FactoryType;
import AbstractFactory.ShapeFactory.ShapeType;
import AbstractFactory.ColorFactory.ColorType;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
		
		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		rectangle.draw();
		
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();
		
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
		
		Color red = colorFactory.getColor(ColorType.RED);
		red.fill();
		
		Color green = colorFactory.getColor(ColorType.GREEN);
		green.fill();
		
		Color blue = colorFactory.getColor(ColorType.BLUE);
		blue.fill();
	}
}
