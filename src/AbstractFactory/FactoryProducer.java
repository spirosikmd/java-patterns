package AbstractFactory;

public class FactoryProducer {
	
	public enum FactoryType {
		LIST, AD
	}
	
	public static AbstractFactory getFactory(FactoryType factoryType) {
		if (factoryType == null) {
			return null;
		}
		switch (factoryType) {
		case LIST:
			return new ListWidgetFactory();
		case AD:
			return new AdWidgetFactory();
		}
		return null;
	}
}
