import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
            Scene scene = new Scene(root);
            // Disables resizing of window
            stage.setResizable(false);
            stage.setScene(scene);

            stage.show();

            //Hitting the "x" button will prompt this code
            stage.setOnCloseRequest(event -> {
                event.consume();
                logout(stage);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        //Message to confirm user to exit
     public void logout(Stage stage) {

        Alert alert = new Alert(AlertType.CONFIRMATION  );
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to leave JAACK.");
        alert.setContentText("Do you wish to stop shopping?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You have successfully logged out.");
            stage.close();
        }


    }

}