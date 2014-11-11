package AbstractFactory;

public class TextAd implements AdWidget {
	
	@Override
	public void update() {
		System.out.println("Inside TextAd::update() method.");
	}
}
