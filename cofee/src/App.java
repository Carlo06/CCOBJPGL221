import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.scene.image.Image;
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
            //Icon and Title
 //           stage.getIcons().add(new Image("C:\\Users\\jasper\\Desktop\\CoffeeShop\\Coffee Shop\\src\\image\\icon.jpg"));
            stage.setTitle("Deja Brew Coffee Shop");


            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}