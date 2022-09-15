package com.peaksoft.database;

import com.peaksoft.JsonUtils;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.sql.Driver;

import static com.peaksoft.Main.GSON;

public class TruckData {
    private int id;
    private String name;
    private String driver;
    private String state;

    public TruckData(int id, String name, String driver, String state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id + "| " + name +"| " + "         |" + state;
    }
    public  static void infoDriver(Path path) {
        System.out.println("#  | Bus       |  Driver  |  State");
  
    }
}
