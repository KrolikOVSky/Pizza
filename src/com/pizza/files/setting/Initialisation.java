package com.pizza.files.setting;

import com.pizza.paths.IPaths;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.io.*;
import java.nio.file.*;

public class Initialisation implements IPaths {
    /*private int countOfItems;
    private int countOfGroups;
    private String file;

    public Initialisation(Node node){
        this.file = readUsingFiles(PRESTART_FILE);
        int start = file.indexOf("CountOfItems=")+13;
        int end = file.indexOf(">", start);
        this.countOfItems = Integer.parseInt(file.substring(start, end));
        start = file.indexOf("CountOfGroups=")+14;
        end = file.indexOf(">", start);
        this.countOfGroups = Integer.parseInt(file.substring(start, end));
        for(int i = 0; i < countOfGroups; i++){
            Tab tab = new Tab();
            tab.setText("");
        }




    }

    @NotNull
    @Contract("_ -> new")
    private static String readUsingFiles(String fileName)  {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Initialisation(String caption, String path) throws Exception {
        FileReader reader = new FileReader(PRESTART_FILE);
        String fileContent = readUsingFiles(PRESTART_FILE);

    }

    private void createGroups(){

    }

    private void setCountFromFile(String path) throws Exception{
        String file = readUsingFiles(path);
        int start = file.indexOf("CountOfItems=")+13;
        int end = file.indexOf(">", start);
        countOfItems = Integer.parseInt(file.substring(start, end));
        start = file.indexOf("CountOfGroups=")+14;
        end = file.indexOf(">", start);
        countOfGroups = Integer.parseInt(file.substring(start, end));
    }

    public static void init(Node node){
        int start = file.indexOf("<Groups>")+9;
        int end = file.indexOf("\n", start);
        BorderPane pane = new BorderPane();
        for(int i = 0; i < countOfItems; i++){

        }
    }*/

}
