package customer.screen.controller;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewStoreController {

    private Store store;
    private Cart cart;

    @FXML private GridPane gridPane;

    public ViewStoreController(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
    }

    @FXML
    public void initialize() {
        int column = 0;
        int row = 1;

        try {
            for (Media media : store.getItemsInStore()) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/customer/view/Item.fxml"));
                AnchorPane anchor = loader.load();

                ItemController controller = loader.getController();
                controller.setData(media, cart);

                gridPane.add(anchor, column++, row);
                if (column == 3) {
                    column = 0;
                    row++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnViewCartPressed(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/customer/view/Cart.fxml"));
        loader.setController(new CartController(cart));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
