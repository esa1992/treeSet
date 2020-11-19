package com.myCompany;

public class FirstAidKit {

    private String name;
    private double coast;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public FirstAidKit(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }
}
