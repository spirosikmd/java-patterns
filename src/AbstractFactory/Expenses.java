package AbstractFactory;

public class Expenses implements ListWidget {
	
	@Override
	public void render() {
		System.out.println("Inside Expenses::render() method.");
	}
}
