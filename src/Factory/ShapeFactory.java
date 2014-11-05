package Factory;

public class ShapeFactory {
	
	public enum ShapeType {
		CIRCLE, RECTANGLE, SQUARE
	}

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
}
