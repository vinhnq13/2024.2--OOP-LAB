package customer.screen.controller;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.exception.PlayerException;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ItemController {

    private Media media;
    private Cart cart;

    @FXML private Label lblTitle;
    @FXML private Label lblCost;
    @FXML private Button btnAddToCart;
    @FXML private Button btnPlay;

    public void setData(Media media, Cart cart) {
        this.media = media;
        this.cart = cart;

        lblTitle.setText(media.getTitle());
        lblCost.setText(media.getCost() + " $");

        btnPlay.setVisible(media instanceof Playable);
    }

    @FXML
    private void btnAddToCartClicked() {
        cart.addMedia(media);
    }

    @FXML
    private void btnPlayClicked() {
        if (media instanceof Playable playable) {
            try {
                playable.play();
            } catch (PlayerException e) {
                new javafx.scene.control.Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            }
        }
    }
}
