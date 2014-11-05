package AbstractFactory;

import AbstractFactory.ShapeFactory.ShapeType;

public class ColorFactory extends AbstractFactory {
	
	public enum ColorType {
		RED, GREEN, BLUE
	}
	
	@Override
	public Color getColor(ColorType colorType) {
		if (colorType == null) {
			return null;
		}
		switch (colorType) {
		case RED:
			return new Red();
		case GREEN:
			return new Green();
		case BLUE:
			return new Blue();
		}
		return null;
	}
	
	@Override
	Shape getShape(ShapeType shapeType) {
		return null;
	}
}
