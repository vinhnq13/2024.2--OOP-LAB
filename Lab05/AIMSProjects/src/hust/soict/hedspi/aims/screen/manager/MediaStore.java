package store.screen;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.exception.PlayerException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MediaStore {
    private Media media;

    @FXML private Label lblTitle;
    @FXML private Label lblCost;
    @FXML private Button btnPlay;
    @FXML private Button btnRemove;

    public void setMedia(Media media) {
        this.media = media;
        lblTitle.setText(media.getTitle());
        lblCost.setText(String.format("%.2f $", media.getCost()));

        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

    @FXML
    private void btnPlayClicked() {
        if (media instanceof Playable playable) {
            try {
                playable.play();
            } catch (PlayerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @FXML
    private void btnRemoveClicked() {
        System.out.println("Remove clicked for: " + media.getTitle());
        // Tùy chỉnh thêm để xóa khỏi Store nếu cần
    }
}
