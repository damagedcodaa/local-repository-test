package com.olav.wfm.model;

/**
 * Created by Olga A on 12.05.2017.
 */
public class ServingArea {

    String name;
    String description;

    public ServingArea() {

    }

    public ServingArea(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
