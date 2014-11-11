package AbstractFactory;

import AbstractFactory.AdWidgetFactory.AdWidgetType;

public class ListWidgetFactory extends AbstractFactory {
	
	public enum ListWidgetType {
		COMPANIES, ACTIONS, EXPENSES
	}

	@Override
	public ListWidget getListWidget(ListWidgetType listWidgetType) {
		if (listWidgetType == null) {
			return null;
		}
		switch (listWidgetType) {
		case COMPANIES:
			return new Companies();
		case ACTIONS:
			return new Actions();
		case EXPENSES:
			return new Expenses();
		}
		return null;
	}
	
	@Override
	AdWidget getAdWidget(AdWidgetType adWidgetType) {
		return null;
	}
}
