package store.screen;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AddCompactDiscToStoreScreen {

    private Store store;

    @FXML private TextField tfTitle;
    @FXML private TextField tfCategory;
    @FXML private TextField tfCost;
    @FXML private TextField tfDirector;
    @FXML private TextField tfLength;

    public AddCompactDiscToStoreScreen(Store store) {
        this.store = store;
    }

    @FXML
    private void btnSubmitClicked() {
        try {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());
            String director = tfDirector.getText();
            int length = Integer.parseInt(tfLength.getText());

            CompactDisc cd = new CompactDisc(title, category, cost, director, length);
            store.addMedia(cd);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("CompactDisc added to store successfully!");
            alert.showAndWait();

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Please enter valid numbers for cost and length.");
            alert.showAndWait();
        }
    }
}
