package AbstractFactory;

public class PictureAd implements AdWidget {
	
	@Override
	public void render() {
		System.out.println("Inside PictureAd::render() method.");
	}
}
