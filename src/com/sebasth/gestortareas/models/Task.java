package com.sebasth.gestortareas.models;

import com.sebasth.gestortareas.principal.Main;

public class Task extends Main {
    private String name;
    private int time;
    private  String description;

    /*insertamos getter and setters para
    poder obtener la informacion de las variables privadas*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
