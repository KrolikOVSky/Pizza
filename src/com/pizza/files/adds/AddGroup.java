package com.pizza.files.adds;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddGroup {
    private TextField input = new TextField();
    private Label info = new Label("Создание группы");
    private Button crete_btn = new Button("Создать");
    private Stage stage = new Stage();
    private Scene scene;
    private AnchorPane pane = new AnchorPane();
    private String source;

    public AddGroup(String caption){
        ///
        ///Label
        ///
        this.info.setPrefSize(383.0, 54.0);
        this.info.setLayoutX(8.0);
        this.info.setLayoutY(6.0);
        this.info.setStyle("-fx-text-alignment: center; -fx-font-size: 20;");
        ///
        ///Button
        ///
        this.crete_btn.setPrefSize(400.0, 138.0);
        this.crete_btn.setLayoutX(8.0);
        this.crete_btn.setLayoutY(152.0);
        this.crete_btn.setStyle("-fx-text-alignment: center; -fx-font-size: 30;");
        this.crete_btn.setOnAction(this::create);
        ///
        ///Text View
        ///
        this.input.setPromptText("Введите название группы");
        this.input.setPrefSize(383.0, 90);
        this.input.setLayoutX(8.0);
        this.input.setLayoutY(61.0);
        this.input.setStyle("-fx-font-size: 20");
        this.input.setOnAction(this::create);
        ///
        ///Anchor Pane
        ///
        this.pane.setPrefSize(400.0, 300.0);
        this.pane.getChildren().addAll(info, input, crete_btn);
        ///
        ///Scene
        ///
        this.scene = new Scene(pane);
        ///
        ///Stage
        ///
        this.stage.setTitle(caption);
        this.stage.setScene(scene);
        this.stage.showAndWait();
    }

    public void show(){
        this.stage.showAndWait();
    }

    public void create(ActionEvent actionEvent){
        if(input.getText().equals("")) input.setPromptText("Поле не может быль пустым");
        else{
            setSource(input.getText());
            this.stage.hide();
        }
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
