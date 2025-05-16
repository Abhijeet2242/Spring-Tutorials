package com.example.Spring.dependencyInjection;

public class Mobile {
    private Brand brand;
    private MobileParts mobileParts;

    public Mobile() {
        // default constructor required for setter-based injection
    }

    //using constructor Di
    public Mobile(Brand brand, MobileParts mobileParts) {
        this.brand = brand;
        this.mobileParts = mobileParts;
    }

    // using setter method DI


    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setMobileParts(MobileParts mobileParts) {
        this.mobileParts = mobileParts;
    }

    public  void show(){
        System.out.println("Brand : " + brand.brandName());
        if (brand instanceof Company) {
            Company company = (Company) brand;
            System.out.println("Model: " + company.getModelName());
        }
        System.out.println("Price : " + brand.price());
        System.out.println("Camera : " + mobileParts.getCamera());
        System.out.println("processor : " + mobileParts.getProcessor());
        System.out.println("Sterio speakers : " + (mobileParts.getSterio() ? "yes" : "No"));

    }
}
