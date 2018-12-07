package review.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import review.MainApp;

public class ResturantOverviewController {


	@FXML
	private Label Name;
	@FXML
	private Label Addition;


	private MainApp mainApp;


	public void ResturantOverviewController() {

	}

	@FXML
	private void initialize() {
		}

	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;

	}


}
