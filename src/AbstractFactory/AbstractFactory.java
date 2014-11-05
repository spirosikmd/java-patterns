package AbstractFactory;

import AbstractFactory.ColorFactory.ColorType;
import AbstractFactory.ShapeFactory.ShapeType;

public abstract class AbstractFactory {
	abstract Shape getShape(ShapeType shapeType);
	abstract Color getColor(ColorType colorType);
}