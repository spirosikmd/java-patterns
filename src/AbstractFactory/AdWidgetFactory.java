package AbstractFactory;

import AbstractFactory.ListWidgetFactory.ListWidgetType;

public class AdWidgetFactory extends AbstractFactory {
	
	public enum AdWidgetType {
		TEXT, PICTURE, HYBRID
	}
	
	@Override
	public AdWidget getAdWidget(AdWidgetType adWidgetType) {
		if (adWidgetType == null) {
			return null;
		}
		switch (adWidgetType) {
		case TEXT:
			return new TextAd();
		case PICTURE:
			return new PictureAd();
		case HYBRID:
			return new HybridAd();
		}
		return null;
	}
	
	@Override
	ListWidget getListWidget(ListWidgetType listWidgetType) {
		return null;
	}
}
