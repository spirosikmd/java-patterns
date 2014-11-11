package AbstractFactory;

public class PictureAd implements AdWidget {
	
	@Override
	public void update() {
		System.out.println("Inside PictureAd::update() method.");
	}
}
