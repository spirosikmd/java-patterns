package Factory;

import Factory.ListWidgetFactory.ListWidgetType;

public class FactoryDemo {

	public static void main(String[] args) {
		ListWidgetFactory listWidgetFactory = new ListWidgetFactory();
		
		ListWidget companies = listWidgetFactory.getListWidget(ListWidgetType.COMPANIES);
		companies.render();
		
		ListWidget expenses = listWidgetFactory.getListWidget(ListWidgetType.EXPENSES);
		expenses.render();
		
		ListWidget actions = listWidgetFactory.getListWidget(ListWidgetType.ACTIONS);
		actions.render();
	}
}
