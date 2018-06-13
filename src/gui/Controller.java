package src.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    private Model _model = new Model(this);

    @FXML private TextField t;
//    @FXML private ComboBox combo;

    @FXML
    public void initialize(){
       /* ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Option 1",
                        "Option 2",
                        "Option 3"
                );
        combo.setItems(options);*/
    }

    public void print(){
        t.setText("worked");
    }

    public void test(ActionEvent event){
        _model.test("YOO");
    }
}
