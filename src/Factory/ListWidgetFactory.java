package Factory;

public class ListWidgetFactory {
	
	public enum ListWidgetType {
		COMPANIES, EXPENSES, ACTIONS
	}

	public ListWidget getListWidget(ListWidgetType widgetType) {
		if (widgetType == null) {
			return null;
		}
		switch (widgetType) {
		case COMPANIES:
			return new Companies();
		case EXPENSES:
			return new Expenses();
		case ACTIONS:
			return new Actions();
		}
		return null;
	}
}
