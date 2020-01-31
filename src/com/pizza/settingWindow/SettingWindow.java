package com.pizza.settingWindow;

import com.pizza.IFunctions.Window;
import com.pizza.mainWindow.MainWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SettingWindow {
    @FXML private BorderPane thisWindow;
    @FXML private MenuItem completeSetting;
    @FXML private Button itemCreate;
    @FXML private Button groupCreate;
    @FXML private TextField groupName;
    @FXML private ColorPicker groupColor;
    @FXML private TextField itemName;
    @FXML private ComboBox ItemGroup;
    @FXML private ColorPicker itemColor;

    private void close() throws Exception {
        Window window = new Window((Stage) thisWindow.getScene().getWindow());
        window.close();
    }

    public void itemCreate(ActionEvent actionEvent) {
        
    }

    public void groupCreate(ActionEvent actionEvent) {
        String name = groupName.getText();
        Color color = groupColor.getValue();
    }

    public void completeSetting(ActionEvent actionEvent) throws Exception {
        MainWindow.show();
        close();
    }
}
