package com.Vlad;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ISaveable {

    private String isOn = "off";
    private String type;
    private int id;

    public Computer(String type, int id) {
        this.type = type;
        this.id = id;
    }

    public String getIsOn() {
        return isOn;
    }

    public void setIsOn(String isOn) {
        this.isOn = isOn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public List<String> write() {
        List<String> savedValues = new ArrayList<>();
        savedValues.add(0, this.isOn);
        savedValues.add(1, this.type);
        savedValues.add(2, "" + this.id);
        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.isOn = savedValues.get(0);
            this.type = savedValues.get(1);
            this.id = Integer.parseInt(savedValues.get(2));

        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "isOn=" + isOn +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }

}
