package src.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import src.GUI.Model;

public class Controller {

    private Model _model;

    @FXML private ComboBox combo;

    @FXML private TextField t;
    @FXML private BorderPane _pane;

    @FXML
    public void initialize(){
//        _model = new Model(this);
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Add a class.",
                        "Option 2",
                        "Option 3"
                );
        combo.setItems(options);
    }

    public void print(){
        t.setText("worked");
    }

    public void test(ActionEvent event){

    }
}
