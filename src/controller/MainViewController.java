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
	private StartViewController startViewController;

	public MainViewController(MainView mainView, StartViewController startViewController) {
		setDateAndTimeIntoStartView();
		this.mainView = mainView;
		this.startViewController = startViewController;
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

	public void showMenuView() {
		MenuViewController menuViewController = new MenuViewController(new MenuView(), this, this.startViewController);
		this.mainView.setCenter(menuViewController.getMenuView());
	}

}
