package com.example.Spring.dependencyInjection;

public class Company implements Brand{
    private String modelName;
    private double price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String brandName() {
        return "Vivo";
    }

    @Override
    public double price() {
        return price;
    }
}
