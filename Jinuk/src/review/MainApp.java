package review;

import java.io.IOException;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import review.model.Resturant;
import review.view.ResturantOverviewController;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private ObservableList<Resturant> ResturantData = FXCollections.observableArrayList();



	public MainApp() {
	ResturantData.add(new Resturant("GOODRESTURANT"));
	ResturantData.add(new Resturant("GOODRESTURANT"));

	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Rewiew");

		initRootLayout();
		showReviewOverview();


//		���� ���̾ƿ��� �ʱ�ȭ�Ѵ�.
	}

	public void initRootLayout() {
			try{
//				fxml ���Ͽ��� ���� ���̾ƿ��� �����´�.
				FXMLLoader loader = new FXMLLoader ();
				loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
				rootLayout = (BorderPane) loader.load();

//				���� ���̾ƿ��� �����ϴ� scene�� �����ش�.
				Scene scene = new Scene(rootLayout);
				primaryStage.setScene(scene);
				primaryStage.show();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	public void showReviewOverview() {
		try{
//			���並 �����´�
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ReviewOverview.fxml"));
			AnchorPane ReviewOverview = (AnchorPane) loader.load();

//			�������� ����� ����
			rootLayout.setCenter(ReviewOverview);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showResturantOverview() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ResturantOverview.fxml"));
			AnchorPane ResturantOverview = (AnchorPane) loader.load();

			rootLayout.setCenter(ResturantOverview);

			ResturantOverviewController controller = loader.getController();
		    controller.setMainApp(this);


	} catch (IOException e) {
		e.printStackTrace();
	}
	}


//���� ���������� ��ȯ�Ѵ�.

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public ObservableList<Resturant> getResturantData(){
		return ResturantData;
	}


	public static void main(String[] args) {
		launch(args);
	}





}
