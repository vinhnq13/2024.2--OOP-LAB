package store.screen;

import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.Media;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StoreManagerScreen {

    private Store store;

    @FXML private GridPane gridPane;
    @FXML private Button btnAddBook;
    @FXML private Button btnAddDVD;
    @FXML private Button btnAddCD;

    public StoreManagerScreen(Store store) {
        this.store = store;
    }

    @FXML
    public void initialize() {
        int col = 0;
        int row = 0;

        try {
            for (Media media : store.getItemsInStore()) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/store/view/MediaStore.fxml"));
                AnchorPane pane = loader.load();

                MediaStore controller = loader.getController();
                controller.setMedia(media);

                gridPane.add(pane, col++, row);
                if (col > 2) {
                    col = 0;
                    row++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnAddBookClicked() {
        // Mở AddBookToStoreScreen
    }

    @FXML
    private void btnAddDVDClicked() {
        // Mở AddDigitalVideoDiscToStoreScreen
    }

    @FXML
    private void btnAddCDClicked() {
        // Mở AddCompactDiscToStoreScreen
    }
}
