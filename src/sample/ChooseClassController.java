package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * Created by daniel on 10.08.2017.
 */
public class ChooseClassController {

    private GameState gs;

    @FXML
    private Label label;

    public void setLabel(String str){
        label.setText(str);

    }




    public void button10Clicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("5grade.fxml"));
        Parent sample = fxmlLoader.load();

      //  ((MenuController)fxmlLoader.getController()).setBotto();
    }

    public void button5Clicked(ActionEvent actionEvent) {
    }

    public void button6Clicked(ActionEvent actionEvent) {
    }
    public void button7Clicked(ActionEvent actionEvent) {
    }
    public void button8Clicked(ActionEvent actionEvent) {
    }
    public void button9Clicked(ActionEvent actionEvent) {
    }
}
