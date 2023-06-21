package alert;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class PopupMessage {

    public static void showSimpleAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


    // ESPRESSO
    public static void showDescriptionMessage(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("ESPRESSO (\u20B1135)");
        alert.setContentText("Strong, concentrated, and aromatic coffee. Made by forcing hot water through finely ground beans under high pressure. Serves as a base for various coffee drinks. Enjoyed for its intense flavor.");
        alert.getDialogPane() .getButtonTypes() .add(ButtonType.CLOSE);
        alert.showAndWait();
    }
    // CAPPUCINO 
    public static void showDescriptionMessage2(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("CAPPUCINO (\u20B1130)");
        alert.setContentText("Creamy and indulgent coffee beverage. Consists of equal parts espresso, steamed milk, and frothed milk. Topped with a sprinkle of cocoa or cinnamon. Balanced flavors of coffee and milk. Popular and comforting choice.");
        alert.getDialogPane() .getButtonTypes() .add(ButtonType.CLOSE);
        alert.showAndWait();
        
    }
    //AMERICANO
    public static void showDescriptionMessage3(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("AMERICANO ");
        alert.setContentText("Refreshing and light coffee drink. Made by diluting espresso with hot water. Retains the bold flavor of espresso while providing a smoother and milder taste. Served black or with milk. Perfect for those who enjoy a larger coffee beverage");
        alert.showAndWait();
        
    }
    //HOT CHOCOLATE
    public static void showDescriptionMessage4(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("HOT CHOCOLATE (\u20B1130)");
        alert.setContentText("Decadent and comforting drink. Made with melted chocolate or cocoa powder mixed with hot milk. Rich and creamy texture. Often topped with whipped cream, marshmallows, or a sprinkle of cocoa. A beloved treat for chocolate lovers.. Served black or with milk. Perfect for those who enjoy a larger coffee beverage");
        alert.showAndWait();
        
    }
    //LATTE
    public static void showDescriptionMessage5(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("LATTE (\u20B1130)");
        alert.setContentText("Smooth and creamy coffee beverage. Consists of espresso and steamed milk, with a thin layer of frothed milk on top. Can be flavored with syrups like vanilla or caramel. Popular and versatile choice.");
        alert.showAndWait();
        
    }
    //CHOCOLATE FRAPPE
    public static void showDescriptionMessage6(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("CHOCOLATE FRAPPE (\u20B1130)");
        alert.setContentText("Iced and indulgent beverage. Blends chocolate syrup, milk, and ice together for a creamy and frothy texture. Topped with whipped cream and drizzled with chocolate syrup. A delightful treat on a hot day.");
        alert.showAndWait();
        
    }
    //VANILLA OREO
    public static void showDescriptionMessage7(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("VANILLA OREO (\u20B1130)");
        alert.setContentText("Delicious and sweet treat. Combines the classic flavors of vanilla and Oreo cookies. Creamy vanilla ice cream mixed with crushed Oreo cookies. A delightful combination of smooth and crunchy textures. Irresistibly satisfying.");
        alert.showAndWait();
        
    }
    //MILKSHAKE
    public static void showDescriptionMessage8(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("MILKSHAKE (\u20B1130)");
        alert.setContentText("Creamy and refreshing beverage. Made by blending milk, ice cream, and flavorings such as chocolate, vanilla, or fruit. Served thick and frosty. Enjoyed as a delightful dessert or a cooling drink on a hot day.");
        alert.showAndWait();
        
    }
    //CROISSANT
    public static void showDescriptionMessage9(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("CROISSANT (\u20B1130)");
        alert.setContentText("Buttery and flaky pastry. Originating from France, it is made with layers of dough and folded with butter. A popular breakfast or snack choice. Can be enjoyed plain or filled with sweet or savory fillings.");
        alert.showAndWait();
        
    }
    //CARROT CAKE
    public static void showDescriptionMessage10(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("CARROT CAKE (\u20B1130)");
        alert.setContentText("Moist and flavorful dessert. Made with grated carrots, spices, and nuts. Topped with cream cheese frosting. Offers a perfect balance of sweetness and earthy flavors. A classic and beloved choice for cake lovers.");
        alert.showAndWait();
        
    }
    //STRAWBERRY CHEESECAKE
    public static void showDescriptionMessage11(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("STRAWBERRY CHEESECAKE (\u20B1130)");
        alert.setContentText("Delectable and creamy dessert. Combines a smooth cheesecake filling with a sweet strawberry topping. A perfect blend of tangy and sweet flavors. Adored for its luscious texture and fruity freshness. A delightful indulgence.");
        alert.showAndWait();
        
    }
    //COOKIES
    public static void showDescriptionMessage12(String title){
        Alert alert = new Alert(AlertType.NONE);
        alert.setTitle(title);
        alert.setHeaderText("COOKIES (\u20B1130)");
        alert.setContentText("Delicious and versatile baked treats. Available in a wide variety of flavors and textures, from soft and chewy to crispy and crunchy. Perfect for snacking or pairing with a warm beverage. Irresistible delights for all ages.");
        alert.showAndWait();
        
    }


    public static void showErrorAlert(String title, String content) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(title);
        alert.setContentText(content);

        alert.showAndWait();
    }

    public static void showSuccessfulAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Successful");
        alert.setHeaderText(title);
        // alert.setContentText(content);
        alert.showAndWait();
    }

    public static boolean showConfirmationAlert(String title, String content) {
        Alert alert = new Alert(AlertType.CONFIRMATION, content, ButtonType.YES, ButtonType.NO);
        alert.setTitle("Confirmation");
        alert.setHeaderText(title);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            return true;
        }

        return false;
    }
}
