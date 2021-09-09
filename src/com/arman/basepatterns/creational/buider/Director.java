package com.arman.basepatterns.creational.buider;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {
        builder.createHouse();
        builder.buildName();
        builder.buildMaterial();
        builder.buildCost();
        return builder.getHouse();
    }
}
