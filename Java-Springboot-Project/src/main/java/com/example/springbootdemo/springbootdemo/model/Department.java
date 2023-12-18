package com.example.springbootdemo.springbootdemo.model;

public class Department {

    public String getDepid() {
        return Depid;
    }

    public void setDepid(String depid) {
        Depid = depid;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String depName) {
        DepName = depName;
    }

    public String getDepLocation() {
        return DepLocation;
    }

    public void setDepLocation(String depLocation) {
        DepLocation = depLocation;
    }

    private String Depid;

    private String DepName;

    private String DepLocation;

}
