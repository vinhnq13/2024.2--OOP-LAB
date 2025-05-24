package store.screen;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddBookToStoreScreen {
    private Store store;

    @FXML private TextField tfTitle;
    @FXML private TextField tfCategory;
    @FXML private TextField tfCost;

    public AddBookToStoreScreen(Store store) {
        this.store = store;
    }

    @FXML
    private void btnSubmitClicked() {
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        float cost = Float.parseFloat(tfCost.getText());

        Book book = new Book(title, category, cost);
        store.addMedia(book);
    }
}
