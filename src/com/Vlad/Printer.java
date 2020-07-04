package com.Vlad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer implements ISaveable {

    private int ink;
    private String type;
    private int id;
    private String isOnline;

    public Printer(int ink, String type, int id) {
        this.ink = ink;
        this.type = type;
        this.id = id;
        this.isOnline = "offline";
    }

    public int getInk() {
        return ink;
    }

    public void setInk(int ink) {
        this.ink = ink;
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

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "ink=" + ink +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", isOnline='" + isOnline + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> savedValues = new ArrayList<>();
        savedValues.add(0, "" + this.ink);
        savedValues.add(1, this.type);
        savedValues.add(2, "" + this.id);
        savedValues.add(3, ""+ this.isOnline);
        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.ink = Integer.parseInt(savedValues.get(0));
            this.type = savedValues.get(1);
            this.id = Integer.parseInt(savedValues.get(2));
            this.isOnline = savedValues.get(3);

        }

    }
}
