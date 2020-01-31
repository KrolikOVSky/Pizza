package com.pizza.IFunctions;

import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import org.jetbrains.annotations.NotNull;

public class AddNewCategory {
    private String name;
    private String id;
    private String color;

    public AddNewCategory(String name, String id, String color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }


    public void addNewTab(@NotNull TabPane groups){
        Tab newTab = new Tab();
        SingleSelectionModel<Tab> selectionModel;
        selectionModel = groups.getSelectionModel();
        newTab.setText("pizzaGroup");
        newTab.setId("pizzaGroup");
        newTab.setClosable(true);
        newTab.setStyle("-fx-background-color: #");
        groups.getTabs().add(newTab);
        selectionModel.selectLast();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
