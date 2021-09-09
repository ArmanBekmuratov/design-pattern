package com.arman.basepatterns.creational.buider;

public abstract class HouseBuilder {
    House house;

    void createHouse() {
        house = new House();
    }

    abstract void buildName();
    abstract void buildMaterial();
    abstract void buildCost();

    House getHouse() {
        return house;
    }
}
