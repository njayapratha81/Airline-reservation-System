import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AirlineReservationSystem extends Application {
    private final ObservableList<String> seatOptions = FXCollections.observableArrayList("Window", "Aisle");
    private final ToggleGroup seatGroup = new ToggleGroup();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Airline Reservation System");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameField = new TextField();
        GridPane.setConstraints(nameField, 1, 0);

        Label seatLabel = new Label("Seat Preference:");
        GridPane.setConstraints(seatLabel, 0, 1);
        RadioButton windowRadioButton = new RadioButton("Window");
        RadioButton aisleRadioButton = new RadioButton("Aisle");
        windowRadioButton.setToggleGroup(seatGroup);
        aisleRadioButton.setToggleGroup(seatGroup);
        GridPane.setConstraints(windowRadioButton, 1, 1);
        GridPane.setConstraints(aisleRadioButton, 2, 1);

        Label messageLabel = new Label();
        GridPane.setConstraints(messageLabel, 0, 2, 2, 1);

        Button reserveButton = new Button("Reserve");
        reserveButton.setOnAction(e -> {
            String name = nameField.getText();
            RadioButton selectedRadioButton = (RadioButton) seatGroup.getSelectedToggle();
            String seatPreference = selectedRadioButton != null ? selectedRadioButton.getText() : "";

            if (!name.isEmpty() && !seatPreference.isEmpty()) {
                messageLabel.setText("Reservation successful for " + name + " with seat preference: " + seatPreference);
            } else {
                messageLabel.setText("Please enter name and select a seat preference.");
            }
        });
        GridPane.setConstraints(reserveButton, 0, 3);

        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            nameField.clear();
            seatGroup.selectToggle(null);
            messageLabel.setText("");
        });
        GridPane.setConstraints(cancelButton, 1, 3);

        grid.getChildren().addAll(nameLabel, nameField, seatLabel, windowRadioButton, aisleRadioButton,
                messageLabel, reserveButton, cancelButton);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
