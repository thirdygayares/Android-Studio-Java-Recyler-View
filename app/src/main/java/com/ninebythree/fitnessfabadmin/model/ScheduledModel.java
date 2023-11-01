package com.ninebythree.fitnessfabadmin.model;

public class ScheduledModel {

    String name;
    String date;
    int image;

    public ScheduledModel(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public ScheduledModel(String name, String date, int image) {
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }

}
