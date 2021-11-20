package controller;

import view.MenuView;

public class MenuViewController {

	private MenuView menuView;

	public MenuViewController(MenuView menuView) {
		this.menuView = menuView;
	}

	public MenuView getMenuView() {
		return this.menuView;
	}
}
