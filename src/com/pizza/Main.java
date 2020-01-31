package com.pizza;

import com.pizza.IFunctions.Window;
import com.pizza.paths.*;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application implements IPaths {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //String path = "/com/pizza/mainWindow/MainWindow.fxml";
        Window window = new Window("Pizza counter", MAIN_WINDOW, false, 800, 600);
        /*Parent root = FXMLLoader.load(getClass().getResource(path));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
