package AbstractFactory;

public class FactoryProducer {
	
	public enum FactoryType {
		SHAPE, COLOR
	}
	
	public static AbstractFactory getFactory(FactoryType factoryType) {
		if (factoryType == null) {
			return null;
		}
		switch (factoryType) {
		case SHAPE:
			return new ShapeFactory();
		case COLOR:
			return new ColorFactory();
		}
		return null;
	}
}
