package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleButton;

public class MainWindowController {

	@FXML
	private Button button;
	@FXML
	private ToggleButton tButton;
	@FXML
	private ComboBox<String> comAuswahl;
	
	public Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
}
