package AbstractFactory;

public class TextAd implements AdWidget {
	
	@Override
	public void render() {
		System.out.println("Inside TextAd::render() method.");
	}
}
