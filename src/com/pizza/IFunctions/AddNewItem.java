package com.pizza.IFunctions;

public class AddNewItem {
    private String id;
    private String name;
    private String color;
    private String groupID;

    public AddNewItem(String id, String name, String color, String groupID) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.groupID = groupID;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }
}
