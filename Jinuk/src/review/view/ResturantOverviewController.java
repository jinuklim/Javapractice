package review.view;

import java.awt.TextArea;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import review.MainApp;
public class ResturantOverviewController {


	@FXML
	private Label Name;
	@FXML
	private Label Addition;
	@FXML
	private TextArea Write;







	public ResturantOverviewController() {

	}




	@FXML
	private void initialize() {


	}

	public void setMainApp(MainApp mainApp){

	}



	public void setResturant(TextArea write){
		this.Write = write;
		write.setText(write.getText());

	}


}
