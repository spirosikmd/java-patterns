package AbstractFactory;

import AbstractFactory.AdWidgetFactory.AdWidgetType;
import AbstractFactory.ListWidgetFactory.ListWidgetType;

public abstract class AbstractFactory {
	abstract ListWidget getListWidget(ListWidgetType listWidgetType);
	abstract AdWidget getAdWidget(AdWidgetType adWidgetType);
}