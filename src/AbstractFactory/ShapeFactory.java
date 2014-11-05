package AbstractFactory;

import AbstractFactory.ColorFactory.ColorType;

public class ShapeFactory extends AbstractFactory {
	
	public enum ShapeType {
		CIRCLE, RECTANGLE, SQUARE
	}

	@Override
	public Shape getShape(ShapeType shapeType) {
		if (shapeType == null) {
			return null;
		}
		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		}
		return null;
	}
	
	@Override
	Color getColor(ColorType colorType) {
		return null;
	}
}
