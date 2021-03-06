package ch.makery.reveiw;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

//
//
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Rewiew");

		initRootLayout();
		showReviewOverview();


//		상위 레이아웃을 초기화한다.
	}

	public void initRootLayout() {
			try{
//				fxml 파일에서 상위 레이아웃을 가져온다.
				FXMLLoader loader = new FXMLLoader ();
				loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
				rootLayout = (BorderPane) loader.load();

//				상위 레이아웃을 포함하는 scene을 보여준다.
				Scene scene = new Scene(rootLayout);
				primaryStage.setScene(scene);
				primaryStage.show();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	public void showReviewOverview() {
		try{

//			리뷰를 가져온다
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ReviewOverview.fxml"));
			AnchorPane ReviewOverview = (AnchorPane) loader.load();

//			리뷰요약을 가운데로 설정
			rootLayout.setCenter(ReviewOverview);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


//메인 스테이지를 반환한다.

	public Stage getPrimaryStage() {
		return primaryStage;
	}




	public static void main(String[] args) {
		launch(args);
	}
}
