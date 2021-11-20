package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import view.MainView;
import view.MenuView;

public class MainViewController {

	private MainView mainView;

	public MainViewController(MainView mainView) {
		setDateAndTimeIntoStartView();
		this.mainView = mainView;
		showMenuView();
	}

	public void setDateAndTimeIntoStartView() {
		final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> this.mainView.getDateAndTimeLbl()
				.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm:ss")))));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	public MainView getMainView() {
		return this.mainView;
	}

	private void showMenuView() {
		MenuViewController menuViewController = new MenuViewController(new MenuView(), this);
		this.mainView.setCenter(menuViewController.getMenuView());
	}
}
