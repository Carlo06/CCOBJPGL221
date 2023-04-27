import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML

    private Circle MyCircle;
    private double y;
    private double x;

    public void up(ActionEvent event) {
        MyCircle.setCenterY(y = y - 10);
    }

    public void down(ActionEvent event) {
        MyCircle.setCenterY(y = y + 10);
    }

    public void right(ActionEvent event) {
        MyCircle.setCenterX(x = x + 10);
    }

    public void left(ActionEvent event) {
        MyCircle.setCenterX(x = x - 10);
    }
}