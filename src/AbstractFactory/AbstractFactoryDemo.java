package AbstractFactory;

import AbstractFactory.FactoryProducer.FactoryType;
import AbstractFactory.ListWidgetFactory.ListWidgetType;
import AbstractFactory.AdWidgetFactory.AdWidgetType;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		AbstractFactory listWidgetFactory = FactoryProducer.getFactory(FactoryType.LIST);
		
		ListWidget actions = listWidgetFactory.getListWidget(ListWidgetType.ACTIONS);
		actions.render();
		
		ListWidget companies = listWidgetFactory.getListWidget(ListWidgetType.COMPANIES);
		companies.render();
		
		ListWidget expenses = listWidgetFactory.getListWidget(ListWidgetType.EXPENSES);
		expenses.render();
		
		AbstractFactory adWIdgetFactory = FactoryProducer.getFactory(FactoryType.AD);
		
		AdWidget textAd = adWIdgetFactory.getAdWidget(AdWidgetType.TEXT);
		textAd.update();
		
		AdWidget pictureAd = adWIdgetFactory.getAdWidget(AdWidgetType.PICTURE);
		pictureAd.update();
		
		AdWidget hybridAd = adWIdgetFactory.getAdWidget(AdWidgetType.HYBRID);
		hybridAd.update();
	}
}
