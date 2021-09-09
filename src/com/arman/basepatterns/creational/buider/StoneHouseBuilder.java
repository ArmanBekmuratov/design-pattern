package com.arman.basepatterns.creational.buider;

public class StoneHouseBuilder extends HouseBuilder{
    @Override
    void buildName() {
        house.setName("Stone house");
    }

    @Override
    void buildMaterial() {
        house.setMaterial(Material.STONE);
    }

    @Override
    void buildCost() {
        house.setCost(1000);
    }
}
