package com.ninebythree.fitnessfabadmin.model;

public class ScheduledModel {

    String name;
    String date;

    public ScheduledModel(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

}
