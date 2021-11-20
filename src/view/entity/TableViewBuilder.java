package view.entity;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewBuilder<T> extends TableView<T> {

	public TableViewBuilder() {

	}

	public <E> TableColumn<T, E> build(String title, String property) {
		final TableColumn<T, E> column = new TableColumn<>(title);
		column.setCellValueFactory(new PropertyValueFactory<>(property));
		return column;
	}

}
