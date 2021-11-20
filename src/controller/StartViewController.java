package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import view.MenuView;
import view.StartView;

public class StartViewController {

	private StartView startView;

	public StartViewController(StartView startView) {
		this.startView = startView;
		setDateAndTimeIntoStartView();
		createMenuViewAction();
	}

	public StartView getStartView() {
		return this.startView;
	}

	public void setDateAndTimeIntoStartView() {
		final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> this.startView.getDateAndTimeLbl()
				.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm:ss")))));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	private void createMenuViewAction() {
		this.startView.getLoginBtn().setOnAction(e -> {
			MenuViewController menuViewController = new MenuViewController(new MenuView());
			this.startView.getScene().setRoot(menuViewController.getMenuView());
		});
	}
}
