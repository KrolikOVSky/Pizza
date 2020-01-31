package com.pizza.mainWindow;

import com.pizza.IFunctions.Window;
import com.pizza.files.adds.AddGroup;
import com.pizza.files.adds.AddItem;
import com.pizza.files.images.Images;
import com.pizza.paths.IPaths;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import static javafx.geometry.Pos.BOTTOM_CENTER;
import static javafx.geometry.Pos.CENTER;

public class MainWindow implements IPaths {

    public TabPane groups;
    public MenuItem openAbout;
    public MenuItem openSettings;
    public MenuItem closeAction;
    public FlowPane underWindow;
    public Tab newTab;
    @FXML private BorderPane thisWindow;

    private void close() throws Exception {
        Window window = new Window((Stage) thisWindow.getScene().getWindow());
        window.close();
    }

    public static void show() throws Exception {
        Window window = new Window("Pizza counter", MAIN_WINDOW, false, 800, 600);
        window.show();
    }

    public void closeAction(ActionEvent actionEvent) throws Exception {
        close();
    }

    public void openSettings(ActionEvent actionEvent) throws Exception{
        Window window = new Window("Настройки", SETTING_WINDOW, false);
        window.show();
        close();
    }

    void test(Node node){

    }

    public void openAbout(ActionEvent actionEvent) {
        Label name = new Label();
        Button btn = new Button();
        name.setText("Name");
        btn.setText("Click me");
        ImageView img = new ImageView(Images.ICON);
        img.setFitHeight(50.0);
        img.setFitWidth(50.0);
        BorderPane pane = new BorderPane();
        pane.setTop(img);
        pane.setCenter(btn);
        pane.setBottom(name);
        FlowPane flowPane = new FlowPane(pane);
        int i = 0;
        String id = groups.getTabs().get(0).getId();
        groups.getSelectionModel().selectFirst();


//        underWindow.getChildren().add(pane);

    }

    public void addCat(ActionEvent actionEvent) throws Exception{
        Tab tab = new Tab();
        FlowPane flowPane = new FlowPane();
        Button addItem = new Button();
        AddGroup newWindow = new AddGroup("Добавление новой группы");
        addItem.setText("Добавить товар");
        addItem.setPrefHeight(70.0);
        addItem.setPrefWidth(70.0);
        addItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label caption = new Label();
                Button btn = new Button();
                ImageView img = new ImageView(Images.ICON);
                BorderPane pane = new BorderPane();
                AddItem addGood = new AddItem("Добавление нового товара");
                if(addGood.getSource().equals("")){}
                else {
                    caption.setPrefWidth(100.0);
                    caption.setText(addGood.getSource());
                    caption.setStyle("-fx-text-alignment: center");
                    caption.setAlignment(BOTTOM_CENTER);

                    btn.setText("Добавить в корзину");
                    btn.setStyle("-fx-alignment: center; -fx-text-alignment: center");
                    btn.setWrapText(true);

                    img.setFitHeight(30.0);
                    img.setFitWidth(30.0);
                    img.setStyle("-fx-alignment: center");

                    pane.setPrefSize(100.0, 100.0);
                    pane.setTop(img);
                    pane.setCenter(btn);
                    pane.setBottom(caption);

                    flowPane.getChildren().add(pane);
                }
            }
        });
        tab.setText(newWindow.getSource());
        addItem.setWrapText(true);
        addItem.setTextAlignment(TextAlignment.CENTER);
        flowPane.getChildren().add(addItem);
        tab.setContent(flowPane);
        groups.getTabs().add(tab);
    }

    /*public void addItem(ActionEvent actionEvent) {
        Label caption = new Label();
        Button btn = new Button();
        ImageView img = new ImageView(Images.ICON);
        caption.setText("Name");
        btn.setText("Click me");
        img.setFitHeight(50.0);
        img.setFitWidth(50.0);
        BorderPane pane = new BorderPane();
        pane.setTop(img);
        pane.setCenter(btn);
        pane.setBottom(caption);


    }*/

    /*public void addGroup(ActionEvent actionEvent) {
        SingleSelectionModel<Tab> selectionModel;
        Tab pizzaGroup = new Tab();
        selectionModel = groups.getSelectionModel();
        pizzaGroup.setText("pizzaGroup");
        pizzaGroup.setId("pizzaGroup");
        pizzaGroup.setClosable(true);
        groups.getTabs().add(pizzaGroup);
        selectionModel.selectLast();
    }*/
}
