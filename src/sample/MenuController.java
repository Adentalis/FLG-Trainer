package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class MenuController {

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    Pane menubar;
    public Button exit, back, hide;
    public BorderPane wholeMenu;



    public void closeProgramm(ActionEvent actionEvent) {
        System.exit(-1);

    }


    public void setOnMouseDragged(MouseEvent event) {

      menubar.getScene().getWindow().setX(event.getScreenX() - xOffset);
      menubar.getScene().getWindow().setY(event.getScreenY() - yOffset);
    }

    public void setOnMousePressed(MouseEvent event) {

        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    public void minimizeProgramm(ActionEvent actionEvent) {
        ((Stage)((Button)actionEvent.getSource()).getScene().getWindow()).setIconified(true);

    }

    public void chooseWords(ActionEvent actionEvent) throws IOException {
        System.out.println(((Button) actionEvent.getSource()).getId());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chooseClass.fxml"));
        Parent sample = fxmlLoader.load();
        Parent bot = FXMLLoader.load(getClass().getResource("9grade.fxml"));
        FlowPane flowPane = new FlowPane(sample);

        ((ChooseClassController)fxmlLoader.getController()).setLabel(((Button) actionEvent.getSource()).getId());

        back.setDisable(false);
        back.setOpacity(1);
        wholeMenu.setRight(flowPane);
        wholeMenu.setCenter(null);
        wholeMenu.getLeft().setTranslateX(-200);
        wholeMenu.setBottom(bot);
        wholeMenu.getBottom().setTranslateY(100);

    }

    public void changeToMainMenu(ActionEvent actionEvent) throws IOException {
        System.out.println(((Button) actionEvent.getSource()).getId());

        Parent sample = FXMLLoader.load(getClass().getResource("start.fxml"));
        Pane test = new Pane(sample);
        back.setDisable(true);
        back.setOpacity(0);
        wholeMenu.getLeft().setTranslateX(0);
        wholeMenu.setCenter(test);
        wholeMenu.setRight(null);
        wholeMenu.setBottom(null);
    }
}
