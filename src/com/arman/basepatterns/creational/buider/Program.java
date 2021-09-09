package com.arman.basepatterns.creational.buider;

public class Program {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new WoodHouseBuilder());
        House house = director.buildHouse();
        System.out.println(house);
    }
}
