package com.arman.basepatterns.creational.buider;

public class WoodHouseBuilder extends HouseBuilder{
    @Override
    void buildName() {
        house.setName("WoodHouse");
    }

    @Override
    void buildMaterial()  {
        house.setMaterial(Material.WOOD);
    }

    @Override
    void buildCost() {
        house.setCost(500);
    }
}
