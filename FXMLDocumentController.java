package rockpaperscissors;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;

public class FXMLDocumentController implements Initializable {

    Game game = new Game();
    DropShadow shadow = new DropShadow();
    
    @FXML private Button btnRock, btnPaper, btnScissors;
    @FXML private ImageView rock, paper, scissors;
    @FXML private Label label;

    @FXML
    private void handleRockButton(ActionEvent event) {
        btnPaper.setEffect(null);
        btnScissors.setEffect(null);
        btnRock.setEffect(shadow);
        switch (game.run(0)) {
            case "You WIN!":
                btnScissors.setEffect(shadow);
                label.setText("You WIN!");
                break;
            case "It's a TIE!":
                btnRock.setEffect(null);
                btnRock.setEffect(shadow);
                label.setText("It's a TIE!");
                break;
            default:
                btnPaper.setEffect(shadow);
                label.setText("You LOSE!");
                break;
        }
    }

    @FXML
    private void handlePaperButton(ActionEvent event) {
        btnRock.setEffect(null);
        btnScissors.setEffect(null);
        btnPaper.setEffect(shadow);
        switch (game.run(1)) {
            case "You WIN!":
                btnRock.setEffect(shadow);
                label.setText("You WIN!");
                break;
            case "It's a TIE!":
                btnPaper.setEffect(null);
                btnPaper.setEffect(shadow);
                label.setText("It's a TIE!");
                break;
            default:
                btnScissors.setEffect(shadow);
                label.setText("You LOSE!");
                break;
        }
    }

    @FXML
    private void handleScissorsButton(ActionEvent event) {
        btnRock.setEffect(null);
        btnPaper.setEffect(null);
        btnScissors.setEffect(shadow);
        switch (game.run(2)) {
            case "You WIN!":
                btnPaper.setEffect(shadow);
                label.setText("You WIN!");
                break;
            case "It's a TIE!":
                btnScissors.setEffect(null);
                btnScissors.setEffect(shadow);
                label.setText("It's a TIE!");
                break;
            default:
                btnRock.setEffect(shadow);
                label.setText("You LOSE!");
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
