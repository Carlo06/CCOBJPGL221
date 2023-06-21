import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

            Image image = new Image("images/JACCK-removebg-preview.png");
            stage.getIcons().add(image);
            
            stage.setTitle("JACCK");
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
        alert.setHeaderText("You are about to leave JACCK.");
        alert.setContentText("Do you wish to stop shopping? ");
  
            // Load the app icon
        Image appIcon = new Image("images/JACCK-removebg-preview.png");
        ImageView imageView = new ImageView(appIcon);
        imageView.setFitWidth(48); // Set the desired width of the icon
        imageView.setFitHeight(48); // Set the desired height of the icon

        // Set the app icon as the graphic of the alert dialog
        alert.setGraphic(imageView);

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You have successfully logged out.");
            stage.close();
        }

        } 
    }

